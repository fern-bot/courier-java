/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.brands.types;

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
@JsonDeserialize(builder = BrandParameters.Builder.class)
public final class BrandParameters {
    private final Optional<String> id;

    private final String name;

    private final BrandSettings settings;

    private final Optional<BrandSnippets> snippets;

    private final Map<String, Object> additionalProperties;

    private BrandParameters(
            Optional<String> id,
            String name,
            BrandSettings settings,
            Optional<BrandSnippets> snippets,
            Map<String, Object> additionalProperties) {
        this.id = id;
        this.name = name;
        this.settings = settings;
        this.snippets = snippets;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The name of the brand.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("settings")
    public BrandSettings getSettings() {
        return settings;
    }

    @JsonProperty("snippets")
    public Optional<BrandSnippets> getSnippets() {
        return snippets;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof BrandParameters && equalTo((BrandParameters) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(BrandParameters other) {
        return id.equals(other.id)
                && name.equals(other.name)
                && settings.equals(other.settings)
                && snippets.equals(other.snippets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.settings, this.snippets);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        SettingsStage name(String name);

        Builder from(BrandParameters other);
    }

    public interface SettingsStage {
        _FinalStage settings(BrandSettings settings);
    }

    public interface _FinalStage {
        BrandParameters build();

        _FinalStage id(Optional<String> id);

        _FinalStage id(String id);

        _FinalStage snippets(Optional<BrandSnippets> snippets);

        _FinalStage snippets(BrandSnippets snippets);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, SettingsStage, _FinalStage {
        private String name;

        private BrandSettings settings;

        private Optional<BrandSnippets> snippets = Optional.empty();

        private Optional<String> id = Optional.empty();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(BrandParameters other) {
            id(other.getId());
            name(other.getName());
            settings(other.getSettings());
            snippets(other.getSnippets());
            return this;
        }

        /**
         * <p>The name of the brand.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("name")
        public SettingsStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        @JsonSetter("settings")
        public _FinalStage settings(BrandSettings settings) {
            this.settings = settings;
            return this;
        }

        @Override
        public _FinalStage snippets(BrandSnippets snippets) {
            this.snippets = Optional.of(snippets);
            return this;
        }

        @Override
        @JsonSetter(value = "snippets", nulls = Nulls.SKIP)
        public _FinalStage snippets(Optional<BrandSnippets> snippets) {
            this.snippets = snippets;
            return this;
        }

        @Override
        public _FinalStage id(String id) {
            this.id = Optional.of(id);
            return this;
        }

        @Override
        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public _FinalStage id(Optional<String> id) {
            this.id = id;
            return this;
        }

        @Override
        public BrandParameters build() {
            return new BrandParameters(id, name, settings, snippets, additionalProperties);
        }
    }
}
