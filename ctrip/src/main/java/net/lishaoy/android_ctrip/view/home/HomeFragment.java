package net.lishaoy.android_ctrip.view.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import net.lishaoy.android_ctrip.R;
import net.lishaoy.android_ctrip.api.RequestCenter;
import net.lishaoy.lib_image_loader.app.ImageLoaderManager;
import net.lishaoy.lib_network.listener.DisposeDataListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private static final String TAG = "HomeFragment";

    @BindView(R.id.nav_img_attractions)
    ImageView navImgAttractions;
    @BindView(R.id.nav_img_tickets)
    ImageView navImgTickets;
    @BindView(R.id.nav_img_food)
    ImageView navImgFood;
    @BindView(R.id.nav_img_around)
    ImageView navImgAround;
    @BindView(R.id.nav_img_day)
    ImageView navImgDay;
    @BindView(R.id.nav_txt_attractions)
    TextView navTxtAttractions;
    @BindView(R.id.nav_txt_tickets)
    TextView navTxtTickets;
    @BindView(R.id.nav_txt_food)
    TextView navTxtFood;
    @BindView(R.id.nav_txt_around)
    TextView navTxtAround;
    @BindView(R.id.nav_txt_day)
    TextView navTxtDay;
    private Unbinder unbinder;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this, view);

        ImageLoaderManager.getInstance().displayImageForView(navImgAttractions, "https://cdn.lishaoy.net/ctrip/lbsguide.png");
        ImageLoaderManager.getInstance().displayImageForView(navImgTickets, "https://cdn.lishaoy.net/ctrip/lbsguide.png");
        ImageLoaderManager.getInstance().displayImageForView(navImgFood, "https://cdn.lishaoy.net/ctrip/lbsguide.png");
        ImageLoaderManager.getInstance().displayImageForView(navImgAround, "https://cdn.lishaoy.net/ctrip/lbsguide.png");
        ImageLoaderManager.getInstance().displayImageForView(navImgDay, "https://cdn.lishaoy.net/ctrip/lbsguide.png");
        navTxtAttractions.setText("景点攻略");
        navTxtTickets.setText("景点攻略");
        navTxtFood.setText("景点攻略");
        navTxtAround.setText("景点攻略");
        navTxtDay.setText("景点攻略");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RequestCenter.requestHome(new DisposeDataListener() {
            @Override
            public void onSuccess(Object responseObj) {
                Log.d(TAG, "onSuccess: " + responseObj);
            }

            @Override
            public void onFailure(Object reasonObj) {

            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
