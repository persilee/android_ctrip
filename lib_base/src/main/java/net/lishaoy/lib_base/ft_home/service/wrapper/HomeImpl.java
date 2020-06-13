package net.lishaoy.lib_base.ft_home.service.wrapper;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import net.lishaoy.lib_base.ft_home.service.HomeService;

public class HomeImpl {

    @Autowired(name = "/home/home_service") protected HomeService homeService;

    private static HomeImpl mHomeImpl = null;

    public static HomeImpl getInstance() {
        if (mHomeImpl == null) {
            synchronized (HomeImpl.class) {
                if (mHomeImpl == null) {
                    mHomeImpl = new HomeImpl();
                }
                return mHomeImpl;
            }
        }
        return mHomeImpl;
    }

    private HomeImpl() {
        ARouter.getInstance().inject(this);
    }

    public Fragment toHome(Context context) {
        return homeService.toHome(context);
    }
}
