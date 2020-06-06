package net.lishaoy.android_ctrip.view.home.tabPages;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.lishaoy.android_ctrip.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NearFragment extends Fragment {

    public NearFragment() {
    }

    public static NearFragment newInstance() {
        return new NearFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_near, container, false);
    }
}
