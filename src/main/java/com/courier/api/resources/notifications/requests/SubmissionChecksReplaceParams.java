/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.notifications.requests;

import com.courier.api.core.ObjectMappers;
import com.courier.api.resources.notifications.types.BaseCheck;
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
@JsonDeserialize(builder = SubmissionChecksReplaceParams.Builder.class)
public final class SubmissionChecksReplaceParams {
    private final List<BaseCheck> checks;

    private final Map<String, Object> additionalProperties;

    private SubmissionChecksReplaceParams(List<BaseCheck> checks, Map<String, Object> additionalProperties) {
        this.checks = checks;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("checks")
    public List<BaseCheck> getChecks() {
        return checks;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof SubmissionChecksReplaceParams && equalTo((SubmissionChecksReplaceParams) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(SubmissionChecksReplaceParams other) {
        return checks.equals(other.checks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.checks);
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
        private List<BaseCheck> checks = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(SubmissionChecksReplaceParams other) {
            checks(other.getChecks());
            return this;
        }

        @JsonSetter(value = "checks", nulls = Nulls.SKIP)
        public Builder checks(List<BaseCheck> checks) {
            this.checks.clear();
            this.checks.addAll(checks);
            return this;
        }

        public Builder addChecks(BaseCheck checks) {
            this.checks.add(checks);
            return this;
        }

        public Builder addAllChecks(List<BaseCheck> checks) {
            this.checks.addAll(checks);
            return this;
        }

        public SubmissionChecksReplaceParams build() {
            return new SubmissionChecksReplaceParams(checks, additionalProperties);
        }
    }
}
