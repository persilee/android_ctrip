package net.lishaoy.android_ctrip.view.travel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.lishaoy.android_ctrip.R;

public class TravelFragment extends Fragment {

    public TravelFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        TravelFragment fragment = new TravelFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_travel, container, false);
    }
}
