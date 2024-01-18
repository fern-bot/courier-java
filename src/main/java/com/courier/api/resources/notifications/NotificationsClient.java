/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.courier.api.resources.notifications;

import com.courier.api.core.ApiError;
import com.courier.api.core.ClientOptions;
import com.courier.api.core.MediaTypes;
import com.courier.api.core.ObjectMappers;
import com.courier.api.core.RequestOptions;
import com.courier.api.resources.notifications.requests.NotificationDraftUpdateVariationsParams;
import com.courier.api.resources.notifications.requests.NotificationListParams;
import com.courier.api.resources.notifications.requests.NotificationUpdateVariationsParams;
import com.courier.api.resources.notifications.requests.SubmissionChecksReplaceParams;
import com.courier.api.resources.notifications.types.NotificationGetContentResponse;
import com.courier.api.resources.notifications.types.NotificationListResponse;
import com.courier.api.resources.notifications.types.SubmissionChecksGetResponse;
import com.courier.api.resources.notifications.types.SubmissionChecksReplaceResponse;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class NotificationsClient {
    protected final ClientOptions clientOptions;

    public NotificationsClient(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
    }

    public NotificationListResponse list() {
        return list(NotificationListParams.builder().build());
    }

    public NotificationListResponse list(NotificationListParams request, RequestOptions requestOptions) {
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), NotificationListResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public NotificationListResponse list(NotificationListParams request) {
        return list(request, null);
    }

    public NotificationGetContentResponse getContent(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications")
                .addPathSegment(id)
                .addPathSegments("content")
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), NotificationGetContentResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public NotificationGetContentResponse getContent(String id) {
        return getContent(id, null);
    }

    public NotificationGetContentResponse getDraftContent(String id, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications")
                .addPathSegment(id)
                .addPathSegments("draft/content")
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
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), NotificationGetContentResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public NotificationGetContentResponse getDraftContent(String id) {
        return getDraftContent(id, null);
    }

    public void updateVariations(String id) {
        updateVariations(id, NotificationUpdateVariationsParams.builder().build());
    }

    public void updateVariations(String id, NotificationUpdateVariationsParams request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications")
                .addPathSegment(id)
                .addPathSegments("variations")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create("", null);
            if (request.isPresent()) {
                body = RequestBody.create(
                        ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return;
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateVariations(String id, NotificationUpdateVariationsParams request) {
        updateVariations(id, request, null);
    }

    public void updateDraftVariations(String id) {
        updateDraftVariations(
                id, NotificationDraftUpdateVariationsParams.builder().build());
    }

    public void updateDraftVariations(
            String id, NotificationDraftUpdateVariationsParams request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications")
                .addPathSegment(id)
                .addPathSegments("draft/variations")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create("", null);
            if (request.isPresent()) {
                body = RequestBody.create(
                        ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("POST", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return;
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateDraftVariations(String id, NotificationDraftUpdateVariationsParams request) {
        updateDraftVariations(id, request, null);
    }

    public SubmissionChecksGetResponse getSubmissionChecks(
            String id, String submissionId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications")
                .addPathSegment(id)
                .addPathSegment(submissionId)
                .addPathSegments("checks")
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
                return ObjectMappers.JSON_MAPPER.readValue(response.body().string(), SubmissionChecksGetResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public SubmissionChecksGetResponse getSubmissionChecks(String id, String submissionId) {
        return getSubmissionChecks(id, submissionId, null);
    }

    public SubmissionChecksReplaceResponse replaceSubmissionChecks(
            String id, String submissionId, SubmissionChecksReplaceParams request, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications")
                .addPathSegment(id)
                .addPathSegment(submissionId)
                .addPathSegments("checks")
                .build();
        RequestBody body;
        try {
            body = RequestBody.create(
                    ObjectMappers.JSON_MAPPER.writeValueAsBytes(request), MediaTypes.APPLICATION_JSON);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("PUT", body)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .addHeader("Content-Type", "application/json")
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return ObjectMappers.JSON_MAPPER.readValue(
                        response.body().string(), SubmissionChecksReplaceResponse.class);
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public SubmissionChecksReplaceResponse replaceSubmissionChecks(
            String id, String submissionId, SubmissionChecksReplaceParams request) {
        return replaceSubmissionChecks(id, submissionId, request, null);
    }

    public void cancelSubmission(String id, String submissionId, RequestOptions requestOptions) {
        HttpUrl httpUrl = HttpUrl.parse(this.clientOptions.environment().getUrl())
                .newBuilder()
                .addPathSegments("notifications")
                .addPathSegment(id)
                .addPathSegment(submissionId)
                .addPathSegments("checks")
                .build();
        Request okhttpRequest = new Request.Builder()
                .url(httpUrl)
                .method("DELETE", null)
                .headers(Headers.of(clientOptions.headers(requestOptions)))
                .build();
        try {
            Response response =
                    clientOptions.httpClient().newCall(okhttpRequest).execute();
            if (response.isSuccessful()) {
                return;
            }
            throw new ApiError(
                    response.code(),
                    ObjectMappers.JSON_MAPPER.readValue(response.body().string(), Object.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void cancelSubmission(String id, String submissionId) {
        cancelSubmission(id, submissionId, null);
    }
}
