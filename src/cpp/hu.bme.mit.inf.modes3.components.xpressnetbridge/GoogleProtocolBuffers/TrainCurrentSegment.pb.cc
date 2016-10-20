// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrainCurrentSegment.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "TrainCurrentSegment.pb.h"

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

namespace {

const ::google::protobuf::Descriptor* TrainCurrentSegment_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  TrainCurrentSegment_reflection_ = NULL;

}  // namespace


void protobuf_AssignDesc_TrainCurrentSegment_2eproto() GOOGLE_ATTRIBUTE_COLD;
void protobuf_AssignDesc_TrainCurrentSegment_2eproto() {
  protobuf_AddDesc_TrainCurrentSegment_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "TrainCurrentSegment.proto");
  GOOGLE_CHECK(file != NULL);
  TrainCurrentSegment_descriptor_ = file->message_type(0);
  static const int TrainCurrentSegment_offsets_[2] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TrainCurrentSegment, trainid_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TrainCurrentSegment, turnoutid_),
  };
  TrainCurrentSegment_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      TrainCurrentSegment_descriptor_,
      TrainCurrentSegment::internal_default_instance(),
      TrainCurrentSegment_offsets_,
      -1,
      -1,
      -1,
      sizeof(TrainCurrentSegment),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TrainCurrentSegment, _internal_metadata_));
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_TrainCurrentSegment_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) GOOGLE_ATTRIBUTE_COLD;
void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      TrainCurrentSegment_descriptor_, TrainCurrentSegment::internal_default_instance());
}

}  // namespace

void protobuf_ShutdownFile_TrainCurrentSegment_2eproto() {
  TrainCurrentSegment_default_instance_.Shutdown();
  delete TrainCurrentSegment_reflection_;
}

void protobuf_InitDefaults_TrainCurrentSegment_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  TrainCurrentSegment_default_instance_.DefaultConstruct();
  TrainCurrentSegment_default_instance_.get_mutable()->InitAsDefaultInstance();
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_InitDefaults_TrainCurrentSegment_2eproto_once_);
void protobuf_InitDefaults_TrainCurrentSegment_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_InitDefaults_TrainCurrentSegment_2eproto_once_,
                 &protobuf_InitDefaults_TrainCurrentSegment_2eproto_impl);
}
void protobuf_AddDesc_TrainCurrentSegment_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  protobuf_InitDefaults_TrainCurrentSegment_2eproto();
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n\031TrainCurrentSegment.proto\022\017modes3.prot"
    "obuf\"9\n\023TrainCurrentSegment\022\017\n\007trainID\030\001"
    " \001(\r\022\021\n\tturnoutID\030\002 \001(\rB0\n,hu.bme.mit.in"
    "f.modes3.messaging.mms.messagesP\001b\006proto"
    "3", 161);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "TrainCurrentSegment.proto", &protobuf_RegisterTypes);
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_TrainCurrentSegment_2eproto);
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AddDesc_TrainCurrentSegment_2eproto_once_);
void protobuf_AddDesc_TrainCurrentSegment_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AddDesc_TrainCurrentSegment_2eproto_once_,
                 &protobuf_AddDesc_TrainCurrentSegment_2eproto_impl);
}
// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_TrainCurrentSegment_2eproto {
  StaticDescriptorInitializer_TrainCurrentSegment_2eproto() {
    protobuf_AddDesc_TrainCurrentSegment_2eproto();
  }
} static_descriptor_initializer_TrainCurrentSegment_2eproto_;

namespace {

static void MergeFromFail(int line) GOOGLE_ATTRIBUTE_COLD GOOGLE_ATTRIBUTE_NORETURN;
static void MergeFromFail(int line) {
  ::google::protobuf::internal::MergeFromFail(__FILE__, line);
}

}  // namespace


// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int TrainCurrentSegment::kTrainIDFieldNumber;
const int TrainCurrentSegment::kTurnoutIDFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

TrainCurrentSegment::TrainCurrentSegment()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  if (this != internal_default_instance()) protobuf_InitDefaults_TrainCurrentSegment_2eproto();
  SharedCtor();
  // @@protoc_insertion_point(constructor:modes3.protobuf.TrainCurrentSegment)
}

void TrainCurrentSegment::InitAsDefaultInstance() {
}

