/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.auditevents;

import com.courier.api.core.ApiError;
import com.courier.api.core.ClientOptions;
import com.courier.api.core.ObjectMappers;
import com.courier.api.core.RequestOptions;
import com.courier.api.resources.auditevents.requests.ListAuditEventsRequest;
import com.courier.api.resources.auditevents.types.AuditEvent;
import com.courier.api.resources.auditevents.types.ListAuditEventsResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

public class AuditEventsClient {
    protected final ClientOptions clientOptions;

    public AuditEventsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    /**
     * Fetch the list of audit events
     */
    public ListAuditEventsResponse list() {
        return list(ListAuditEventsRequest.builder().build());
    }

    /**
     * Fetch the list of audit events
     */
    public ListAuditEventsResponse list(ListAuditEventsRequest request, RequestOptions requestOptions) {
        HttpUrl.Builder httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("audit-events");
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), ListAuditEventsResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Fetch the list of audit events
     */
    public ListAuditEventsResponse list(ListAuditEventsRequest request) {
        return list(request, null);
    }

    /**
     * Fetch a specific audit event by ID.
     */
    public AuditEvent get(String auditEventId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("audit-events")
                .addPathSegment(auditEventId)
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("GET", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), AuditEvent.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Fetch a specific audit event by ID.
     */
    public AuditEvent get(String auditEventId) {
        return get(auditEventId, null);
    }
}
