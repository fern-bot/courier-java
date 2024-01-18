/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.send.types;

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
@JsonDeserialize(builder = Locale.Builder.class)
public final class Locale {
    private final String content;

    private final Map<String, Object> additionalProperties;

    private Locale(String content, Map<String, Object> additionalProperties) {
        this.content = content;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Locale && equalTo((Locale) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Locale other) {
        return content.equals(other.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.content);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ContentStage builder() {
        return new Builder();
    }

    public interface ContentStage {
        _FinalStage content(String content);

        Builder from(Locale other);
    }

    public interface _FinalStage {
        Locale build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ContentStage, _FinalStage {
        private String content;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Locale other) {
            content(other.getContent());
            return this;
        }

        @Override
        @JsonSetter("content")
        public _FinalStage content(String content) {
            this.content = content;
            return this;
        }

        @Override
        public Locale build() {
            return new Locale(content, additionalProperties);
        }
    }
}
