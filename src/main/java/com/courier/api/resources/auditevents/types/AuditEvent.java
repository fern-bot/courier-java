/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.auditevents.types;

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
@JsonDeserialize(builder = AuditEvent.Builder.class)
public final class AuditEvent {
    private final Optional<Actor> actor;

    private final Optional<Target> target;

    private final String auditEventId;

    private final String source;

    private final String timestamp;

    private final String type;

    private final Map<String, Object> additionalProperties;

    private AuditEvent(
            Optional<Actor> actor,
            Optional<Target> target,
            String auditEventId,
            String source,
            String timestamp,
            String type,
            Map<String, Object> additionalProperties) {
        this.actor = actor;
        this.target = target;
        this.auditEventId = auditEventId;
        this.source = source;
        this.timestamp = timestamp;
        this.type = type;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("actor")
    public Optional<Actor> getActor() {
        return actor;
    }

    @JsonProperty("target")
    public Optional<Target> getTarget() {
        return target;
    }

    @JsonProperty("auditEventId")
    public String getAuditEventId() {
        return auditEventId;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AuditEvent && equalTo((AuditEvent) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AuditEvent other) {
        return actor.equals(other.actor)
                && target.equals(other.target)
                && auditEventId.equals(other.auditEventId)
                && source.equals(other.source)
                && timestamp.equals(other.timestamp)
                && type.equals(other.type);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.actor, this.target, this.auditEventId, this.source, this.timestamp, this.type);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static AuditEventIdStage builder() {
        return new Builder();
    }

    public interface AuditEventIdStage {
        SourceStage auditEventId(String auditEventId);

        Builder from(AuditEvent other);
    }

    public interface SourceStage {
        TimestampStage source(String source);
    }

    public interface TimestampStage {
        TypeStage timestamp(String timestamp);
    }

    public interface TypeStage {
        _FinalStage type(String type);
    }

    public interface _FinalStage {
        AuditEvent build();

        _FinalStage actor(Optional<Actor> actor);

        _FinalStage actor(Actor actor);

        _FinalStage target(Optional<Target> target);

        _FinalStage target(Target target);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder
            implements AuditEventIdStage, SourceStage, TimestampStage, TypeStage, _FinalStage {
        private String auditEventId;

        private String source;

        private String timestamp;

        private String type;

        private Optional<Target> target = Optional.empty();

        private Optional<Actor> actor = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(AuditEvent other) {
            actor(other.getActor());
            target(other.getTarget());
            auditEventId(other.getAuditEventId());
            source(other.getSource());
            timestamp(other.getTimestamp());
            type(other.getType());
            return this;
        }

        @java.lang.Override
        @JsonSetter("auditEventId")
        public SourceStage auditEventId(String auditEventId) {
            this.auditEventId = auditEventId;
            return this;
        }

        @java.lang.Override
        @JsonSetter("source")
        public TimestampStage source(String source) {
            this.source = source;
            return this;
        }

        @java.lang.Override
        @JsonSetter("timestamp")
        public TypeStage timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        @java.lang.Override
        @JsonSetter("type")
        public _FinalStage type(String type) {
            this.type = type;
            return this;
        }

        @java.lang.Override
        public _FinalStage target(Target target) {
            this.target = Optional.of(target);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "target", nulls = Nulls.SKIP)
        public _FinalStage target(Optional<Target> target) {
            this.target = target;
            return this;
        }

        @java.lang.Override
        public _FinalStage actor(Actor actor) {
            this.actor = Optional.of(actor);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "actor", nulls = Nulls.SKIP)
        public _FinalStage actor(Optional<Actor> actor) {
            this.actor = actor;
            return this;
        }

        @java.lang.Override
        public AuditEvent build() {
            return new AuditEvent(actor, target, auditEventId, source, timestamp, type, additionalProperties);
        }
    }
}