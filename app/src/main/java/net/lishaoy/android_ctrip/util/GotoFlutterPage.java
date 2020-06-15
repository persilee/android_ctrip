package net.lishaoy.android_ctrip.util;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import io.flutter.embedding.android.FlutterActivity;

public class GotoFlutterPage extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(
                FlutterActivity
                        .withNewEngine()
                .initialRoute("destination/search")
                .build(this)
        );
    }
}
