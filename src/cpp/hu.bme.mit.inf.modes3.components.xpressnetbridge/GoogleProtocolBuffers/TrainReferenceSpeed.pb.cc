// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrainReferenceSpeed.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "TrainReferenceSpeed.pb.h"

#include <algorithm>

#include <google/protobuf/stubs/common.h>
#include <google/protobuf/stubs/port.h>
#include <google/protobuf/stubs/once.h>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/wire_format_lite_inl.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)

namespace modes3 {
namespace protobuf {
class TrainReferenceSpeedDefaultTypeInternal {
public:
 ::google::protobuf::internal::ExplicitlyConstructed<TrainReferenceSpeed>
     _instance;
} _TrainReferenceSpeed_default_instance_;

namespace protobuf_TrainReferenceSpeed_2eproto {


namespace {

::google::protobuf::Metadata file_level_metadata[1];

}  // namespace

PROTOBUF_CONSTEXPR_VAR ::google::protobuf::internal::ParseTableField
    const TableStruct::entries[] GOOGLE_ATTRIBUTE_SECTION_VARIABLE(protodesc_cold) = {
  {0, 0, 0, ::google::protobuf::internal::kInvalidMask, 0, 0},
};

PROTOBUF_CONSTEXPR_VAR ::google::protobuf::internal::AuxillaryParseTableField
    const TableStruct::aux[] GOOGLE_ATTRIBUTE_SECTION_VARIABLE(protodesc_cold) = {
  ::google::protobuf::internal::AuxillaryParseTableField(),
};
PROTOBUF_CONSTEXPR_VAR ::google::protobuf::internal::ParseTable const
    TableStruct::schema[] GOOGLE_ATTRIBUTE_SECTION_VARIABLE(protodesc_cold) = {
  { NULL, NULL, 0, -1, -1, -1, -1, NULL, false },
};

const ::google::protobuf::uint32 TableStruct::offsets[] GOOGLE_ATTRIBUTE_SECTION_VARIABLE(protodesc_cold) = {
  ~0u,  // no _has_bits_
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TrainReferenceSpeed, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TrainReferenceSpeed, trainid_),
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TrainReferenceSpeed, referencespeed_),
  GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TrainReferenceSpeed, direction_),
};
static const ::google::protobuf::internal::MigrationSchema schemas[] GOOGLE_ATTRIBUTE_SECTION_VARIABLE(protodesc_cold) = {
  { 0, -1, sizeof(TrainReferenceSpeed)},
};

static ::google::protobuf::Message const * const file_default_instances[] = {
  reinterpret_cast<const ::google::protobuf::Message*>(&_TrainReferenceSpeed_default_instance_),
};

namespace {

void protobuf_AssignDescriptors() {
  AddDescriptors();
  ::google::protobuf::MessageFactory* factory = NULL;
  AssignDescriptors(
      "TrainReferenceSpeed.proto", schemas, file_default_instances, TableStruct::offsets, factory,
      file_level_metadata, NULL, NULL);
}

void protobuf_AssignDescriptorsOnce() {
  static GOOGLE_PROTOBUF_DECLARE_ONCE(once);
  ::google::protobuf::GoogleOnceInit(&once, &protobuf_AssignDescriptors);
}

void protobuf_RegisterTypes(const ::std::string&) GOOGLE_ATTRIBUTE_COLD;
void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::internal::RegisterAllTypes(file_level_metadata, 1);
}

}  // namespace
void TableStruct::InitDefaultsImpl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::google::protobuf::internal::InitProtobufDefaults();
  ::modes3::protobuf::protobuf_Enums_2eproto::InitDefaults();
  _TrainReferenceSpeed_default_instance_._instance.DefaultConstruct();
  ::google::protobuf::internal::OnShutdownDestroyMessage(
      &_TrainReferenceSpeed_default_instance_);}

void InitDefaults() {
  static GOOGLE_PROTOBUF_DECLARE_ONCE(once);
  ::google::protobuf::GoogleOnceInit(&once, &TableStruct::InitDefaultsImpl);
}
namespace {
void AddDescriptorsImpl() {
  InitDefaults();
  static const char descriptor[] GOOGLE_ATTRIBUTE_SECTION_VARIABLE(protodesc_cold) = {
      "\n\031TrainReferenceSpeed.proto\022\017modes3.prot"
      "obuf\032\013Enums.proto\"w\n\023TrainReferenceSpeed"
      "\022\017\n\007trainID\030\001 \001(\r\022\026\n\016referenceSpeed\030\002 \001("
      "\005\0227\n\tdirection\030\003 \001(\0162$.modes3.protobuf.T"
      "rainDirectionValueB2\n.hu.bme.mit.inf.mod"
      "es3.messaging.proto.messagesP\001b\006proto3"
  };
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
      descriptor, 238);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "TrainReferenceSpeed.proto", &protobuf_RegisterTypes);
  ::modes3::protobuf::protobuf_Enums_2eproto::AddDescriptors();
}
} // anonymous namespace

