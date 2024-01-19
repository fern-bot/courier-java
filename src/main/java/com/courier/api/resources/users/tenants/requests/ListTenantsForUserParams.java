/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.users.tenants.requests;

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
@JsonDeserialize(builder = ListTenantsForUserParams.Builder.class)
public final class ListTenantsForUserParams {
    private final Optional<Integer> limit;

    private final Optional<Integer> startingAfter;

    private final Map<String, Object> additionalProperties;

    private ListTenantsForUserParams(
            Optional<Integer> limit, Optional<Integer> startingAfter, Map<String, Object> additionalProperties) {
        this.limit = limit;
        this.startingAfter = startingAfter;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The number of accounts to return
     * (defaults to 20, maximum value of 100)
     */
    @JsonProperty("limit")
    public Optional<Integer> getLimit() {
        return limit;
    }

    /**
     * @return Value of next_page from previous response
     */
    @JsonProperty("starting_after")
    public Optional<Integer> getStartingAfter() {
        return startingAfter;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListTenantsForUserParams && equalTo((ListTenantsForUserParams) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(ListTenantsForUserParams other) {
        return limit.equals(other.limit) && startingAfter.equals(other.startingAfter);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.limit, this.startingAfter);
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
        private Optional<Integer> limit = Optional.empty();

        private Optional<Integer> startingAfter = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(ListTenantsForUserParams other) {
            limit(other.getLimit());
            startingAfter(other.getStartingAfter());
            return this;
        }

        @JsonSetter(value = "limit", nulls = Nulls.SKIP)
        public Builder limit(Optional<Integer> limit) {
            this.limit = limit;
            return this;
        }

        public Builder limit(Integer limit) {
            this.limit = Optional.of(limit);
            return this;
        }

        @JsonSetter(value = "starting_after", nulls = Nulls.SKIP)
        public Builder startingAfter(Optional<Integer> startingAfter) {
            this.startingAfter = startingAfter;
            return this;
        }

        public Builder startingAfter(Integer startingAfter) {
            this.startingAfter = Optional.of(startingAfter);
            return this;
        }

        public ListTenantsForUserParams build() {
            return new ListTenantsForUserParams(limit, startingAfter, additionalProperties);
        }
    }
}