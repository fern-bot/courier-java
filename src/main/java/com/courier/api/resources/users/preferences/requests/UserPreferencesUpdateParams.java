/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.users.preferences.requests;

import com.courier.api.core.ObjectMappers;
import com.courier.api.resources.commons.types.ChannelClassification;
import com.courier.api.resources.commons.types.PreferenceStatus;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = UserPreferencesUpdateParams.Builder.class)
public final class UserPreferencesUpdateParams {
    private final PreferenceStatus status;

    private final Optional<List<ChannelClassification>> customRouting;

    private final PreferenceStatus defaultStatus;

    private final Optional<Boolean> hasCustomRouting;

    private final Map<String, Object> additionalProperties;

    private UserPreferencesUpdateParams(
            PreferenceStatus status,
            Optional<List<ChannelClassification>> customRouting,
            PreferenceStatus defaultStatus,
            Optional<Boolean> hasCustomRouting,
            Map<String, Object> additionalProperties) {
        this.status = status;
        this.customRouting = customRouting;
        this.defaultStatus = defaultStatus;
        this.hasCustomRouting = hasCustomRouting;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("status")
    public PreferenceStatus getStatus() {
        return status;
    }

    /**
     * @return The Channels a user has chosen to receive notifications through for this topic
     */
    @JsonProperty("custom_routing")
    public Optional<List<ChannelClassification>> getCustomRouting() {
        return customRouting;
    }

    @JsonProperty("default_status")
    public PreferenceStatus getDefaultStatus() {
        return defaultStatus;
    }

    @JsonProperty("has_custom_routing")
    public Optional<Boolean> getHasCustomRouting() {
        return hasCustomRouting;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof UserPreferencesUpdateParams && equalTo((UserPreferencesUpdateParams) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(UserPreferencesUpdateParams other) {
        return status.equals(other.status)
                && customRouting.equals(other.customRouting)
                && defaultStatus.equals(other.defaultStatus)
                && hasCustomRouting.equals(other.hasCustomRouting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.status, this.customRouting, this.defaultStatus, this.hasCustomRouting);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static StatusStage builder() {
        return new Builder();
    }

    public interface StatusStage {
        DefaultStatusStage status(PreferenceStatus status);

        Builder from(UserPreferencesUpdateParams other);
    }

    public interface DefaultStatusStage {
        _FinalStage defaultStatus(PreferenceStatus defaultStatus);
    }

    public interface _FinalStage {
        UserPreferencesUpdateParams build();

        _FinalStage customRouting(Optional<List<ChannelClassification>> customRouting);

        _FinalStage customRouting(List<ChannelClassification> customRouting);

        _FinalStage hasCustomRouting(Optional<Boolean> hasCustomRouting);

        _FinalStage hasCustomRouting(Boolean hasCustomRouting);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements StatusStage, DefaultStatusStage, _FinalStage {
        private PreferenceStatus status;

        private PreferenceStatus defaultStatus;

        private Optional<Boolean> hasCustomRouting = Optional.empty();

        private Optional<List<ChannelClassification>> customRouting = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(UserPreferencesUpdateParams other) {
            status(other.getStatus());
            customRouting(other.getCustomRouting());
            defaultStatus(other.getDefaultStatus());
            hasCustomRouting(other.getHasCustomRouting());
            return this;
        }

        @Override
        @JsonSetter("status")
        public DefaultStatusStage status(PreferenceStatus status) {
            this.status = status;
            return this;
        }

        @Override
        @JsonSetter("default_status")
        public _FinalStage defaultStatus(PreferenceStatus defaultStatus) {
            this.defaultStatus = defaultStatus;
            return this;
        }

        @Override
        public _FinalStage hasCustomRouting(Boolean hasCustomRouting) {
            this.hasCustomRouting = Optional.of(hasCustomRouting);
            return this;
        }

        @Override
        @JsonSetter(value = "has_custom_routing", nulls = Nulls.SKIP)
        public _FinalStage hasCustomRouting(Optional<Boolean> hasCustomRouting) {
            this.hasCustomRouting = hasCustomRouting;
            return this;
        }

        /**
         * <p>The Channels a user has chosen to receive notifications through for this topic</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage customRouting(List<ChannelClassification> customRouting) {
            this.customRouting = Optional.of(customRouting);
            return this;
        }

        @Override
        @JsonSetter(value = "custom_routing", nulls = Nulls.SKIP)
        public _FinalStage customRouting(Optional<List<ChannelClassification>> customRouting) {
            this.customRouting = customRouting;
            return this;
        }

        @Override
        public UserPreferencesUpdateParams build() {
            return new UserPreferencesUpdateParams(
                    status, customRouting, defaultStatus, hasCustomRouting, additionalProperties);
        }
    }
}