void AddDescriptors() {
  static GOOGLE_PROTOBUF_DECLARE_ONCE(once);
  ::google::protobuf::GoogleOnceInit(&once, &AddDescriptorsImpl);
}
// Force AddDescriptors() to be called at dynamic initialization time.
struct StaticDescriptorInitializer {
  StaticDescriptorInitializer() {
    AddDescriptors();
  }
} static_descriptor_initializer;

}  // namespace protobuf_TrainReferenceSpeed_2eproto


// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int TrainReferenceSpeed::kTrainIDFieldNumber;
const int TrainReferenceSpeed::kReferenceSpeedFieldNumber;
const int TrainReferenceSpeed::kDirectionFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

TrainReferenceSpeed::TrainReferenceSpeed()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  if (GOOGLE_PREDICT_TRUE(this != internal_default_instance())) {
    protobuf_TrainReferenceSpeed_2eproto::InitDefaults();
  }
  SharedCtor();
  // @@protoc_insertion_point(constructor:modes3.protobuf.TrainReferenceSpeed)
}
TrainReferenceSpeed::TrainReferenceSpeed(const TrainReferenceSpeed& from)
  : ::google::protobuf::Message(),
      _internal_metadata_(NULL),
      _cached_size_(0) {
  _internal_metadata_.MergeFrom(from._internal_metadata_);
  ::memcpy(&trainid_, &from.trainid_,
    static_cast<size_t>(reinterpret_cast<char*>(&direction_) -
    reinterpret_cast<char*>(&trainid_)) + sizeof(direction_));
  // @@protoc_insertion_point(copy_constructor:modes3.protobuf.TrainReferenceSpeed)
}

void TrainReferenceSpeed::SharedCtor() {
  ::memset(&trainid_, 0, static_cast<size_t>(
      reinterpret_cast<char*>(&direction_) -
      reinterpret_cast<char*>(&trainid_)) + sizeof(direction_));
  _cached_size_ = 0;
}

TrainReferenceSpeed::~TrainReferenceSpeed() {
  // @@protoc_insertion_point(destructor:modes3.protobuf.TrainReferenceSpeed)
  SharedDtor();
}

void TrainReferenceSpeed::SharedDtor() {
}

void TrainReferenceSpeed::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* TrainReferenceSpeed::descriptor() {
  protobuf_TrainReferenceSpeed_2eproto::protobuf_AssignDescriptorsOnce();
  return protobuf_TrainReferenceSpeed_2eproto::file_level_metadata[kIndexInFileMessages].descriptor;
}

const TrainReferenceSpeed& TrainReferenceSpeed::default_instance() {
  protobuf_TrainReferenceSpeed_2eproto::InitDefaults();
  return *internal_default_instance();
}

TrainReferenceSpeed* TrainReferenceSpeed::New(::google::protobuf::Arena* arena) const {
  TrainReferenceSpeed* n = new TrainReferenceSpeed;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void TrainReferenceSpeed::Clear() {
// @@protoc_insertion_point(message_clear_start:modes3.protobuf.TrainReferenceSpeed)
  ::google::protobuf::uint32 cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  ::memset(&trainid_, 0, static_cast<size_t>(
      reinterpret_cast<char*>(&direction_) -
      reinterpret_cast<char*>(&trainid_)) + sizeof(direction_));
  _internal_metadata_.Clear();
}

bool TrainReferenceSpeed::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:modes3.protobuf.TrainReferenceSpeed)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoffNoLastTag(127u);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // uint32 trainID = 1;
      case 1: {
        if (static_cast< ::google::protobuf::uint8>(tag) ==
            static_cast< ::google::protobuf::uint8>(8u /* 8 & 0xFF */)) {

          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::uint32, ::google::protobuf::internal::WireFormatLite::TYPE_UINT32>(
                 input, &trainid_)));
        } else {
          goto handle_unusual;
        }
        break;
      }

      // int32 referenceSpeed = 2;
      case 2: {
        if (static_cast< ::google::protobuf::uint8>(tag) ==
            static_cast< ::google::protobuf::uint8>(16u /* 16 & 0xFF */)) {

          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::int32, ::google::protobuf::internal::WireFormatLite::TYPE_INT32>(
                 input, &referencespeed_)));
        } else {
          goto handle_unusual;
        }
        break;
      }

      // .modes3.protobuf.TrainDirectionValue direction = 3;
      case 3: {
        if (static_cast< ::google::protobuf::uint8>(tag) ==
            static_cast< ::google::protobuf::uint8>(24u /* 24 & 0xFF */)) {
          int value;
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   int, ::google::protobuf::internal::WireFormatLite::TYPE_ENUM>(
                 input, &value)));
          set_direction(static_cast< ::modes3::protobuf::TrainDirectionValue >(value));
        } else {
          goto handle_unusual;
        }
        break;
      }

      default: {
      handle_unusual:
        if (tag == 0) {
          goto success;
        }
        DO_(::google::protobuf::internal::WireFormat::SkipField(
              input, tag, _internal_metadata_.mutable_unknown_fields()));
        break;
      }
    }
  }
