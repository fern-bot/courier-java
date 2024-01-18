/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.templates;

import com.courier.api.core.ApiError;
import com.courier.api.core.ClientOptions;
import com.courier.api.core.ObjectMappers;
import com.courier.api.core.RequestOptions;
import com.courier.api.resources.templates.requests.ListTemplatesRequest;
import com.courier.api.resources.templates.types.ListTemplatesResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public class TemplatesClient {
    protected final ClientOptions clientOptions;

    public TemplatesClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Returns a list of notification templates
     */
    public ListTemplatesResponse list() {
        return list(ListTemplatesRequest.builder().build());
    }

    /**
     * Returns a list of notification templates
     */
    public ListTemplatesResponse list(ListTemplatesRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications");
        if (request.getCursor().isPresent()) {
            httpUrl.addQueryParameter("cursor", request.getCursor().get());
        }
        Request.Builder _requestBuilder = new Request.Builder()
                .url(httpUrl.build())
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json");
        Request okhttpRequest = _requestBuilder.build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ListTemplatesResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns a list of notification templates
     */
    public ListTemplatesResponse list(ListTemplatesRequest request) {
        return list(request, null);
    }
}
