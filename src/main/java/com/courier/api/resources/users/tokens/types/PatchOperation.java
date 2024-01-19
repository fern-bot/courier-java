/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.users.tokens.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PatchOperation.Builder.class)
public final class PatchOperation {
    private final String op;

    private final String path;

    private final Optional<String> value;

    private final Map<String, Object> additionalProperties;

    private PatchOperation(String op, String path, Optional<String> value, Map<String, Object> additionalProperties) {
        this.op = op;
        this.path = path;
        this.value = value;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The operation to perform.
     */
    @JsonProperty("op")
    public String getOp() {
        return op;
    }

    /**
     * @return The JSON path specifying the part of the profile to operate on.
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * @return The value for the operation.
     */
    @JsonProperty("value")
    public Optional<String> getValue() {
        return value;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PatchOperation && equalTo((PatchOperation) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PatchOperation other) {
        return op.equals(other.op) && path.equals(other.path) && value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.op, this.path, this.value);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static OpStage builder() {
        return new Builder();
    }

    public interface OpStage {
        PathStage op(String op);

        Builder from(PatchOperation other);
    }

    public interface PathStage {
        _FinalStage path(String path);
    }

    public interface _FinalStage {
        PatchOperation build();

        _FinalStage value(Optional<String> value);

        _FinalStage value(String value);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements OpStage, PathStage, _FinalStage {
        private String op;

        private String path;

        private Optional<String> value = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(PatchOperation other) {
            op(other.getOp());
            path(other.getPath());
            value(other.getValue());
            return this;
        }

        /**
         * <p>The operation to perform.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("op")
        public PathStage op(String op) {
            this.op = op;
            return this;
        }

        /**
         * <p>The JSON path specifying the part of the profile to operate on.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("path")
        public _FinalStage path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>The value for the operation.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage value(String value) {
            this.value = Optional.of(value);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "value", nulls = Nulls.SKIP)
        public _FinalStage value(Optional<String> value) {
            this.value = value;
            return this;
        }

        @java.lang.Override
        public PatchOperation build() {
            return new PatchOperation(op, path, value, additionalProperties);
        }
    }
}