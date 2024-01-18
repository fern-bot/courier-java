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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Delay.Builder.class)
public final class Delay {
    private final int duration;

    private final Map<String, Object> additionalProperties;

    private Delay(int duration, Map<String, Object> additionalProperties) {
        this.duration = duration;
        this.additionalProperties = additionalProperties;
    }

    /**
     * @return The duration of the delay in milliseconds.
     */
    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Delay && equalTo((Delay) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Delay other) {
        return duration == other.duration;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.duration);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static DurationStage builder() {
        return new Builder();
    }

    public interface DurationStage {
        _FinalStage duration(int duration);

        Builder from(Delay other);
    }

    public interface _FinalStage {
        Delay build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements DurationStage, _FinalStage {
        private int duration;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Delay other) {
            duration(other.getDuration());
            return this;
        }

        /**
         * <p>The duration of the delay in milliseconds.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("duration")
        public _FinalStage duration(int duration) {
            this.duration = duration;
            return this;
        }

        @Override
        public Delay build() {
            return new Delay(duration, additionalProperties);
        }
    }
}
