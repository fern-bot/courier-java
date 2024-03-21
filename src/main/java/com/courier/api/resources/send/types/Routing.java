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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Routing.Builder.class)
public final class Routing {
    private final RoutingMethod method;

    private final List<RoutingChannel> channels;

    private final Map<String, Object> additionalProperties;

    private Routing(RoutingMethod method, List<RoutingChannel> channels, Map<String, Object> additionalProperties) {
        this.method = method;
        this.channels = channels;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("method")
    public RoutingMethod getMethod() {
        return method;
    }

    /**
     * @return A list of channels or providers to send the message through. Can also recursively define
     * sub-routing methods, which can be useful for defining advanced push notification
     * delivery strategies.
     */
    @JsonProperty("channels")
    public List<RoutingChannel> getChannels() {
        return channels;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Routing && equalTo((Routing) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Routing other) {
        return method.equals(other.method) && channels.equals(other.channels);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.method, this.channels);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MethodStage builder() {
        return new Builder();
    }

    public interface MethodStage {
        _FinalStage method(RoutingMethod method);

        Builder from(Routing other);
    }

    public interface _FinalStage {
        Routing build();

        _FinalStage channels(List<RoutingChannel> channels);

        _FinalStage addChannels(RoutingChannel channels);

        _FinalStage addAllChannels(List<RoutingChannel> channels);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MethodStage, _FinalStage {
        private RoutingMethod method;

        private List<RoutingChannel> channels = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Routing other) {
            method(other.getMethod());
            channels(other.getChannels());
            return this;
        }

        @java.lang.Override
        @JsonSetter("method")
        public _FinalStage method(RoutingMethod method) {
            this.method = method;
            return this;
        }

        /**
         * <p>A list of channels or providers to send the message through. Can also recursively define
         * sub-routing methods, which can be useful for defining advanced push notification
         * delivery strategies.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addAllChannels(List<RoutingChannel> channels) {
            this.channels.addAll(channels);
            return this;
        }

        /**
         * <p>A list of channels or providers to send the message through. Can also recursively define
         * sub-routing methods, which can be useful for defining advanced push notification
         * delivery strategies.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @java.lang.Override
        public _FinalStage addChannels(RoutingChannel channels) {
            this.channels.add(channels);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "channels", nulls = Nulls.SKIP)
        public _FinalStage channels(List<RoutingChannel> channels) {
            this.channels.clear();
            this.channels.addAll(channels);
            return this;
        }

        @java.lang.Override
        public Routing build() {
            return new Routing(method, channels, additionalProperties);
        }
    }
}