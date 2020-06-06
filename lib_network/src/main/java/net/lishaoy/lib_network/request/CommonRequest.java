package net.lishaoy.lib_network.request;

import java.util.Map;

import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public class CommonRequest {

    /**
     * 创建 get 请求对象
     *
     * @param url
     * @return
     */
    public static Request createGetRequest(String url) {
        return new Request.Builder()
                .url(url)
                .get()
                .build();
    }

    /**
     * 创建 get 请求对象
     *
     * @param url
     * @param params
     * @return
     */
    public static Request createGetRequest(String url, RequestParams params) {
        return createGetRequest(url, params, null);
    }

    /**
     * 创建 get 请求对象
     *
     * @param url
     * @param params
     * @param headers
     * @return
     */
    public static Request createGetRequest(String url, RequestParams params, RequestParams headers) {
        StringBuilder urlBuilder = new StringBuilder(url).append("?");
        if (params != null) {
            for (Map.Entry<String, String> entry : params.urlParams.entrySet()) {
                urlBuilder.append(entry.getKey()).append("=").append(entry.getValue());
            }
        }
        Headers.Builder headerBuilder = new Headers.Builder();
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.urlParams.entrySet()) {
                headerBuilder.add(entry.getKey(), entry.getValue());
            }
        }

        return new Request.Builder()
                .url(url)
                .headers(headerBuilder.build())
                .get()
                .build();
    }

    /**
     * 创建post请求对象
     *
     * @param url
     * @param params
     * @return
     */
    public static Request createPostRequest(String url, RequestParams params) {
        return createPostRequest(url, params, null);
    }

    /**
     * 创建post请求对象
     *
     * @param url
     * @param params
     * @param headers
     * @return
     */
    public static Request createPostRequest(
            String url,
            RequestParams params,
            RequestParams headers) {
        FormBody.Builder formBodyBuilder = new FormBody.Builder();
        if (params != null) {
            for (Map.Entry<String, String> entry : params.urlParams.entrySet()) {
                formBodyBuilder.add(entry.getKey(), entry.getValue());
            }
        }
        Headers.Builder headerBuilder = new Headers.Builder();
        if (params != null) {
            for (Map.Entry<String, String> entry : headers.urlParams.entrySet()) {
                headerBuilder.add(entry.getKey(), entry.getValue());
            }
        }

        Request request = new Request.Builder()
                .url(url)
                .headers(headerBuilder.build())
                .post(formBodyBuilder.build())
                .build();

        return request;
    }

    /**
     * post json 请求
     * @param url
     * @param jsonStr
     * @return
     */
    public static Request createPostJsonRequest(String url,String jsonStr) {
        return createPostJsonRequest(url,jsonStr,null);
    }

    /**
     * post json 请求
     * @param url
     * @param jsonStr
     * @param headers
     * @return
     */
    public static Request createPostJsonRequest(String url,String jsonStr,RequestParams headers) {
        Headers.Builder headerBuilder = new Headers.Builder();
        if (headers != null) {
            for (Map.Entry<String, String> entry : headers.urlParams.entrySet()) {
                headerBuilder.add(entry.getKey(), entry.getValue());
            }
        }
        RequestBody requestBody = RequestBody.create(jsonStr, MediaType.get("application/json"));
        Request request = new Request.Builder()
                .url(url)
                .headers(headerBuilder.build())
                .post(requestBody)
                .build();
        return request;
    }




    public static final MediaType MEDIA_TYPE = MediaType.parse("application/octet-stream");

    /**
     * post文件上传请求
     * @param url
     * @param params
     * @return
     */
    public static Request createMultiPostRequest(String url, RequestParams params) {
        MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
        multipartBuilder.setType(MultipartBody.FORM);
        if (params != null) {
            for (Map.Entry<String, Object> entry : params.fileParams.entrySet()) {
                multipartBuilder.addFormDataPart(entry.getKey(), (String) entry.getValue());
            }
        }

        return new Request.Builder()
                .url(url)
                .post(multipartBuilder.build())
                .build();
    }
}
