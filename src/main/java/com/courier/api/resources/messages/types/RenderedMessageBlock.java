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
@JsonDeserialize(builder = RenderedMessageBlock.Builder.class)
public final class RenderedMessageBlock {
    private final String type;

    private final String text;

    private final Map<String, Object> additionalProperties;

    private RenderedMessageBlock(String type, String text, Map<String, Object> additionalProperties) {
        this.type = type;
        this.text = text;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The block type of the rendered message block.
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * @return The block text of the rendered message block.
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RenderedMessageBlock && equalTo((RenderedMessageBlock) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RenderedMessageBlock other) {
        return type.equals(other.type) && text.equals(other.text);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.type, this.text);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TypeStage builder() {
        return new Builder();
    }

    public interface TypeStage {
        TextStage type(String type);

        Builder from(RenderedMessageBlock other);
    }

    public interface TextStage {
        _FinalStage text(String text);
    }

    public interface _FinalStage {
        RenderedMessageBlock build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TypeStage, TextStage, _FinalStage {
        private String type;

        private String text;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(RenderedMessageBlock other) {
            type(other.getType());
            text(other.getText());
            return this;
        }

        /**
         * <p>The block type of the rendered message block.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("type")
        public TextStage type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The block text of the rendered message block.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        @JsonSetter("text")
        public _FinalStage text(String text) {
            this.text = text;
            return this;
        }

        @java.lang.Override
        public RenderedMessageBlock build() {
            return new RenderedMessageBlock(type, text, additionalProperties);
        }
    }
}