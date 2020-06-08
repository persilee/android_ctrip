package net.lishaoy.lib_image_loader.listener;

public interface ImageCallBackListener {
    /**
     * 请求成功回调事件处理
     */
    void onSuccess();

    /**
     * 请求失败回调事件处理
     */
    void onFailure();
}
