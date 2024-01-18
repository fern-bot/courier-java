/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.send.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import java.util.Map;

public final class ListRecipientType implements IListRecipientType {
    private final Map<String, Object> additionalProperties;

    private ListRecipientType(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ListRecipientType;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }
}
