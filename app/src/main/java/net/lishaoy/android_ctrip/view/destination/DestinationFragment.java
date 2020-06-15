package net.lishaoy.android_ctrip.view.destination;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.lishaoy.android_ctrip.channel.MethodChannelPlugin;
import net.lishaoy.android_ctrip.events.GotoDestinationSearchPageEvent;
import net.lishaoy.android_ctrip.events.GotoSpeakDestinationPageEvent;
import net.lishaoy.android_ctrip.view.speak.SpeakActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

public class DestinationFragment extends Fragment {

    public DestinationFragment() {
    }

    public static DestinationFragment newInstance() {
        DestinationFragment fragment = new DestinationFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FlutterView flutterView = Flutter.createView(getActivity(),getLifecycle(),"destination");
        MethodChannelPlugin.registerWith(flutterView);
        return flutterView;
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

    @Subscribe
    public void gotoDestinationSearchPage(GotoDestinationSearchPageEvent event){
        startActivity(new Intent(getContext(), DestinationSearchActivity.class));
    }

    @Subscribe
    public void gotoSpeakPage (GotoSpeakDestinationPageEvent event){
        Intent intent = new Intent(getContext(), SpeakActivity.class);
        intent.putExtra("pageType",event.getPageType());
        startActivity(intent);
    }
}
