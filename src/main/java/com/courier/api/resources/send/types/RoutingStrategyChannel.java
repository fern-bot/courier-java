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
@JsonDeserialize(builder = RoutingStrategyChannel.Builder.class)
public final class RoutingStrategyChannel {
    private final String channel;

    private final Optional<Map<String, Object>> config;

    private final Optional<RoutingMethod> method;

    private final Optional<Map<String, MessageProvidersType>> providers;

    private final Optional<String> if_;

    private final Map<String, Object> additionalProperties;

    private RoutingStrategyChannel(
            String channel,
            Optional<Map<String, Object>> config,
            Optional<RoutingMethod> method,
            Optional<Map<String, MessageProvidersType>> providers,
            Optional<String> if_,
            Map<String, Object> additionalProperties) {
        this.channel = channel;
        this.config = config;
        this.method = method;
        this.providers = providers;
        this.if_ = if_;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("channel")
    public String getChannel() {
        return channel;
    }

    @JsonProperty("config")
    public Optional<Map<String, Object>> getConfig() {
        return config;
    }

    @JsonProperty("method")
    public Optional<RoutingMethod> getMethod() {
        return method;
    }

    @JsonProperty("providers")
    public Optional<Map<String, MessageProvidersType>> getProviders() {
        return providers;
    }

    @JsonProperty("if")
    public Optional<String> getIf() {
        return if_;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RoutingStrategyChannel && equalTo((RoutingStrategyChannel) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(RoutingStrategyChannel other) {
        return channel.equals(other.channel)
                && config.equals(other.config)
                && method.equals(other.method)
                && providers.equals(other.providers)
                && if_.equals(other.if_);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.channel, this.config, this.method, this.providers, this.if_);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ChannelStage builder() {
        return new Builder();
    }

    public interface ChannelStage {
        _FinalStage channel(String channel);

        Builder from(RoutingStrategyChannel other);
    }

    public interface _FinalStage {
        RoutingStrategyChannel build();

        _FinalStage config(Optional<Map<String, Object>> config);

        _FinalStage config(Map<String, Object> config);

        _FinalStage method(Optional<RoutingMethod> method);

        _FinalStage method(RoutingMethod method);

        _FinalStage providers(Optional<Map<String, MessageProvidersType>> providers);

        _FinalStage providers(Map<String, MessageProvidersType> providers);

        _FinalStage if_(Optional<String> if_);

        _FinalStage if_(String if_);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ChannelStage, _FinalStage {
        private String channel;

        private Optional<String> if_ = Optional.empty();

        private Optional<Map<String, MessageProvidersType>> providers = Optional.empty();

        private Optional<RoutingMethod> method = Optional.empty();

        private Optional<Map<String, Object>> config = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(RoutingStrategyChannel other) {
            channel(other.getChannel());
            config(other.getConfig());
            method(other.getMethod());
            providers(other.getProviders());
            if_(other.getIf());
            return this;
        }

        @Override
        @JsonSetter("channel")
        public _FinalStage channel(String channel) {
            this.channel = channel;
            return this;
        }

        @Override
        public _FinalStage if_(String if_) {
            this.if_ = Optional.of(if_);
            return this;
        }

        @Override
        @JsonSetter(value = "if", nulls = Nulls.SKIP)
        public _FinalStage if_(Optional<String> if_) {
            this.if_ = if_;
            return this;
        }

        @Override
        public _FinalStage providers(Map<String, MessageProvidersType> providers) {
            this.providers = Optional.of(providers);
            return this;
        }

        @Override
        @JsonSetter(value = "providers", nulls = Nulls.SKIP)
        public _FinalStage providers(Optional<Map<String, MessageProvidersType>> providers) {
            this.providers = providers;
            return this;
        }

        @Override
        public _FinalStage method(RoutingMethod method) {
            this.method = Optional.of(method);
            return this;
        }

        @Override
        @JsonSetter(value = "method", nulls = Nulls.SKIP)
        public _FinalStage method(Optional<RoutingMethod> method) {
            this.method = method;
            return this;
        }

        @Override
        public _FinalStage config(Map<String, Object> config) {
            this.config = Optional.of(config);
            return this;
        }

        @Override
        @JsonSetter(value = "config", nulls = Nulls.SKIP)
        public _FinalStage config(Optional<Map<String, Object>> config) {
            this.config = config;
            return this;
        }

        @Override
        public RoutingStrategyChannel build() {
            return new RoutingStrategyChannel(channel, config, method, providers, if_, additionalProperties);
        }
    }
}
