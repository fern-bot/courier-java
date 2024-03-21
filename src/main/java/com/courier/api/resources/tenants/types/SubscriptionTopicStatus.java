/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.tenants.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SubscriptionTopicStatus {
    OPTED_OUT("OPTED_OUT"),

    OPTED_IN("OPTED_IN"),

    REQUIRED("REQUIRED");

    private final String value;

    SubscriptionTopicStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}