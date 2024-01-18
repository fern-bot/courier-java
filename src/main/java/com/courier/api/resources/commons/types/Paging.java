/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.commons.types;

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
@JsonDeserialize(builder = Paging.Builder.class)
public final class Paging {
    private final Optional<String> cursor;

    private final boolean more;

    private final Map<String, Object> additionalProperties;

    private Paging(Optional<String> cursor, boolean more, Map<String, Object> additionalProperties) {
        this.cursor = cursor;
        this.more = more;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("cursor")
    public Optional<String> getCursor() {
        return cursor;
    }

    @JsonProperty("more")
    public boolean getMore() {
        return more;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Paging && equalTo((Paging) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Paging other) {
        return cursor.equals(other.cursor) && more == other.more;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.cursor, this.more);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static MoreStage builder() {
        return new Builder();
    }

    public interface MoreStage {
        _FinalStage more(boolean more);

        Builder from(Paging other);
    }

    public interface _FinalStage {
        Paging build();

        _FinalStage cursor(Optional<String> cursor);

        _FinalStage cursor(String cursor);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements MoreStage, _FinalStage {
        private boolean more;

        private Optional<String> cursor = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Paging other) {
            cursor(other.getCursor());
            more(other.getMore());
            return this;
        }

        @Override
        @JsonSetter("more")
        public _FinalStage more(boolean more) {
            this.more = more;
            return this;
        }

        @Override
        public _FinalStage cursor(String cursor) {
            this.cursor = Optional.of(cursor);
            return this;
        }

        @Override
        @JsonSetter(value = "cursor", nulls = Nulls.SKIP)
        public _FinalStage cursor(Optional<String> cursor) {
            this.cursor = cursor;
            return this;
        }

        @Override
        public Paging build() {
            return new Paging(cursor, more, additionalProperties);
        }
    }
}
