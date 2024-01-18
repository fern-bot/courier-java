/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.send.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InAppPlacement {
    TOP("top"),

    BOTTOM("bottom"),

    LEFT("left"),

    RIGHT("right");

    private final String value;

    InAppPlacement(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
