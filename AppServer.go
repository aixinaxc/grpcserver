package main

import (
	"net"
	"fmt"
	"google.golang.org/grpc"
	"golang.org/x/net/context"
	"grpctest/testg"
	"io"
)

func main() {
	listen,err := net.Listen("tcp",":50052")
	if err != nil {
		fmt.Println(err)
	}
	s := grpc.NewServer()
	testg.RegisterUserServerServer(s,&UserServer{})
	fmt.Println("启动")
	s.Serve(listen)
}

func testListFunc() *testg.UserList {
	uList := new(testg.UserList)
	u := new(testg.User)
	u.UserId = "1"
	u.UserName = "小王"
	u.Age = 20
	uList.U = append(uList.U,u)
	u1 := new(testg.User)
	u1.UserId = "2"
	u1.UserName = "小张"
	u1.Age = 15
	uList.U = append(uList.U,u1)
	//fmt.Println(uList)
	return uList
}

type UserServer struct {

}

func (u *UserServer) GetUserById(c context.Context,user *testg.User) (*testg.User, error) {
	userId := user.UserId
	if userId == "" {
		return nil, nil
	}
	fmt.Println("userId:", userId)
	ul := testListFunc()
	for _,v := range ul.U{
		if v.UserId == user.UserId {
			return v, nil
		}
	}
	return nil, nil
}

func (u *UserServer) GetList(c context.Context,e *testg.Empty) (*testg.UserList, error) {
	return testListFunc(),nil
}

func (u *UserServer) GetListStream(e *testg.Empty, us testg.UserServer_GetListStreamServer) error {
	ul := testListFunc()
	for _,v := range ul.U{
		us.Send(v)
	}
	return nil
}

func (u *UserServer) SetUserStream(us testg.UserServer_SetUserStreamServer) error {
	for {
		user,err := us.Recv()
		if err == io.EOF {
			return us.SendAndClose(testListFunc())
		}
		if err != nil {
			return err
		}
		fmt.Println("user", user)
		fmt.Println(user.UserName)
	}
	return nil
}

func (u *UserServer) Chat(us testg.UserServer_ChatServer) error {
	for {
		user,err := us.Recv()
		if err == io.EOF {
			return nil
		}
		fmt.Println("user",user)
		us.Send(user)
	}
	return nil
}