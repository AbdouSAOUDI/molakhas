package com.starprox.molakhas;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class TestsAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tests_acivity);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int phoneHeight = displayMetrics.heightPixels;
        int phoneWidth = displayMetrics.widthPixels;

        ImageButton pubImage = findViewById(R.id.PubImage);
        pubImage.getLayoutParams().height = phoneWidth;
    }
}
