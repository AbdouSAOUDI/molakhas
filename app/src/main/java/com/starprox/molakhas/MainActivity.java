package com.starprox.molakhas;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<LinearLayout> tipsList = new ArrayList<LinearLayout>();
    HorizontalScrollView rootHSV = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int phoneHeight = displayMetrics.heightPixels;
        int phoneWidth = displayMetrics.widthPixels;


        LinearLayout layout = findViewById(R.id.Tip1_RootLL);
        tipsList.add(layout);
        layout = findViewById(R.id.Tip2_RootLL);
        tipsList.add(layout);
        layout = findViewById(R.id.Tip3_RootLL);
        tipsList.add(layout);
        layout = findViewById(R.id.TipContinue_RootLL);
        tipsList.add(layout);

        for (LinearLayout item : tipsList) item.getLayoutParams().width = phoneWidth;

        Toast.makeText(this, phoneWidth + "", Toast.LENGTH_LONG).show();
    }

    public void ContinueBtnClick(View view) {
        Intent mainToStatus = new Intent(this, TestsAcivity.class);
        startActivity(mainToStatus);
    }
}
