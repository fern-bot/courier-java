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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AudienceRecipient.Builder.class)
public final class AudienceRecipient {
    private final String audienceId;

    private final Optional<Map<String, Object>> data;

    private final Optional<List<AudienceFilter>> filters;

    private final Map<String, Object> additionalProperties;

    private AudienceRecipient(
            String audienceId,
            Optional<Map<String, Object>> data,
            Optional<List<AudienceFilter>> filters,
            Map<String, Object> additionalProperties) {
        this.audienceId = audienceId;
        this.data = data;
        this.filters = filters;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return A unique identifier associated with an Audience. A message will be sent to each user in the audience.
     */
    @JsonProperty("audience_id")
    public String getAudienceId() {
        return audienceId;
    }

    @JsonProperty("data")
    public Optional<Map<String, Object>> getData() {
        return data;
    }

    @JsonProperty("filters")
    public Optional<List<AudienceFilter>> getFilters() {
        return filters;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AudienceRecipient && equalTo((AudienceRecipient) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AudienceRecipient other) {
        return audienceId.equals(other.audienceId) && data.equals(other.data) && filters.equals(other.filters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.audienceId, this.data, this.filters);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AudienceIdStage builder() {
        return new Builder();
    }

    public interface AudienceIdStage {
        _FinalStage audienceId(String audienceId);

        Builder from(AudienceRecipient other);
    }

    public interface _FinalStage {
        AudienceRecipient build();

        _FinalStage data(Optional<Map<String, Object>> data);

        _FinalStage data(Map<String, Object> data);

        _FinalStage filters(Optional<List<AudienceFilter>> filters);

        _FinalStage filters(List<AudienceFilter> filters);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements AudienceIdStage, _FinalStage {
        private String audienceId;

        private Optional<List<AudienceFilter>> filters = Optional.empty();

        private Optional<Map<String, Object>> data = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(AudienceRecipient other) {
            audienceId(other.getAudienceId());
            data(other.getData());
            filters(other.getFilters());
            return this;
        }

        /**
         * <p>A unique identifier associated with an Audience. A message will be sent to each user in the audience.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("audience_id")
        public _FinalStage audienceId(String audienceId) {
            this.audienceId = audienceId;
            return this;
        }

        @Override
        public _FinalStage filters(List<AudienceFilter> filters) {
            this.filters = Optional.of(filters);
            return this;
        }

        @Override
        @JsonSetter(value = "filters", nulls = Nulls.SKIP)
        public _FinalStage filters(Optional<List<AudienceFilter>> filters) {
            this.filters = filters;
            return this;
        }

        @Override
        public _FinalStage data(Map<String, Object> data) {
            this.data = Optional.of(data);
            return this;
        }

        @Override
        @JsonSetter(value = "data", nulls = Nulls.SKIP)
        public _FinalStage data(Optional<Map<String, Object>> data) {
            this.data = data;
            return this;
        }

        @Override
        public AudienceRecipient build() {
            return new AudienceRecipient(audienceId, data, filters, additionalProperties);
        }
    }
}
