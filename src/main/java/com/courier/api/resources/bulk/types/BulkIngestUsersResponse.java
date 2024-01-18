/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.bulk.types;

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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = BulkIngestUsersResponse.Builder.class)
public final class BulkIngestUsersResponse {
    private final int total;

    private final Optional<List<BulkIngestError>> errors;

    private final Map<String, Object> additionalProperties;

    private BulkIngestUsersResponse(
            int total, Optional<List<BulkIngestError>> errors, Map<String, Object> additionalProperties) {
        this.total = total;
        this.errors = errors;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    @JsonProperty("errors")
    public Optional<List<BulkIngestError>> getErrors() {
        return errors;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BulkIngestUsersResponse && equalTo((BulkIngestUsersResponse) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BulkIngestUsersResponse other) {
        return total == other.total && errors.equals(other.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.total, this.errors);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TotalStage builder() {
        return new Builder();
    }

    public interface TotalStage {
        _FinalStage total(int total);

        Builder from(BulkIngestUsersResponse other);
    }

    public interface _FinalStage {
        BulkIngestUsersResponse build();

        _FinalStage errors(Optional<List<BulkIngestError>> errors);

        _FinalStage errors(List<BulkIngestError> errors);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TotalStage, _FinalStage {
        private int total;

        private Optional<List<BulkIngestError>> errors = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(BulkIngestUsersResponse other) {
            total(other.getTotal());
            errors(other.getErrors());
            return this;
        }

        @Override
        @JsonSetter("total")
        public _FinalStage total(int total) {
            this.total = total;
            return this;
        }

        @Override
        public _FinalStage errors(List<BulkIngestError> errors) {
            this.errors = Optional.of(errors);
            return this;
        }

        @Override
        @JsonSetter(value = "errors", nulls = Nulls.SKIP)
        public _FinalStage errors(Optional<List<BulkIngestError>> errors) {
            this.errors = errors;
            return this;
        }

        @Override
        public BulkIngestUsersResponse build() {
            return new BulkIngestUsersResponse(total, errors, additionalProperties);
        }
    }
}
