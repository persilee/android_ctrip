package net.lishaoy.lib_image_loader.app;

import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideOption;
import com.bumptech.glide.request.BaseRequestOptions;

@GlideExtension
public class ImageGlideExtension {
    private ImageGlideExtension() {
    }

    @GlideOption
    public static BaseRequestOptions<?> injectOptions(BaseRequestOptions<?> options) {
        return null;
    }
}
