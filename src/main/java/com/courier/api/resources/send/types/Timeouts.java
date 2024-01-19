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
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Timeouts.Builder.class)
public final class Timeouts {
    private final Optional<Integer> provider;

    private final Optional<Integer> channel;

    private final Map<String, Object> additionalProperties;

    private Timeouts(Optional<Integer> provider, Optional<Integer> channel, Map<String, Object> additionalProperties) {
        this.provider = provider;
        this.channel = channel;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("provider")
    public Optional<Integer> getProvider() {
        return provider;
    }

    @JsonProperty("channel")
    public Optional<Integer> getChannel() {
        return channel;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Timeouts && equalTo((Timeouts) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Timeouts other) {
        return provider.equals(other.provider) && channel.equals(other.channel);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.provider, this.channel);
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
        private Optional<Integer> provider = Optional.empty();

        private Optional<Integer> channel = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(Timeouts other) {
            provider(other.getProvider());
            channel(other.getChannel());
            return this;
        }

        @JsonSetter(value = "provider", nulls = Nulls.SKIP)
        public Builder provider(Optional<Integer> provider) {
            this.provider = provider;
            return this;
        }

        public Builder provider(Integer provider) {
            this.provider = Optional.of(provider);
            return this;
        }

        @JsonSetter(value = "channel", nulls = Nulls.SKIP)
        public Builder channel(Optional<Integer> channel) {
            this.channel = channel;
            return this;
        }

        public Builder channel(Integer channel) {
            this.channel = Optional.of(channel);
            return this;
        }

        public Timeouts build() {
            return new Timeouts(provider, channel, additionalProperties);
        }
    }
}