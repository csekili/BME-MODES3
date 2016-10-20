// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TurnoutCommand.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "TurnoutCommand.pb.h"

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

const ::google::protobuf::Descriptor* TurnoutCommand_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  TurnoutCommand_reflection_ = NULL;

}  // namespace


void protobuf_AssignDesc_TurnoutCommand_2eproto() GOOGLE_ATTRIBUTE_COLD;
void protobuf_AssignDesc_TurnoutCommand_2eproto() {
  protobuf_AddDesc_TurnoutCommand_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "TurnoutCommand.proto");
  GOOGLE_CHECK(file != NULL);
  TurnoutCommand_descriptor_ = file->message_type(0);
  static const int TurnoutCommand_offsets_[2] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TurnoutCommand, turnoutid_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TurnoutCommand, state_),
  };
  TurnoutCommand_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      TurnoutCommand_descriptor_,
      TurnoutCommand::internal_default_instance(),
      TurnoutCommand_offsets_,
      -1,
      -1,
      -1,
      sizeof(TurnoutCommand),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(TurnoutCommand, _internal_metadata_));
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_TurnoutCommand_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) GOOGLE_ATTRIBUTE_COLD;
void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      TurnoutCommand_descriptor_, TurnoutCommand::internal_default_instance());
}

}  // namespace

void protobuf_ShutdownFile_TurnoutCommand_2eproto() {
  TurnoutCommand_default_instance_.Shutdown();
  delete TurnoutCommand_reflection_;
}

void protobuf_InitDefaults_TurnoutCommand_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::modes3::protobuf::protobuf_InitDefaults_Enums_2eproto();
  TurnoutCommand_default_instance_.DefaultConstruct();
  TurnoutCommand_default_instance_.get_mutable()->InitAsDefaultInstance();
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_InitDefaults_TurnoutCommand_2eproto_once_);
void protobuf_InitDefaults_TurnoutCommand_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_InitDefaults_TurnoutCommand_2eproto_once_,
                 &protobuf_InitDefaults_TurnoutCommand_2eproto_impl);
}
void protobuf_AddDesc_TurnoutCommand_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  protobuf_InitDefaults_TurnoutCommand_2eproto();
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n\024TurnoutCommand.proto\022\017modes3.protobuf\032"
    "\013Enums.proto\"V\n\016TurnoutCommand\022\021\n\tturnou"
    "tID\030\001 \001(\r\0221\n\005state\030\002 \001(\0162\".modes3.protob"
    "uf.TurnoutStateValueB0\n,hu.bme.mit.inf.m"
    "odes3.messaging.mms.messagesP\001b\006proto3", 198);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "TurnoutCommand.proto", &protobuf_RegisterTypes);
  ::modes3::protobuf::protobuf_AddDesc_Enums_2eproto();
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_TurnoutCommand_2eproto);
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AddDesc_TurnoutCommand_2eproto_once_);
void protobuf_AddDesc_TurnoutCommand_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AddDesc_TurnoutCommand_2eproto_once_,
                 &protobuf_AddDesc_TurnoutCommand_2eproto_impl);
}
// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_TurnoutCommand_2eproto {
  StaticDescriptorInitializer_TurnoutCommand_2eproto() {
    protobuf_AddDesc_TurnoutCommand_2eproto();
  }
} static_descriptor_initializer_TurnoutCommand_2eproto_;

namespace {

static void MergeFromFail(int line) GOOGLE_ATTRIBUTE_COLD GOOGLE_ATTRIBUTE_NORETURN;
static void MergeFromFail(int line) {
  ::google::protobuf::internal::MergeFromFail(__FILE__, line);
}

}  // namespace


// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int TurnoutCommand::kTurnoutIDFieldNumber;
const int TurnoutCommand::kStateFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

TurnoutCommand::TurnoutCommand()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  if (this != internal_default_instance()) protobuf_InitDefaults_TurnoutCommand_2eproto();
  SharedCtor();
  // @@protoc_insertion_point(constructor:modes3.protobuf.TurnoutCommand)
}

