// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: testg/user_server.proto

package testg;

public final class UserServerOuterClass {
  private UserServerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027testg/user_server.proto\022\005testg\032\023testg/" +
      "user_vo.proto2\344\001\n\nUserServer\022\'\n\013GetUserB" +
      "yId\022\013.testg.User\032\013.testg.User\022(\n\007GetList" +
      "\022\014.testg.Empty\032\017.testg.UserList\022,\n\rGetLi" +
      "stStream\022\014.testg.Empty\032\013.testg.User0\001\022/\n" +
      "\rSetUserStream\022\013.testg.User\032\017.testg.User" +
      "List(\001\022$\n\004Chat\022\013.testg.User\032\013.testg.User" +
      "(\0010\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          testg.UserVo.getDescriptor(),
        }, assigner);
    testg.UserVo.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}