TrainCurrentSegment::TrainCurrentSegment(const TrainCurrentSegment& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  UnsafeMergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:modes3.protobuf.TrainCurrentSegment)
}

void TrainCurrentSegment::SharedCtor() {
  ::memset(&trainid_, 0, reinterpret_cast<char*>(&turnoutid_) -
    reinterpret_cast<char*>(&trainid_) + sizeof(turnoutid_));
  _cached_size_ = 0;
}

TrainCurrentSegment::~TrainCurrentSegment() {
  // @@protoc_insertion_point(destructor:modes3.protobuf.TrainCurrentSegment)
  SharedDtor();
}

void TrainCurrentSegment::SharedDtor() {
}

void TrainCurrentSegment::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* TrainCurrentSegment::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return TrainCurrentSegment_descriptor_;
}

const TrainCurrentSegment& TrainCurrentSegment::default_instance() {
  protobuf_InitDefaults_TrainCurrentSegment_2eproto();
  return *internal_default_instance();
}

::google::protobuf::internal::ExplicitlyConstructed<TrainCurrentSegment> TrainCurrentSegment_default_instance_;

TrainCurrentSegment* TrainCurrentSegment::New(::google::protobuf::Arena* arena) const {
  TrainCurrentSegment* n = new TrainCurrentSegment;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void TrainCurrentSegment::Clear() {
// @@protoc_insertion_point(message_clear_start:modes3.protobuf.TrainCurrentSegment)
#if defined(__clang__)
#define ZR_HELPER_(f) \
  _Pragma("clang diagnostic push") \
  _Pragma("clang diagnostic ignored \"-Winvalid-offsetof\"") \
  __builtin_offsetof(TrainCurrentSegment, f) \
  _Pragma("clang diagnostic pop")
#else
#define ZR_HELPER_(f) reinterpret_cast<char*>(\
  &reinterpret_cast<TrainCurrentSegment*>(16)->f)
#endif

#define ZR_(first, last) do {\
  ::memset(&(first), 0,\
           ZR_HELPER_(last) - ZR_HELPER_(first) + sizeof(last));\
} while (0)

  ZR_(trainid_, turnoutid_);

#undef ZR_HELPER_
#undef ZR_

}

bool TrainCurrentSegment::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:modes3.protobuf.TrainCurrentSegment)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // optional uint32 trainID = 1;
      case 1: {
        if (tag == 8) {

          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::uint32, ::google::protobuf::internal::WireFormatLite::TYPE_UINT32>(
                 input, &trainid_)));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectTag(16)) goto parse_turnoutID;
        break;
      }

      // optional uint32 turnoutID = 2;
      case 2: {
        if (tag == 16) {
         parse_turnoutID:

          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::uint32, ::google::protobuf::internal::WireFormatLite::TYPE_UINT32>(
                 input, &turnoutid_)));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectAtEnd()) goto success;
        break;
      }

      default: {
      handle_unusual:
        if (tag == 0 ||
            ::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          goto success;
        }
        DO_(::google::protobuf::internal::WireFormatLite::SkipField(input, tag));
        break;
      }
    }
  }
success:
  // @@protoc_insertion_point(parse_success:modes3.protobuf.TrainCurrentSegment)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:modes3.protobuf.TrainCurrentSegment)
  return false;
#undef DO_
}

void TrainCurrentSegment::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:modes3.protobuf.TrainCurrentSegment)
  // optional uint32 trainID = 1;
  if (this->trainid() != 0) {
    ::google::protobuf::internal::WireFormatLite::WriteUInt32(1, this->trainid(), output);
  }

  // optional uint32 turnoutID = 2;
  if (this->turnoutid() != 0) {
    ::google::protobuf::internal::WireFormatLite::WriteUInt32(2, this->turnoutid(), output);
  }

  // @@protoc_insertion_point(serialize_end:modes3.protobuf.TrainCurrentSegment)
}

::google::protobuf::uint8* TrainCurrentSegment::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  (void)deterministic; // Unused
  // @@protoc_insertion_point(serialize_to_array_start:modes3.protobuf.TrainCurrentSegment)
  // optional uint32 trainID = 1;
  if (this->trainid() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::WriteUInt32ToArray(1, this->trainid(), target);
  }

  // optional uint32 turnoutID = 2;
  if (this->turnoutid() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::WriteUInt32ToArray(2, this->turnoutid(), target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:modes3.protobuf.TrainCurrentSegment)
  return target;
}

