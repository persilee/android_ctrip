package net.lishaoy.android_ctrip.view.travel;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import net.lishaoy.android_ctrip.channel.MethodChannelPlugin;
import net.lishaoy.android_ctrip.events.GotoSpeakTravelPageEvent;
import net.lishaoy.android_ctrip.events.GotoTravelSearchPageEvent;
import net.lishaoy.android_ctrip.view.speak.SpeakActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

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
        FlutterView flutterView = Flutter.createView(getActivity(),getLifecycle(),"travel");
        MethodChannelPlugin.registerWith(flutterView);
        return flutterView;
    }

    @Subscribe
    public void gotoTravelSearchPageEvent(GotoTravelSearchPageEvent event){
        startActivity(new Intent(getContext(), TravelSearchActivity.class));
    }

    @Subscribe
    public void gotoSpeakPage (GotoSpeakTravelPageEvent event){
        Intent intent = new Intent(getContext(), SpeakActivity.class);
        intent.putExtra("pageType",event.getPageType());
        startActivity(intent);
    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
