// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TurnoutReferenceCommand.proto

#ifndef PROTOBUF_TurnoutReferenceCommand_2eproto__INCLUDED
#define PROTOBUF_TurnoutReferenceCommand_2eproto__INCLUDED

#include <string>

#include <google/protobuf/stubs/common.h>

#if GOOGLE_PROTOBUF_VERSION < 3001000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please update
#error your headers.
#endif
#if 3001000 < GOOGLE_PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/arena.h>
#include <google/protobuf/arenastring.h>
#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/metadata.h>
#include <google/protobuf/message.h>
#include <google/protobuf/repeated_field.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/unknown_field_set.h>
#include "Enums.pb.h"
// @@protoc_insertion_point(includes)

namespace modes3 {
namespace protobuf {

// Internal implementation detail -- do not call these.
void protobuf_AddDesc_TurnoutReferenceCommand_2eproto();
void protobuf_InitDefaults_TurnoutReferenceCommand_2eproto();
void protobuf_AssignDesc_TurnoutReferenceCommand_2eproto();
void protobuf_ShutdownFile_TurnoutReferenceCommand_2eproto();

class TurnoutReferenceCommand;

// ===================================================================

class TurnoutReferenceCommand : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:modes3.protobuf.TurnoutReferenceCommand) */ {
 public:
  TurnoutReferenceCommand();
  virtual ~TurnoutReferenceCommand();

  TurnoutReferenceCommand(const TurnoutReferenceCommand& from);

  inline TurnoutReferenceCommand& operator=(const TurnoutReferenceCommand& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const TurnoutReferenceCommand& default_instance();

  static const TurnoutReferenceCommand* internal_default_instance();

  void Swap(TurnoutReferenceCommand* other);

  // implements Message ----------------------------------------------

  inline TurnoutReferenceCommand* New() const { return New(NULL); }

  TurnoutReferenceCommand* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const TurnoutReferenceCommand& from);
  void MergeFrom(const TurnoutReferenceCommand& from);
  void Clear();
  bool IsInitialized() const;

  size_t ByteSizeLong() const;
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input);
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const;
  ::google::protobuf::uint8* InternalSerializeWithCachedSizesToArray(
      bool deterministic, ::google::protobuf::uint8* output) const;
  ::google::protobuf::uint8* SerializeWithCachedSizesToArray(::google::protobuf::uint8* output) const {
    return InternalSerializeWithCachedSizesToArray(false, output);
  }
  int GetCachedSize() const { return _cached_size_; }
  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const;
  void InternalSwap(TurnoutReferenceCommand* other);
  void UnsafeMergeFrom(const TurnoutReferenceCommand& from);
  private:
  inline ::google::protobuf::Arena* GetArenaNoVirtual() const {
    return _internal_metadata_.arena();
  }
  inline void* MaybeArenaPtr() const {
    return _internal_metadata_.raw_arena_ptr();
  }
  public:

  ::google::protobuf::Metadata GetMetadata() const;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional uint32 turnoutID = 1;
  void clear_turnoutid();
  static const int kTurnoutIDFieldNumber = 1;
  ::google::protobuf::uint32 turnoutid() const;
  void set_turnoutid(::google::protobuf::uint32 value);

  // optional .modes3.protobuf.TurnoutStateValue state = 2;
  void clear_state();
  static const int kStateFieldNumber = 2;
  ::modes3::protobuf::TurnoutStateValue state() const;
  void set_state(::modes3::protobuf::TurnoutStateValue value);

  // @@protoc_insertion_point(class_scope:modes3.protobuf.TurnoutReferenceCommand)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::uint32 turnoutid_;
  int state_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_TurnoutReferenceCommand_2eproto_impl();
  friend void  protobuf_AddDesc_TurnoutReferenceCommand_2eproto_impl();
  friend void protobuf_AssignDesc_TurnoutReferenceCommand_2eproto();
  friend void protobuf_ShutdownFile_TurnoutReferenceCommand_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<TurnoutReferenceCommand> TurnoutReferenceCommand_default_instance_;

// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
// TurnoutReferenceCommand

// optional uint32 turnoutID = 1;
inline void TurnoutReferenceCommand::clear_turnoutid() {
  turnoutid_ = 0u;
}
inline ::google::protobuf::uint32 TurnoutReferenceCommand::turnoutid() const {
  // @@protoc_insertion_point(field_get:modes3.protobuf.TurnoutReferenceCommand.turnoutID)
  return turnoutid_;
}
inline void TurnoutReferenceCommand::set_turnoutid(::google::protobuf::uint32 value) {
  
  turnoutid_ = value;
  // @@protoc_insertion_point(field_set:modes3.protobuf.TurnoutReferenceCommand.turnoutID)
}

// optional .modes3.protobuf.TurnoutStateValue state = 2;
inline void TurnoutReferenceCommand::clear_state() {
  state_ = 0;
}
inline ::modes3::protobuf::TurnoutStateValue TurnoutReferenceCommand::state() const {
  // @@protoc_insertion_point(field_get:modes3.protobuf.TurnoutReferenceCommand.state)
  return static_cast< ::modes3::protobuf::TurnoutStateValue >(state_);
}
inline void TurnoutReferenceCommand::set_state(::modes3::protobuf::TurnoutStateValue value) {
  
  state_ = value;
  // @@protoc_insertion_point(field_set:modes3.protobuf.TurnoutReferenceCommand.state)
}

inline const TurnoutReferenceCommand* TurnoutReferenceCommand::internal_default_instance() {
  return &TurnoutReferenceCommand_default_instance_.get();
}
#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)

}  // namespace protobuf
}  // namespace modes3

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_TurnoutReferenceCommand_2eproto__INCLUDED
