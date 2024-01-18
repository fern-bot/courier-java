/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.bulk.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = InboundBulkMessageV2.Deserializer.class)
public final class InboundBulkMessageV2 {
    private final Object value;

    private final int type;

    private InboundBulkMessageV2(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((InboundBulkTemplateMessage) this.value);
        } else if (this.type == 1) {
            return visitor.visit((InboundBulkContentMessage) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof InboundBulkMessageV2 && equalTo((InboundBulkMessageV2) other);
    }

    private boolean equalTo(InboundBulkMessageV2 other) {
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

    public static InboundBulkMessageV2 of(InboundBulkTemplateMessage value) {
        return new InboundBulkMessageV2(value, 0);
    }

    public static InboundBulkMessageV2 of(InboundBulkContentMessage value) {
        return new InboundBulkMessageV2(value, 1);
    }

    public interface Visitor<T> {
        T visit(InboundBulkTemplateMessage value);

        T visit(InboundBulkContentMessage value);
    }

    static final class Deserializer extends StdDeserializer<InboundBulkMessageV2> {
        Deserializer() {
            super(InboundBulkMessageV2.class);
        }

        @Override
        public InboundBulkMessageV2 deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, InboundBulkTemplateMessage.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, InboundBulkContentMessage.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}
