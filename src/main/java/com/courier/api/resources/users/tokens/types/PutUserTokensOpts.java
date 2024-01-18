/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.users.tokens.types;

import com.courier.api.core.ObjectMappers;
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
@JsonDeserialize(builder = PutUserTokensOpts.Builder.class)
public final class PutUserTokensOpts {
    private final String userId;

    private final List<UserToken> tokens;

    private final Map<String, Object> additionalProperties;

    private PutUserTokensOpts(String userId, List<UserToken> tokens, Map<String, Object> additionalProperties) {
        this.userId = userId;
        this.tokens = tokens;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("tokens")
    public List<UserToken> getTokens() {
        return tokens;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PutUserTokensOpts && equalTo((PutUserTokensOpts) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(PutUserTokensOpts other) {
        return userId.equals(other.userId) && tokens.equals(other.tokens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userId, this.tokens);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static UserIdStage builder() {
        return new Builder();
    }

    public interface UserIdStage {
        _FinalStage userId(String userId);

        Builder from(PutUserTokensOpts other);
    }

    public interface _FinalStage {
        PutUserTokensOpts build();

        _FinalStage tokens(List<UserToken> tokens);

        _FinalStage addTokens(UserToken tokens);

        _FinalStage addAllTokens(List<UserToken> tokens);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements UserIdStage, _FinalStage {
        private String userId;

        private List<UserToken> tokens = new ArrayList<>();

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @Override
        public Builder from(PutUserTokensOpts other) {
            userId(other.getUserId());
            tokens(other.getTokens());
            return this;
        }

        @Override
        @JsonSetter("user_id")
        public _FinalStage userId(String userId) {
            this.userId = userId;
            return this;
        }

        @Override
        public _FinalStage addAllTokens(List<UserToken> tokens) {
            this.tokens.addAll(tokens);
            return this;
        }

        @Override
        public _FinalStage addTokens(UserToken tokens) {
            this.tokens.add(tokens);
            return this;
        }

        @Override
        @JsonSetter(value = "tokens", nulls = Nulls.SKIP)
        public _FinalStage tokens(List<UserToken> tokens) {
            this.tokens.clear();
            this.tokens.addAll(tokens);
            return this;
        }

        @Override
        public PutUserTokensOpts build() {
            return new PutUserTokensOpts(userId, tokens, additionalProperties);
        }
    }
}
