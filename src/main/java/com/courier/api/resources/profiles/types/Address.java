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
@JsonDeserialize(builder = Address.Builder.class)
public final class Address {
    private final String formatted;

    private final String streetAddress;

    private final String locality;

    private final String region;

    private final String postalCode;

    private final String country;

    private final Map<String, Object> additionalProperties;

    private Address(
            String formatted,
            String streetAddress,
            String locality,
            String region,
            String postalCode,
            String country,
            Map<String, Object> additionalProperties) {
        this.formatted = formatted;
        this.streetAddress = streetAddress;
        this.locality = locality;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("formatted")
    public String getFormatted() {
        return formatted;
    }

    @JsonProperty("street_address")
    public String getStreetAddress() {
        return streetAddress;
    }

    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Address && equalTo((Address) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Address other) {
        return formatted.equals(other.formatted)
                && streetAddress.equals(other.streetAddress)
                && locality.equals(other.locality)
                && region.equals(other.region)
                && postalCode.equals(other.postalCode)
                && country.equals(other.country);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(
                this.formatted, this.streetAddress, this.locality, this.region, this.postalCode, this.country);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static FormattedStage builder() {
        return new Builder();
    }

    public interface FormattedStage {
        StreetAddressStage formatted(String formatted);

        Builder from(Address other);
    }

    public interface StreetAddressStage {
        LocalityStage streetAddress(String streetAddress);
    }

    public interface LocalityStage {
        RegionStage locality(String locality);
    }

    public interface RegionStage {
        PostalCodeStage region(String region);
    }

    public interface PostalCodeStage {
        CountryStage postalCode(String postalCode);
    }

    public interface CountryStage {
        _FinalStage country(String country);
    }

    public interface _FinalStage {
        Address build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements FormattedStage,
                    StreetAddressStage,
                    LocalityStage,
                    RegionStage,
                    PostalCodeStage,
                    CountryStage,
                    _FinalStage {
        private String formatted;

        private String streetAddress;

        private String locality;

        private String region;

        private String postalCode;

        private String country;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(Address other) {
            formatted(other.getFormatted());
            streetAddress(other.getStreetAddress());
            locality(other.getLocality());
            region(other.getRegion());
            postalCode(other.getPostalCode());
            country(other.getCountry());
            return this;
        }

        @java.lang.Override
        @JsonSetter("formatted")
        public StreetAddressStage formatted(String formatted) {
            this.formatted = formatted;
            return this;
        }

        @java.lang.Override
        @JsonSetter("street_address")
        public LocalityStage streetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }

        @java.lang.Override
        @JsonSetter("locality")
        public RegionStage locality(String locality) {
            this.locality = locality;
            return this;
        }

        @java.lang.Override
        @JsonSetter("region")
        public PostalCodeStage region(String region) {
            this.region = region;
            return this;
        }

        @java.lang.Override
        @JsonSetter("postal_code")
        public CountryStage postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        @java.lang.Override
        @JsonSetter("country")
        public _FinalStage country(String country) {
            this.country = country;
            return this;
        }

        @java.lang.Override
        public Address build() {
            return new Address(formatted, streetAddress, locality, region, postalCode, country, additionalProperties);
        }
    }
}