void TurnoutCommand::InitAsDefaultInstance() {
}

TurnoutCommand::TurnoutCommand(const TurnoutCommand& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  UnsafeMergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:modes3.protobuf.TurnoutCommand)
}

void TurnoutCommand::SharedCtor() {
  ::memset(&turnoutid_, 0, reinterpret_cast<char*>(&state_) -
    reinterpret_cast<char*>(&turnoutid_) + sizeof(state_));
  _cached_size_ = 0;
}

TurnoutCommand::~TurnoutCommand() {
  // @@protoc_insertion_point(destructor:modes3.protobuf.TurnoutCommand)
  SharedDtor();
}

void TurnoutCommand::SharedDtor() {
}

void TurnoutCommand::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* TurnoutCommand::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return TurnoutCommand_descriptor_;
}

const TurnoutCommand& TurnoutCommand::default_instance() {
  protobuf_InitDefaults_TurnoutCommand_2eproto();
  return *internal_default_instance();
}

::google::protobuf::internal::ExplicitlyConstructed<TurnoutCommand> TurnoutCommand_default_instance_;

TurnoutCommand* TurnoutCommand::New(::google::protobuf::Arena* arena) const {
  TurnoutCommand* n = new TurnoutCommand;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void TurnoutCommand::Clear() {
// @@protoc_insertion_point(message_clear_start:modes3.protobuf.TurnoutCommand)
#if defined(__clang__)
#define ZR_HELPER_(f) \
  _Pragma("clang diagnostic push") \
  _Pragma("clang diagnostic ignored \"-Winvalid-offsetof\"") \
  __builtin_offsetof(TurnoutCommand, f) \
  _Pragma("clang diagnostic pop")
#else
#define ZR_HELPER_(f) reinterpret_cast<char*>(\
  &reinterpret_cast<TurnoutCommand*>(16)->f)
#endif

#define ZR_(first, last) do {\
  ::memset(&(first), 0,\
           ZR_HELPER_(last) - ZR_HELPER_(first) + sizeof(last));\
} while (0)

  ZR_(turnoutid_, state_);

#undef ZR_HELPER_
#undef ZR_

}

bool TurnoutCommand::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:modes3.protobuf.TurnoutCommand)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // optional uint32 turnoutID = 1;
      case 1: {
        if (tag == 8) {

          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   ::google::protobuf::uint32, ::google::protobuf::internal::WireFormatLite::TYPE_UINT32>(
                 input, &turnoutid_)));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectTag(16)) goto parse_state;
        break;
      }

      // optional .modes3.protobuf.TurnoutStateValue state = 2;
      case 2: {
        if (tag == 16) {
         parse_state:
          int value;
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   int, ::google::protobuf::internal::WireFormatLite::TYPE_ENUM>(
                 input, &value)));
          set_state(static_cast< ::modes3::protobuf::TurnoutStateValue >(value));
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
  // @@protoc_insertion_point(parse_success:modes3.protobuf.TurnoutCommand)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:modes3.protobuf.TurnoutCommand)
  return false;
#undef DO_
}

void TurnoutCommand::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:modes3.protobuf.TurnoutCommand)
  // optional uint32 turnoutID = 1;
  if (this->turnoutid() != 0) {
    ::google::protobuf::internal::WireFormatLite::WriteUInt32(1, this->turnoutid(), output);
  }

  // optional .modes3.protobuf.TurnoutStateValue state = 2;
  if (this->state() != 0) {
    ::google::protobuf::internal::WireFormatLite::WriteEnum(
      2, this->state(), output);
  }

  // @@protoc_insertion_point(serialize_end:modes3.protobuf.TurnoutCommand)
}

::google::protobuf::uint8* TurnoutCommand::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  (void)deterministic; // Unused
  // @@protoc_insertion_point(serialize_to_array_start:modes3.protobuf.TurnoutCommand)
  // optional uint32 turnoutID = 1;
  if (this->turnoutid() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::WriteUInt32ToArray(1, this->turnoutid(), target);
  }

  // optional .modes3.protobuf.TurnoutStateValue state = 2;
  if (this->state() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::WriteEnumToArray(
      2, this->state(), target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:modes3.protobuf.TurnoutCommand)
  return target;
}

