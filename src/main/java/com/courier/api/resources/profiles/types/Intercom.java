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
@JsonDeserialize(builder = Intercom.Builder.class)
public final class Intercom {
    private final String from;

    private final IntercomeRecipient to;

    private final Map<String, Object> additionalProperties;

    private Intercom(String from, IntercomeRecipient to, Map<String, Object> additionalProperties) {
        this.from = from;
        this.to = to;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("to")
    public IntercomeRecipient getTo() {
        return to;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Intercom && equalTo((Intercom) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Intercom other) {
        return from.equals(other.from) && to.equals(other.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.from, this.to);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static FromStage builder() {
        return new Builder();
    }

    public interface FromStage {
        ToStage from(String from);

        Builder from(Intercom other);
    }

    public interface ToStage {
        _FinalStage to(IntercomeRecipient to);
    }

    public interface _FinalStage {
        Intercom build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements FromStage, ToStage, _FinalStage {
        private String from;

        private IntercomeRecipient to;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Intercom other) {
            from(other.getFrom());
            to(other.getTo());
            return this;
        }

        @Override
        @JsonSetter("from")
        public ToStage from(String from) {
            this.from = from;
            return this;
        }

        @Override
        @JsonSetter("to")
        public _FinalStage to(IntercomeRecipient to) {
            this.to = to;
            return this;
        }

        @Override
        public Intercom build() {
            return new Intercom(from, to, additionalProperties);
        }
    }
}
