package net.lishaoy.lib_image_loader.listener;

import androidx.annotation.Nullable;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class ImageCallBack implements RequestListener {

    private ImageCallBackListener listener;

    public ImageCallBack(ImageCallBackListener listener) {
        this.listener = listener;
    }

    @Override
    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target target, boolean isFirstResource) {
        listener.onFailure();
        return false;
    }

    @Override
    public boolean onResourceReady(Object resource, Object model, Target target, DataSource dataSource, boolean isFirstResource) {
        listener.onSuccess();
        return false;
    }
}
