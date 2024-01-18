/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.users.tokens.types;

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
@JsonDeserialize(builder = UserToken.Builder.class)
public final class UserToken implements IUserToken {
    private final Optional<String> token;

    private final ProviderKey providerKey;

    private final Optional<ExpiryDate> expiryDate;

    private final Optional<Object> properties;

    private final Optional<Device> device;

    private final Optional<Tracking> tracking;

    private final Map<String, Object> additionalProperties;

    private UserToken(
            Optional<String> token,
            ProviderKey providerKey,
            Optional<ExpiryDate> expiryDate,
            Optional<Object> properties,
            Optional<Device> device,
            Optional<Tracking> tracking,
            Map<String, Object> additionalProperties) {
        this.token = token;
        this.providerKey = providerKey;
        this.expiryDate = expiryDate;
        this.properties = properties;
        this.device = device;
        this.tracking = tracking;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return Full body of the token. Must match token in URL.
     */
    @JsonProperty("token")
    @Override
    public Optional<String> getToken() {
        return token;
    }

    @JsonProperty("provider_key")
    @Override
    public ProviderKey getProviderKey() {
        return providerKey;
    }

    /**
     * @return ISO 8601 formatted date the token expires. Defaults to 2 months. Set to false to disable expiration.
     */
    @JsonProperty("expiry_date")
    @Override
    public Optional<ExpiryDate> getExpiryDate() {
        return expiryDate;
    }

    /**
     * @return Properties sent to the provider along with the token
     */
    @JsonProperty("properties")
    @Override
    public Optional<Object> getProperties() {
        return properties;
    }

    /**
     * @return Information about the device the token is associated with.
     */
    @JsonProperty("device")
    @Override
    public Optional<Device> getDevice() {
        return device;
    }

    /**
     * @return Information about the device the token is associated with.
     */
    @JsonProperty("tracking")
    @Override
    public Optional<Tracking> getTracking() {
        return tracking;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserToken && equalTo((UserToken) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserToken other) {
        return token.equals(other.token)
                && providerKey.equals(other.providerKey)
                && expiryDate.equals(other.expiryDate)
                && properties.equals(other.properties)
                && device.equals(other.device)
                && tracking.equals(other.tracking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.token, this.providerKey, this.expiryDate, this.properties, this.device, this.tracking);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static ProviderKeyStage builder() {
        return new Builder();
    }

    public interface ProviderKeyStage {
        _FinalStage providerKey(ProviderKey providerKey);

        Builder from(UserToken other);
    }

    public interface _FinalStage {
        UserToken build();

        _FinalStage token(Optional<String> token);

        _FinalStage token(String token);

        _FinalStage expiryDate(Optional<ExpiryDate> expiryDate);

        _FinalStage expiryDate(ExpiryDate expiryDate);

        _FinalStage properties(Optional<Object> properties);

        _FinalStage properties(Object properties);

        _FinalStage device(Optional<Device> device);

        _FinalStage device(Device device);

        _FinalStage tracking(Optional<Tracking> tracking);

        _FinalStage tracking(Tracking tracking);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ProviderKeyStage, _FinalStage {
        private ProviderKey providerKey;

        private Optional<Tracking> tracking = Optional.empty();

        private Optional<Device> device = Optional.empty();

        private Optional<Object> properties = Optional.empty();

        private Optional<ExpiryDate> expiryDate = Optional.empty();

        private Optional<String> token = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(UserToken other) {
            token(other.getToken());
            providerKey(other.getProviderKey());
            expiryDate(other.getExpiryDate());
            properties(other.getProperties());
            device(other.getDevice());
            tracking(other.getTracking());
            return this;
        }

        @Override
        @JsonSetter("provider_key")
        public _FinalStage providerKey(ProviderKey providerKey) {
            this.providerKey = providerKey;
            return this;
        }

        /**
         * <p>Information about the device the token is associated with.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage tracking(Tracking tracking) {
            this.tracking = Optional.of(tracking);
            return this;
        }

        @Override
        @JsonSetter(value = "tracking", nulls = Nulls.SKIP)
        public _FinalStage tracking(Optional<Tracking> tracking) {
            this.tracking = tracking;
            return this;
        }

        /**
         * <p>Information about the device the token is associated with.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage device(Device device) {
            this.device = Optional.of(device);
            return this;
        }

        @Override
        @JsonSetter(value = "device", nulls = Nulls.SKIP)
        public _FinalStage device(Optional<Device> device) {
            this.device = device;
            return this;
        }

        /**
         * <p>Properties sent to the provider along with the token</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage properties(Object properties) {
            this.properties = Optional.of(properties);
            return this;
        }

        @Override
        @JsonSetter(value = "properties", nulls = Nulls.SKIP)
        public _FinalStage properties(Optional<Object> properties) {
            this.properties = properties;
            return this;
        }

        /**
         * <p>ISO 8601 formatted date the token expires. Defaults to 2 months. Set to false to disable expiration.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage expiryDate(ExpiryDate expiryDate) {
            this.expiryDate = Optional.of(expiryDate);
            return this;
        }

        @Override
        @JsonSetter(value = "expiry_date", nulls = Nulls.SKIP)
        public _FinalStage expiryDate(Optional<ExpiryDate> expiryDate) {
            this.expiryDate = expiryDate;
            return this;
        }

        /**
         * <p>Full body of the token. Must match token in URL.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage token(String token) {
            this.token = Optional.of(token);
            return this;
        }

        @Override
        @JsonSetter(value = "token", nulls = Nulls.SKIP)
        public _FinalStage token(Optional<String> token) {
            this.token = token;
            return this;
        }

        @Override
        public UserToken build() {
            return new UserToken(token, providerKey, expiryDate, properties, device, tracking, additionalProperties);
        }
    }
}
