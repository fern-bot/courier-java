/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.profiles.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = Discord.Deserializer.class)
public final class Discord {
    private final Object value;

    private final int type;

    private Discord(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((SendToChannel) this.value);
        } else if (this.type == 1) {
            return visitor.visit((SendDirectMessage) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Discord && equalTo((Discord) other);
    }

    private boolean equalTo(Discord other) {
        return value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    public static Discord of(SendToChannel value) {
        return new Discord(value, 0);
    }

    public static Discord of(SendDirectMessage value) {
        return new Discord(value, 1);
    }

    public interface Visitor<T> {
        T visit(SendToChannel value);

        T visit(SendDirectMessage value);
    }

    static final class Deserializer extends StdDeserializer<Discord> {
        Deserializer() {
            super(Discord.class);
        }

        @Override
        public Discord deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, SendToChannel.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, SendDirectMessage.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
