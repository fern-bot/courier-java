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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = MessageHistoryResponse.Builder.class)
public final class MessageHistoryResponse {
    private final List<MessageDetails> results;

    private final Map<String, Object> additionalProperties;

    private MessageHistoryResponse(List<MessageDetails> results, Map<String, Object> additionalProperties) {
        this.results = results;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("results")
    public List<MessageDetails> getResults() {
        return results;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof MessageHistoryResponse && equalTo((MessageHistoryResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(MessageHistoryResponse other) {
        return results.equals(other.results);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.results);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private List<MessageDetails> results = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(MessageHistoryResponse other) {
            results(other.getResults());
            return this;
        }

        @JsonSetter(value = "results", nulls = Nulls.SKIP)
        public Builder results(List<MessageDetails> results) {
            this.results.clear();
            this.results.addAll(results);
            return this;
        }

        public Builder addResults(MessageDetails results) {
            this.results.add(results);
            return this;
        }

        public Builder addAllResults(List<MessageDetails> results) {
            this.results.addAll(results);
            return this;
        }

        public MessageHistoryResponse build() {
            return new MessageHistoryResponse(results, additionalProperties);
        }
    }
}