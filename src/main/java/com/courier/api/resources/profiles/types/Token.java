/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.profiles.types;

import com.courier.api.core.ObjectMappers;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Token.Builder.class)
public final class Token {
    private final String token;

    private final Map<String, Object> additionalProperties;

    private Token(String token, Map<String, Object> additionalProperties) {
        this.token = token;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Token && equalTo((Token) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(Token other) {
        return token.equals(other.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.token);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static TokenStage builder() {
        return new Builder();
    }

    public interface TokenStage {
        _FinalStage token(String token);

        Builder from(Token other);
    }

    public interface _FinalStage {
        Token build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements TokenStage, _FinalStage {
        private String token;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(Token other) {
            token(other.getToken());
            return this;
        }

        @Override
        @JsonSetter("token")
        public _FinalStage token(String token) {
            this.token = token;
            return this;
        }

        @Override
        public Token build() {
            return new Token(token, additionalProperties);
        }
    }
}
