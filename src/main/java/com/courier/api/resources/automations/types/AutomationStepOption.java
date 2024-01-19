/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.automations.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = AutomationStepOption.Deserializer.class)
public final class AutomationStepOption {
    private final Object value;

    private final int type;

    private AutomationStepOption(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((AutomationCancelStep) this.value);
        } else if (this.type == 1) {
            return visitor.visit((AutomationDelayStep) this.value);
        } else if (this.type == 2) {
            return visitor.visit((AutomationInvokeStep) this.value);
        } else if (this.type == 3) {
            return visitor.visit((AutomationSendStep) this.value);
        } else if (this.type == 4) {
            return visitor.visit((AutomationV2SendStep) this.value);
        } else if (this.type == 5) {
            return visitor.visit((AutomationSendListStep) this.value);
        } else if (this.type == 6) {
            return visitor.visit((AutomationUpdateProfileStep) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AutomationStepOption && equalTo((AutomationStepOption) other);
    }

    private boolean equalTo(AutomationStepOption other) {
        return value.equals(other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @java.lang.Override
    public String toString() {
        return this.value.toString();
    }

    public static AutomationStepOption of(AutomationCancelStep value) {
        return new AutomationStepOption(value, 0);
    }

    public static AutomationStepOption of(AutomationDelayStep value) {
        return new AutomationStepOption(value, 1);
    }

    public static AutomationStepOption of(AutomationInvokeStep value) {
        return new AutomationStepOption(value, 2);
    }

    public static AutomationStepOption of(AutomationSendStep value) {
        return new AutomationStepOption(value, 3);
    }

    public static AutomationStepOption of(AutomationV2SendStep value) {
        return new AutomationStepOption(value, 4);
    }

    public static AutomationStepOption of(AutomationSendListStep value) {
        return new AutomationStepOption(value, 5);
    }

    public static AutomationStepOption of(AutomationUpdateProfileStep value) {
        return new AutomationStepOption(value, 6);
    }

    public interface Visitor<T> {
        T visit(AutomationCancelStep value);

        T visit(AutomationDelayStep value);

        T visit(AutomationInvokeStep value);

        T visit(AutomationSendStep value);

        T visit(AutomationV2SendStep value);

        T visit(AutomationSendListStep value);

        T visit(AutomationUpdateProfileStep value);
    }

    static final class Deserializer extends StdDeserializer<AutomationStepOption> {
        Deserializer() {
            super(AutomationStepOption.class);
        }

        @java.lang.Override
        public AutomationStepOption deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, AutomationCancelStep.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, AutomationDelayStep.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, AutomationInvokeStep.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, AutomationSendStep.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, AutomationV2SendStep.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, AutomationSendListStep.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, AutomationUpdateProfileStep.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}