size_t TurnoutCommand::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:modes3.protobuf.TurnoutCommand)
  size_t total_size = 0;

  // optional uint32 turnoutID = 1;
  if (this->turnoutid() != 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::UInt32Size(
        this->turnoutid());
  }

  // optional .modes3.protobuf.TurnoutStateValue state = 2;
  if (this->state() != 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::EnumSize(this->state());
  }

  int cached_size = ::google::protobuf::internal::ToCachedSize(total_size);
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = cached_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void TurnoutCommand::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:modes3.protobuf.TurnoutCommand)
  if (GOOGLE_PREDICT_FALSE(&from == this)) MergeFromFail(__LINE__);
  const TurnoutCommand* source =
      ::google::protobuf::internal::DynamicCastToGenerated<const TurnoutCommand>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:modes3.protobuf.TurnoutCommand)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:modes3.protobuf.TurnoutCommand)
    UnsafeMergeFrom(*source);
  }
}

void TurnoutCommand::MergeFrom(const TurnoutCommand& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:modes3.protobuf.TurnoutCommand)
  if (GOOGLE_PREDICT_TRUE(&from != this)) {
    UnsafeMergeFrom(from);
  } else {
    MergeFromFail(__LINE__);
  }
}

void TurnoutCommand::UnsafeMergeFrom(const TurnoutCommand& from) {
  GOOGLE_DCHECK(&from != this);
  if (from.turnoutid() != 0) {
    set_turnoutid(from.turnoutid());
  }
  if (from.state() != 0) {
    set_state(from.state());
  }
}

void TurnoutCommand::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:modes3.protobuf.TurnoutCommand)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void TurnoutCommand::CopyFrom(const TurnoutCommand& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:modes3.protobuf.TurnoutCommand)
  if (&from == this) return;
  Clear();
  UnsafeMergeFrom(from);
}

bool TurnoutCommand::IsInitialized() const {

  return true;
}

void TurnoutCommand::Swap(TurnoutCommand* other) {
  if (other == this) return;
  InternalSwap(other);
}
void TurnoutCommand::InternalSwap(TurnoutCommand* other) {
  std::swap(turnoutid_, other->turnoutid_);
  std::swap(state_, other->state_);
  _internal_metadata_.Swap(&other->_internal_metadata_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata TurnoutCommand::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = TurnoutCommand_descriptor_;
  metadata.reflection = TurnoutCommand_reflection_;
  return metadata;
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// TurnoutCommand

// optional uint32 turnoutID = 1;
void TurnoutCommand::clear_turnoutid() {
  turnoutid_ = 0u;
}
::google::protobuf::uint32 TurnoutCommand::turnoutid() const {
  // @@protoc_insertion_point(field_get:modes3.protobuf.TurnoutCommand.turnoutID)
  return turnoutid_;
}
void TurnoutCommand::set_turnoutid(::google::protobuf::uint32 value) {
  
  turnoutid_ = value;
  // @@protoc_insertion_point(field_set:modes3.protobuf.TurnoutCommand.turnoutID)
}

// optional .modes3.protobuf.TurnoutStateValue state = 2;
void TurnoutCommand::clear_state() {
  state_ = 0;
}
::modes3::protobuf::TurnoutStateValue TurnoutCommand::state() const {
  // @@protoc_insertion_point(field_get:modes3.protobuf.TurnoutCommand.state)
  return static_cast< ::modes3::protobuf::TurnoutStateValue >(state_);
}
void TurnoutCommand::set_state(::modes3::protobuf::TurnoutStateValue value) {
  
  state_ = value;
  // @@protoc_insertion_point(field_set:modes3.protobuf.TurnoutCommand.state)
}

inline const TurnoutCommand* TurnoutCommand::internal_default_instance() {
  return &TurnoutCommand_default_instance_.get();
}
#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)

}  // namespace protobuf
}  // namespace modes3

// @@protoc_insertion_point(global_scope)
