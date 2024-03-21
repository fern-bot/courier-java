/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.types;

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
@JsonDeserialize(builder = SendMessageResponse.Builder.class)
public final class SendMessageResponse {
    private final String requestId;

    private final Map<String, Object> additionalProperties;

    private SendMessageResponse(String requestId, Map<String, Object> additionalProperties) {
        this.requestId = requestId;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A successful call to <code>POST /send</code> returns a <code>202</code> status code along with a <code>requestId</code> in the response body.
     * <p>For send requests that have a single recipient, the <code>requestId</code> is assigned to the derived message as its message_id. Therefore the <code>requestId</code> can be supplied to the Message's API for single recipient messages.</p>
     * <p>For send requests that have multiple recipients (accounts, audiences, lists, etc.), Courier assigns a unique id to each derived message as its <code>message_id</code>. Therefore the <code>requestId</code> cannot be supplied to the Message's API for single-recipient messages.</p>
     */
    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SendMessageResponse && equalTo((SendMessageResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SendMessageResponse other) {
        return requestId.equals(other.requestId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.requestId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static RequestIdStage builder() {
        return new Builder();
    }

    public interface RequestIdStage {
        _FinalStage requestId(String requestId);

        Builder from(SendMessageResponse other);
    }

    public interface _FinalStage {
        SendMessageResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements RequestIdStage, _FinalStage {
        private String requestId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SendMessageResponse other) {
            requestId(other.getRequestId());
            return this;
        }

        /**
         * <p>A successful call to <code>POST /send</code> returns a <code>202</code> status code along with a <code>requestId</code> in the response body.</p>
         * <p>For send requests that have a single recipient, the <code>requestId</code> is assigned to the derived message as its message_id. Therefore the <code>requestId</code> can be supplied to the Message's API for single recipient messages.</p>
         * <p>For send requests that have multiple recipients (accounts, audiences, lists, etc.), Courier assigns a unique id to each derived message as its <code>message_id</code>. Therefore the <code>requestId</code> cannot be supplied to the Message's API for single-recipient messages.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("requestId")
        public _FinalStage requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        @java.lang.Override
        public SendMessageResponse build() {
            return new SendMessageResponse(requestId, additionalProperties);
        }
    }
}