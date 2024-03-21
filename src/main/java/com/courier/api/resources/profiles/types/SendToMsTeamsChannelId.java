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
@JsonDeserialize(builder = SendToMsTeamsChannelId.Builder.class)
public final class SendToMsTeamsChannelId implements IMsTeamsBaseProperties {
    private final String tenantId;

    private final String serviceUrl;

    private final String channelId;

    private final Map<String, Object> additionalProperties;

    private SendToMsTeamsChannelId(
            String tenantId, String serviceUrl, String channelId, Map<String, Object> additionalProperties) {
        this.tenantId = tenantId;
        this.serviceUrl = serviceUrl;
        this.channelId = channelId;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("tenant_id")
    @java.lang.Override
    public String getTenantId() {
        return tenantId;
    }

    @JsonProperty("service_url")
    @java.lang.Override
    public String getServiceUrl() {
        return serviceUrl;
    }

    @JsonProperty("channel_id")
    public String getChannelId() {
        return channelId;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SendToMsTeamsChannelId && equalTo((SendToMsTeamsChannelId) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SendToMsTeamsChannelId other) {
        return tenantId.equals(other.tenantId)
                && serviceUrl.equals(other.serviceUrl)
                && channelId.equals(other.channelId);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.tenantId, this.serviceUrl, this.channelId);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TenantIdStage builder() {
        return new Builder();
    }

    public interface TenantIdStage {
        ServiceUrlStage tenantId(String tenantId);

        Builder from(SendToMsTeamsChannelId other);
    }

    public interface ServiceUrlStage {
        ChannelIdStage serviceUrl(String serviceUrl);
    }

    public interface ChannelIdStage {
        _FinalStage channelId(String channelId);
    }

    public interface _FinalStage {
        SendToMsTeamsChannelId build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TenantIdStage, ServiceUrlStage, ChannelIdStage, _FinalStage {
        private String tenantId;

        private String serviceUrl;

        private String channelId;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(SendToMsTeamsChannelId other) {
            tenantId(other.getTenantId());
            serviceUrl(other.getServiceUrl());
            channelId(other.getChannelId());
            return this;
        }

        @java.lang.Override
        @JsonSetter("tenant_id")
        public ServiceUrlStage tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("service_url")
        public ChannelIdStage serviceUrl(String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }

        @java.lang.Override
        @JsonSetter("channel_id")
        public _FinalStage channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        @java.lang.Override
        public SendToMsTeamsChannelId build() {
            return new SendToMsTeamsChannelId(tenantId, serviceUrl, channelId, additionalProperties);
        }
    }
}