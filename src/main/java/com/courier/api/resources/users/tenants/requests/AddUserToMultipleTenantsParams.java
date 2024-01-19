/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.users.tenants.requests;

import com.courier.api.core.ObjectMappers;
import com.courier.api.resources.users.tenants.types.UserTenantAssociation;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AddUserToMultipleTenantsParams.Builder.class)
public final class AddUserToMultipleTenantsParams {
    private final List<UserTenantAssociation> tenants;

    private final Map<String, Object> additionalProperties;

    private AddUserToMultipleTenantsParams(
            List<UserTenantAssociation> tenants, Map<String, Object> additionalProperties) {
        this.tenants = tenants;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("tenants")
    public List<UserTenantAssociation> getTenants() {
        return tenants;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AddUserToMultipleTenantsParams && equalTo((AddUserToMultipleTenantsParams) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(AddUserToMultipleTenantsParams other) {
        return tenants.equals(other.tenants);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.tenants);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private List<UserTenantAssociation> tenants = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        public Builder from(AddUserToMultipleTenantsParams other) {
            tenants(other.getTenants());
            return this;
        }

        @JsonSetter(value = "tenants", nulls = Nulls.SKIP)
        public Builder tenants(List<UserTenantAssociation> tenants) {
            this.tenants.clear();
            this.tenants.addAll(tenants);
            return this;
        }

        public Builder addTenants(UserTenantAssociation tenants) {
            this.tenants.add(tenants);
            return this;
        }

        public Builder addAllTenants(List<UserTenantAssociation> tenants) {
            this.tenants.addAll(tenants);
            return this;
        }

        public AddUserToMultipleTenantsParams build() {
            return new AddUserToMultipleTenantsParams(tenants, additionalProperties);
        }
    }
}