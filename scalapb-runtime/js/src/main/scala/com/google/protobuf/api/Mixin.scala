// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.api



/** Declares an API to be included in this API. The including API must
  * redeclare all the methods from the included API, but documentation
  * and options are inherited as follows:
  *
  * - If after comment and whitespace stripping, the documentation
  *   string of the redeclared method is empty, it will be inherited
  *   from the original method.
  *
  * - Each annotation belonging to the service config (http,
  *   visibility) which is not set in the redeclared method will be
  *   inherited.
  *
  * - If an http annotation is inherited, the path pattern will be
  *   modified as follows. Any version prefix will be replaced by the
  *   version of the including API plus the [root][] path if specified.
  *
  * Example of a simple mixin:
  *
  *     package google.acl.v1;
  *     service AccessControl {
  *       // Get the underlying ACL object.
  *       rpc GetAcl(GetAclRequest) returns (Acl) {
  *         option (google.api.http).get = "/v1/{resource=**}:getAcl";
  *       }
  *     }
  *
  *     package google.storage.v2;
  *     service Storage {
  *       rpc GetAcl(GetAclRequest) returns (Acl);
  *
  *       // Get a data record.
  *       rpc GetData(GetDataRequest) returns (Data) {
  *         option (google.api.http).get = "/v2/{resource=**}";
  *       }
  *     }
  *
  * Example of a mixin configuration:
  *
  *     apis:
  *     - name: google.storage.v2.Storage
  *       mixins:
  *       - name: google.acl.v1.AccessControl
  *
  * The mixin construct implies that all methods in `AccessControl` are
  * also declared with same name and request/response types in
  * `Storage`. A documentation generator or annotation processor will
  * see the effective `Storage.GetAcl` method after inherting
  * documentation and annotations as follows:
  *
  *     service Storage {
  *       // Get the underlying ACL object.
  *       rpc GetAcl(GetAclRequest) returns (Acl) {
  *         option (google.api.http).get = "/v2/{resource=**}:getAcl";
  *       }
  *       ...
  *     }
  *
  * Note how the version in the path pattern changed from `v1` to `v2`.
  *
  * If the `root` field in the mixin is specified, it should be a
  * relative path under which inherited HTTP paths are placed. Example:
  *
  *     apis:
  *     - name: google.storage.v2.Storage
  *       mixins:
  *       - name: google.acl.v1.AccessControl
  *         root: acls
  *
  * This implies the following inherited HTTP annotation:
  *
  *     service Storage {
  *       // Get the underlying ACL object.
  *       rpc GetAcl(GetAclRequest) returns (Acl) {
  *         option (google.api.http).get = "/v2/acls/{resource=**}:getAcl";
  *       }
  *       ...
  *     }
  *
  * @param name
  *   The fully qualified name of the API which is included.
  * @param root
  *   If non-empty specifies a path under which inherited HTTP paths
  *   are rooted.
  */
@SerialVersionUID(0L)
final case class Mixin(
    name: String = "",
    root: String = ""
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Mixin] with com.trueaccord.lenses.Updatable[Mixin] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, name) }
      if (root != "") { __size += com.google.protobuf.CodedOutputStream.computeStringSize(2, root) }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = root
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.api.Mixin = {
      var __name = this.name
      var __root = this.root
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __root = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.api.Mixin(
          name = __name,
          root = __root
      )
    }
    def withName(__v: String): Mixin = copy(name = __v)
    def withRoot(__v: String): Mixin = copy(root = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = root
          if (__t != "") __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.api.Mixin
}

object Mixin extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.api.Mixin] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.api.Mixin] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.api.Mixin = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.api.Mixin(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[String]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = ApiProto.descriptor.getMessageTypes.get(2)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.api.Mixin(
  )
  implicit class MixinLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.api.Mixin]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.api.Mixin](_l) {
    def name: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def root: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.root)((c_, f_) => c_.copy(root = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val ROOT_FIELD_NUMBER = 2
}