success:
  // @@protoc_insertion_point(parse_success:modes3.protobuf.TrainReferenceSpeed)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:modes3.protobuf.TrainReferenceSpeed)
  return false;
#undef DO_
}

void TrainReferenceSpeed::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:modes3.protobuf.TrainReferenceSpeed)
  ::google::protobuf::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // uint32 trainID = 1;
  if (this->trainid() != 0) {
    ::google::protobuf::internal::WireFormatLite::WriteUInt32(1, this->trainid(), output);
  }

  // int32 referenceSpeed = 2;
  if (this->referencespeed() != 0) {
    ::google::protobuf::internal::WireFormatLite::WriteInt32(2, this->referencespeed(), output);
  }

  // .modes3.protobuf.TrainDirectionValue direction = 3;
  if (this->direction() != 0) {
    ::google::protobuf::internal::WireFormatLite::WriteEnum(
      3, this->direction(), output);
  }

  if ((_internal_metadata_.have_unknown_fields() &&  ::google::protobuf::internal::GetProto3PreserveUnknownsDefault())) {
    ::google::protobuf::internal::WireFormat::SerializeUnknownFields(
        (::google::protobuf::internal::GetProto3PreserveUnknownsDefault()   ? _internal_metadata_.unknown_fields()   : _internal_metadata_.default_instance()), output);
  }
  // @@protoc_insertion_point(serialize_end:modes3.protobuf.TrainReferenceSpeed)
}

::google::protobuf::uint8* TrainReferenceSpeed::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  (void)deterministic; // Unused
  // @@protoc_insertion_point(serialize_to_array_start:modes3.protobuf.TrainReferenceSpeed)
  ::google::protobuf::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  // uint32 trainID = 1;
  if (this->trainid() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::WriteUInt32ToArray(1, this->trainid(), target);
  }

  // int32 referenceSpeed = 2;
  if (this->referencespeed() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::WriteInt32ToArray(2, this->referencespeed(), target);
  }

  // .modes3.protobuf.TrainDirectionValue direction = 3;
  if (this->direction() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::WriteEnumToArray(
      3, this->direction(), target);
  }

  if ((_internal_metadata_.have_unknown_fields() &&  ::google::protobuf::internal::GetProto3PreserveUnknownsDefault())) {
    target = ::google::protobuf::internal::WireFormat::SerializeUnknownFieldsToArray(
        (::google::protobuf::internal::GetProto3PreserveUnknownsDefault()   ? _internal_metadata_.unknown_fields()   : _internal_metadata_.default_instance()), target);
  }
  // @@protoc_insertion_point(serialize_to_array_end:modes3.protobuf.TrainReferenceSpeed)
  return target;
}