size_t TrainCurrentSegment::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:modes3.protobuf.TrainCurrentSegment)
  size_t total_size = 0;

  // optional uint32 trainID = 1;
  if (this->trainid() != 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::UInt32Size(
        this->trainid());
  }

  // optional uint32 turnoutID = 2;
  if (this->turnoutid() != 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::UInt32Size(
        this->turnoutid());
  }

  int cached_size = ::google::protobuf::internal::ToCachedSize(total_size);
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = cached_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void TrainCurrentSegment::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:modes3.protobuf.TrainCurrentSegment)
  if (GOOGLE_PREDICT_FALSE(&from == this)) MergeFromFail(__LINE__);
  const TrainCurrentSegment* source =
      ::google::protobuf::internal::DynamicCastToGenerated<const TrainCurrentSegment>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:modes3.protobuf.TrainCurrentSegment)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:modes3.protobuf.TrainCurrentSegment)
    UnsafeMergeFrom(*source);
  }
}

void TrainCurrentSegment::MergeFrom(const TrainCurrentSegment& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:modes3.protobuf.TrainCurrentSegment)
  if (GOOGLE_PREDICT_TRUE(&from != this)) {
    UnsafeMergeFrom(from);
  } else {
    MergeFromFail(__LINE__);
  }
}

void TrainCurrentSegment::UnsafeMergeFrom(const TrainCurrentSegment& from) {
  GOOGLE_DCHECK(&from != this);
  if (from.trainid() != 0) {
    set_trainid(from.trainid());
  }
  if (from.turnoutid() != 0) {
    set_turnoutid(from.turnoutid());
  }
}

void TrainCurrentSegment::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:modes3.protobuf.TrainCurrentSegment)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void TrainCurrentSegment::CopyFrom(const TrainCurrentSegment& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:modes3.protobuf.TrainCurrentSegment)
  if (&from == this) return;
  Clear();
  UnsafeMergeFrom(from);
}

bool TrainCurrentSegment::IsInitialized() const {

  return true;
}

void TrainCurrentSegment::Swap(TrainCurrentSegment* other) {
  if (other == this) return;
  InternalSwap(other);
}
void TrainCurrentSegment::InternalSwap(TrainCurrentSegment* other) {
  std::swap(trainid_, other->trainid_);
  std::swap(turnoutid_, other->turnoutid_);
  _internal_metadata_.Swap(&other->_internal_metadata_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata TrainCurrentSegment::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = TrainCurrentSegment_descriptor_;
  metadata.reflection = TrainCurrentSegment_reflection_;
  return metadata;
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// TrainCurrentSegment

// optional uint32 trainID = 1;
void TrainCurrentSegment::clear_trainid() {
  trainid_ = 0u;
}
::google::protobuf::uint32 TrainCurrentSegment::trainid() const {
  // @@protoc_insertion_point(field_get:modes3.protobuf.TrainCurrentSegment.trainID)
  return trainid_;
}
void TrainCurrentSegment::set_trainid(::google::protobuf::uint32 value) {
  
  trainid_ = value;
  // @@protoc_insertion_point(field_set:modes3.protobuf.TrainCurrentSegment.trainID)
}

// optional uint32 turnoutID = 2;
void TrainCurrentSegment::clear_turnoutid() {
  turnoutid_ = 0u;
}
::google::protobuf::uint32 TrainCurrentSegment::turnoutid() const {
  // @@protoc_insertion_point(field_get:modes3.protobuf.TrainCurrentSegment.turnoutID)
  return turnoutid_;
}
void TrainCurrentSegment::set_turnoutid(::google::protobuf::uint32 value) {
  
  turnoutid_ = value;
  // @@protoc_insertion_point(field_set:modes3.protobuf.TrainCurrentSegment.turnoutID)
}

inline const TrainCurrentSegment* TrainCurrentSegment::internal_default_instance() {
  return &TrainCurrentSegment_default_instance_.get();
}
#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)

}  // namespace protobuf
}  // namespace modes3

// @@protoc_insertion_point(global_scope)
