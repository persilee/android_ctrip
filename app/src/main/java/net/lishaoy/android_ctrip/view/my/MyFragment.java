package net.lishaoy.android_ctrip.view.my;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gyf.immersionbar.ImmersionBar;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.lib_webview.base.BaseAgentWebFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseAgentWebFragment {

    private ViewGroup mViewGroup;

    public MyFragment() {
    }

    public static Fragment newInstance() {
        MyFragment fragment = new MyFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mViewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_my, container, false);
        return mViewGroup;
    }

    @NonNull
    @Override
    protected ViewGroup getAgentWebParent() {
        return (ViewGroup)this.mViewGroup.findViewById(R.id.my_container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    protected String getUrl() {
        return "http://m.ctrip.com/webapp/myctrip/?from=http%3A%2F%2Fm.ctrip.com%2Fhtml5%2F";
    }
}
