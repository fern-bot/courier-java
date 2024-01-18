/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.commons.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = BaseError.Builder.class)
public final class BaseError implements IBaseError {
    private final String message;

    private final Map<String, Object> additionalProperties;

    private BaseError(String message, Map<String, Object> additionalProperties) {
        this.message = message;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A message describing the error that occurred.
     */
    @JsonProperty("message")
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BaseError && equalTo((BaseError) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BaseError other) {
        return message.equals(other.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.message);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MessageStage builder() {
        return new Builder();
    }

    public interface MessageStage {
        _FinalStage message(String message);

        Builder from(BaseError other);
    }

    public interface _FinalStage {
        BaseError build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MessageStage, _FinalStage {
        private String message;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(BaseError other) {
            message(other.getMessage());
            return this;
        }

        /**
         * <p>A message describing the error that occurred.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("message")
        public _FinalStage message(String message) {
            this.message = message;
            return this;
        }

        @Override
        public BaseError build() {
            return new BaseError(message, additionalProperties);
        }
    }
}