size_t TrainReferenceSpeed::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:modes3.protobuf.TrainReferenceSpeed)
  size_t total_size = 0;

  if ((_internal_metadata_.have_unknown_fields() &&  ::google::protobuf::internal::GetProto3PreserveUnknownsDefault())) {
    total_size +=
      ::google::protobuf::internal::WireFormat::ComputeUnknownFieldsSize(
        (::google::protobuf::internal::GetProto3PreserveUnknownsDefault()   ? _internal_metadata_.unknown_fields()   : _internal_metadata_.default_instance()));
  }
  // uint32 trainID = 1;
  if (this->trainid() != 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::UInt32Size(
        this->trainid());
  }

  // int32 referenceSpeed = 2;
  if (this->referencespeed() != 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::Int32Size(
        this->referencespeed());
  }

  // .modes3.protobuf.TrainDirectionValue direction = 3;
  if (this->direction() != 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::EnumSize(this->direction());
  }

  int cached_size = ::google::protobuf::internal::ToCachedSize(total_size);
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = cached_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void TrainReferenceSpeed::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:modes3.protobuf.TrainReferenceSpeed)
  GOOGLE_DCHECK_NE(&from, this);
  const TrainReferenceSpeed* source =
      ::google::protobuf::internal::DynamicCastToGenerated<const TrainReferenceSpeed>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:modes3.protobuf.TrainReferenceSpeed)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:modes3.protobuf.TrainReferenceSpeed)
    MergeFrom(*source);
  }
}

void TrainReferenceSpeed::MergeFrom(const TrainReferenceSpeed& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:modes3.protobuf.TrainReferenceSpeed)
  GOOGLE_DCHECK_NE(&from, this);
  _internal_metadata_.MergeFrom(from._internal_metadata_);
  ::google::protobuf::uint32 cached_has_bits = 0;
  (void) cached_has_bits;

  if (from.trainid() != 0) {
    set_trainid(from.trainid());
  }
  if (from.referencespeed() != 0) {
    set_referencespeed(from.referencespeed());
  }
  if (from.direction() != 0) {
    set_direction(from.direction());
  }
}

void TrainReferenceSpeed::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:modes3.protobuf.TrainReferenceSpeed)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void TrainReferenceSpeed::CopyFrom(const TrainReferenceSpeed& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:modes3.protobuf.TrainReferenceSpeed)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool TrainReferenceSpeed::IsInitialized() const {
  return true;
}

void TrainReferenceSpeed::Swap(TrainReferenceSpeed* other) {
  if (other == this) return;
  InternalSwap(other);
}
void TrainReferenceSpeed::InternalSwap(TrainReferenceSpeed* other) {
  using std::swap;
  swap(trainid_, other->trainid_);
  swap(referencespeed_, other->referencespeed_);
  swap(direction_, other->direction_);
  _internal_metadata_.Swap(&other->_internal_metadata_);
  swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata TrainReferenceSpeed::GetMetadata() const {
  protobuf_TrainReferenceSpeed_2eproto::protobuf_AssignDescriptorsOnce();
  return protobuf_TrainReferenceSpeed_2eproto::file_level_metadata[kIndexInFileMessages];
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// TrainReferenceSpeed

// uint32 trainID = 1;
void TrainReferenceSpeed::clear_trainid() {
  trainid_ = 0u;
}
::google::protobuf::uint32 TrainReferenceSpeed::trainid() const {
  // @@protoc_insertion_point(field_get:modes3.protobuf.TrainReferenceSpeed.trainID)
  return trainid_;
}
void TrainReferenceSpeed::set_trainid(::google::protobuf::uint32 value) {
  
  trainid_ = value;
  // @@protoc_insertion_point(field_set:modes3.protobuf.TrainReferenceSpeed.trainID)
}

// int32 referenceSpeed = 2;
void TrainReferenceSpeed::clear_referencespeed() {
  referencespeed_ = 0;
}
::google::protobuf::int32 TrainReferenceSpeed::referencespeed() const {
  // @@protoc_insertion_point(field_get:modes3.protobuf.TrainReferenceSpeed.referenceSpeed)
  return referencespeed_;
}
void TrainReferenceSpeed::set_referencespeed(::google::protobuf::int32 value) {
  
  referencespeed_ = value;
  // @@protoc_insertion_point(field_set:modes3.protobuf.TrainReferenceSpeed.referenceSpeed)
}

// .modes3.protobuf.TrainDirectionValue direction = 3;
void TrainReferenceSpeed::clear_direction() {
  direction_ = 0;
}
::modes3::protobuf::TrainDirectionValue TrainReferenceSpeed::direction() const {
  // @@protoc_insertion_point(field_get:modes3.protobuf.TrainReferenceSpeed.direction)
  return static_cast< ::modes3::protobuf::TrainDirectionValue >(direction_);
}
void TrainReferenceSpeed::set_direction(::modes3::protobuf::TrainDirectionValue value) {
  
  direction_ = value;
  // @@protoc_insertion_point(field_set:modes3.protobuf.TrainReferenceSpeed.direction)
}

#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)

}  // namespace protobuf
}  // namespace modes3

// @@protoc_insertion_point(global_scope)
