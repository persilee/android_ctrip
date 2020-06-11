package net.lishaoy.lib_base.ft_home.service;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface HomeService extends IProvider {

    Fragment toHome (Context context);
}
