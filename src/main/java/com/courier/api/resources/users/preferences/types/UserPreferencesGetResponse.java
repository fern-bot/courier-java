/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.users.preferences.types;

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
@JsonDeserialize(builder = UserPreferencesGetResponse.Builder.class)
public final class UserPreferencesGetResponse {
    private final TopicPreference topic;

    private final Map<String, Object> additionalProperties;

    private UserPreferencesGetResponse(TopicPreference topic, Map<String, Object> additionalProperties) {
        this.topic = topic;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("topic")
    public TopicPreference getTopic() {
        return topic;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserPreferencesGetResponse && equalTo((UserPreferencesGetResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserPreferencesGetResponse other) {
        return topic.equals(other.topic);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.topic);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TopicStage builder() {
        return new Builder();
    }

    public interface TopicStage {
        _FinalStage topic(TopicPreference topic);

        Builder from(UserPreferencesGetResponse other);
    }

    public interface _FinalStage {
        UserPreferencesGetResponse build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TopicStage, _FinalStage {
        private TopicPreference topic;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(UserPreferencesGetResponse other) {
            topic(other.getTopic());
            return this;
        }

        @java.lang.Override
        @JsonSetter("topic")
        public _FinalStage topic(TopicPreference topic) {
            this.topic = topic;
            return this;
        }

        @java.lang.Override
        public UserPreferencesGetResponse build() {
            return new UserPreferencesGetResponse(topic, additionalProperties);
        }
    }
}