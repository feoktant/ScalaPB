// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.wrappers

/** Wrapper message for `int64`.
  *
  * The JSON representation for `Int64Value` is JSON string.
  *
  * @param value
  *   The int64 value.
  */
@SerialVersionUID(0L)
final case class Int64Value(
    value: Long = 0L
    ) extends scalapb.GeneratedMessage with scalapb.Message[Int64Value] with scalapb.lenses.Updatable[Int64Value] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (value != 0L) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt64Size(1, value) }
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
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      {
        val __v = value
        if (__v != 0L) {
          _output__.writeInt64(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.wrappers.Int64Value = {
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __value = _input__.readInt64()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.wrappers.Int64Value(
          value = __value
      )
    }
    def withValue(__v: Long): Int64Value = copy(value = __v)
    def getFieldByNumber(__fieldNumber: Int): scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = value
          if (__t != 0L) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PLong(value)
      }
    }
    override def toString: String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.wrappers.Int64Value
}

object Int64Value extends scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.Int64Value] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.Int64Value] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.wrappers.Int64Value = {
    require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.protobuf.wrappers.Int64Value(
      __fieldsMap.getOrElse(__fields.get(0), 0L).asInstanceOf[Long]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.protobuf.wrappers.Int64Value] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.protobuf.wrappers.Int64Value(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[Long]).getOrElse(0L)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = WrappersProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = WrappersProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.protobuf.wrappers.Int64Value(
  )
  implicit class Int64ValueLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.wrappers.Int64Value]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.protobuf.wrappers.Int64Value](_l) {
    def value: _root_.scalapb.lenses.Lens[UpperPB, Long] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
}
