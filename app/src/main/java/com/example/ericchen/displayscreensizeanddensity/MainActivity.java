package com.example.ericchen.displayscreensizeanddensity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    WindowManager windowManager;
    DisplayMetrics displayMetrics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);

        ((TextView) findViewById(R.id.tv_display_screen_info)).setText(getResources().getString(R.string.display_screen_info, getScreenWidth(), getScreenHeight(), getScreenDensity()));
    }

    private int getScreenWidth() {

        return displayMetrics.widthPixels;
    }

    private int getScreenHeight() {

        return displayMetrics.heightPixels;
    }

    private float getScreenDensity() {

        return displayMetrics.density;
    }

}
