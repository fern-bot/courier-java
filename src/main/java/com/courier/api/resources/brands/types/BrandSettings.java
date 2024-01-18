/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.brands.types;

import com.courier.api.core.ObjectMappers;
import com.courier.api.resources.commons.types.Email;
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
@JsonDeserialize(builder = BrandSettings.Builder.class)
public final class BrandSettings {
    private final Optional<BrandColors> colors;

    private final Optional<Object> inapp;

    private final Optional<Email> email;

    private final Map<String, Object> additionalProperties;

    private BrandSettings(
            Optional<BrandColors> colors,
            Optional<Object> inapp,
            Optional<Email> email,
            Map<String, Object> additionalProperties) {
        this.colors = colors;
        this.inapp = inapp;
        this.email = email;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("colors")
    public Optional<BrandColors> getColors() {
        return colors;
    }

    @JsonProperty("inapp")
    public Optional<Object> getInapp() {
        return inapp;
    }

    @JsonProperty("email")
    public Optional<Email> getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BrandSettings && equalTo((BrandSettings) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BrandSettings other) {
        return colors.equals(other.colors) && inapp.equals(other.inapp) && email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.colors, this.inapp, this.email);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<BrandColors> colors = Optional.empty();

        private Optional<Object> inapp = Optional.empty();

        private Optional<Email> email = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(BrandSettings other) {
            colors(other.getColors());
            inapp(other.getInapp());
            email(other.getEmail());
            return this;
        }

        @JsonSetter(value = "colors", nulls = Nulls.SKIP)
        public Builder colors(Optional<BrandColors> colors) {
            this.colors = colors;
            return this;
        }

        public Builder colors(BrandColors colors) {
            this.colors = Optional.of(colors);
            return this;
        }

        @JsonSetter(value = "inapp", nulls = Nulls.SKIP)
        public Builder inapp(Optional<Object> inapp) {
            this.inapp = inapp;
            return this;
        }

        public Builder inapp(Object inapp) {
            this.inapp = Optional.of(inapp);
            return this;
        }

        @JsonSetter(value = "email", nulls = Nulls.SKIP)
        public Builder email(Optional<Email> email) {
            this.email = email;
            return this;
        }

        public Builder email(Email email) {
            this.email = Optional.of(email);
            return this;
        }

        public BrandSettings build() {
            return new BrandSettings(colors, inapp, email, additionalProperties);
        }
    }
}
