/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.automations.types;

import java.util.Map;
import java.util.Optional;

public interface IAutomationInvokeParams {
    Optional<String> getBrand();

    Optional<Map<String, Object>> getData();

    Optional<Object> getProfile();

    Optional<String> getRecipient();

    Optional<String> getTemplate();
}