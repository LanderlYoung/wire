// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/google/protobuf/descriptor.proto at 56:1
package com.google.protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;

/**
 * Describes a complete .proto file.
 */
public final class FileDescriptorProto extends Message<FileDescriptorProto> {
  public static final ProtoAdapter<FileDescriptorProto> ADAPTER = ProtoAdapter.forMessage(FileDescriptorProto.class);

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_PACKAGE = "";

  /**
   * file name, relative to root of source tree
   */
  @WireField(
      tag = 1,
      type = "string"
  )
  public final String name;

  /**
   * e.g. "foo", "foo.bar", etc.
   */
  @WireField(
      tag = 2,
      type = "string"
  )
  public final String _package;

  /**
   * Names of files imported by this file.
   */
  @WireField(
      tag = 3,
      type = "string",
      label = WireField.Label.REPEATED
  )
  public final List<String> dependency;

  /**
   * All top-level definitions in this file.
   */
  @WireField(
      tag = 4,
      type = "google.protobuf.DescriptorProto",
      label = WireField.Label.REPEATED
  )
  public final List<DescriptorProto> message_type;

  @WireField(
      tag = 5,
      type = "google.protobuf.EnumDescriptorProto",
      label = WireField.Label.REPEATED
  )
  public final List<EnumDescriptorProto> enum_type;

  @WireField(
      tag = 6,
      type = "google.protobuf.ServiceDescriptorProto",
      label = WireField.Label.REPEATED
  )
  public final List<ServiceDescriptorProto> service;

  @WireField(
      tag = 7,
      type = "google.protobuf.FieldDescriptorProto",
      label = WireField.Label.REPEATED
  )
  public final List<FieldDescriptorProto> extension;

  @WireField(
      tag = 8,
      type = "google.protobuf.FileOptions"
  )
  public final FileOptions options;

  /**
   * This field contains optional information about the original source code.
   * You may safely remove this entire field without harming runtime
   * functionality of the descriptors -- the information is needed only by
   * development tools.
   */
  @WireField(
      tag = 9,
      type = "google.protobuf.SourceCodeInfo"
  )
  public final SourceCodeInfo source_code_info;

  public FileDescriptorProto(String name, String _package, List<String> dependency, List<DescriptorProto> message_type, List<EnumDescriptorProto> enum_type, List<ServiceDescriptorProto> service, List<FieldDescriptorProto> extension, FileOptions options, SourceCodeInfo source_code_info) {
    this.name = name;
    this._package = _package;
    this.dependency = immutableCopyOf(dependency);
    this.message_type = immutableCopyOf(message_type);
    this.enum_type = immutableCopyOf(enum_type);
    this.service = immutableCopyOf(service);
    this.extension = immutableCopyOf(extension);
    this.options = options;
    this.source_code_info = source_code_info;
  }

  private FileDescriptorProto(Builder builder) {
    this(builder.name, builder._package, builder.dependency, builder.message_type, builder.enum_type, builder.service, builder.extension, builder.options, builder.source_code_info);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FileDescriptorProto)) return false;
    FileDescriptorProto o = (FileDescriptorProto) other;
    return equals(name, o.name)
        && equals(_package, o._package)
        && equals(dependency, o.dependency)
        && equals(message_type, o.message_type)
        && equals(enum_type, o.enum_type)
        && equals(service, o.service)
        && equals(extension, o.extension)
        && equals(options, o.options)
        && equals(source_code_info, o.source_code_info);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = name != null ? name.hashCode() : 0;
      result = result * 37 + (_package != null ? _package.hashCode() : 0);
      result = result * 37 + (dependency != null ? dependency.hashCode() : 1);
      result = result * 37 + (message_type != null ? message_type.hashCode() : 1);
      result = result * 37 + (enum_type != null ? enum_type.hashCode() : 1);
      result = result * 37 + (service != null ? service.hashCode() : 1);
      result = result * 37 + (extension != null ? extension.hashCode() : 1);
      result = result * 37 + (options != null ? options.hashCode() : 0);
      result = result * 37 + (source_code_info != null ? source_code_info.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<FileDescriptorProto, Builder> {
    public String name;

    public String _package;

    public List<String> dependency = Collections.emptyList();

    public List<DescriptorProto> message_type = Collections.emptyList();

    public List<EnumDescriptorProto> enum_type = Collections.emptyList();

    public List<ServiceDescriptorProto> service = Collections.emptyList();

    public List<FieldDescriptorProto> extension = Collections.emptyList();

    public FileOptions options;

    public SourceCodeInfo source_code_info;

    public Builder() {
    }

    public Builder(FileDescriptorProto message) {
      super(message);
      if (message == null) return;
      this.name = message.name;
      this._package = message._package;
      this.dependency = copyOf(message.dependency);
      this.message_type = copyOf(message.message_type);
      this.enum_type = copyOf(message.enum_type);
      this.service = copyOf(message.service);
      this.extension = copyOf(message.extension);
      this.options = message.options;
      this.source_code_info = message.source_code_info;
    }

    /**
     * file name, relative to root of source tree
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * e.g. "foo", "foo.bar", etc.
     */
    public Builder _package(String _package) {
      this._package = _package;
      return this;
    }

    /**
     * Names of files imported by this file.
     */
    public Builder dependency(List<String> dependency) {
      this.dependency = canonicalizeList(dependency);
      return this;
    }

    /**
     * All top-level definitions in this file.
     */
    public Builder message_type(List<DescriptorProto> message_type) {
      this.message_type = canonicalizeList(message_type);
      return this;
    }

    public Builder enum_type(List<EnumDescriptorProto> enum_type) {
      this.enum_type = canonicalizeList(enum_type);
      return this;
    }

    public Builder service(List<ServiceDescriptorProto> service) {
      this.service = canonicalizeList(service);
      return this;
    }

    public Builder extension(List<FieldDescriptorProto> extension) {
      this.extension = canonicalizeList(extension);
      return this;
    }

    public Builder options(FileOptions options) {
      this.options = options;
      return this;
    }

    /**
     * This field contains optional information about the original source code.
     * You may safely remove this entire field without harming runtime
     * functionality of the descriptors -- the information is needed only by
     * development tools.
     */
    public Builder source_code_info(SourceCodeInfo source_code_info) {
      this.source_code_info = source_code_info;
      return this;
    }

    @Override
    public FileDescriptorProto build() {
      return new FileDescriptorProto(this);
    }
  }
}
