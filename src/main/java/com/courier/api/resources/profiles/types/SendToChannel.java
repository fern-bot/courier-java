/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.profiles.types;

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
@JsonDeserialize(builder = SendToChannel.Builder.class)
public final class SendToChannel {
    private final String channelId;

    private final Map<String, Object> additionalProperties;

    private SendToChannel(String channelId, Map<String, Object> additionalProperties) {
        this.channelId = channelId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("channel_id")
    public String getChannelId() {
        return channelId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SendToChannel && equalTo((SendToChannel) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SendToChannel other) {
        return channelId.equals(other.channelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.channelId);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ChannelIdStage builder() {
        return new Builder();
    }

    public interface ChannelIdStage {
        _FinalStage channelId(String channelId);

        Builder from(SendToChannel other);
    }

    public interface _FinalStage {
        SendToChannel build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ChannelIdStage, _FinalStage {
        private String channelId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(SendToChannel other) {
            channelId(other.getChannelId());
            return this;
        }

        @Override
        @JsonSetter("channel_id")
        public _FinalStage channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        @Override
        public SendToChannel build() {
            return new SendToChannel(channelId, additionalProperties);
        }
    }
}
