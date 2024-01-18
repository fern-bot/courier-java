/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.messages.types;

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
@JsonDeserialize(builder = RenderOutput.Builder.class)
public final class RenderOutput {
    private final String channel;

    private final String channelId;

    private final RenderedMessageContent content;

    private final Map<String, Object> additionalProperties;

    private RenderOutput(
            String channel,
            String channelId,
            RenderedMessageContent content,
            Map<String, Object> additionalProperties) {
        this.channel = channel;
        this.channelId = channelId;
        this.content = content;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The channel used for rendering the message.
     */
    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    /**
     * @return The ID of channel used for rendering the message.
     */
    @JsonProperty("channel_id")
    public String getChannelId() {
        return channelId;
    }

    /**
     * @return Content details of the rendered message.
     */
    @JsonProperty("content")
    public RenderedMessageContent getContent() {
        return content;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RenderOutput && equalTo((RenderOutput) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RenderOutput other) {
        return channel.equals(other.channel) && channelId.equals(other.channelId) && content.equals(other.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.channel, this.channelId, this.content);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ChannelStage builder() {
        return new Builder();
    }

    public interface ChannelStage {
        ChannelIdStage channel(String channel);

        Builder from(RenderOutput other);
    }

    public interface ChannelIdStage {
        ContentStage channelId(String channelId);
    }

    public interface ContentStage {
        _FinalStage content(RenderedMessageContent content);
    }

    public interface _FinalStage {
        RenderOutput build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ChannelStage, ChannelIdStage, ContentStage, _FinalStage {
        private String channel;

        private String channelId;

        private RenderedMessageContent content;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(RenderOutput other) {
            channel(other.getChannel());
            channelId(other.getChannelId());
            content(other.getContent());
            return this;
        }

        /**
         * <p>The channel used for rendering the message.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("channel")
        public ChannelIdStage channel(String channel) {
            this.channel = channel;
            return this;
        }

        /**
         * <p>The ID of channel used for rendering the message.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("channel_id")
        public ContentStage channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>Content details of the rendered message.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("content")
        public _FinalStage content(RenderedMessageContent content) {
            this.content = content;
            return this;
        }

        @Override
        public RenderOutput build() {
            return new RenderOutput(channel, channelId, content, additionalProperties);
        }
    }
}
