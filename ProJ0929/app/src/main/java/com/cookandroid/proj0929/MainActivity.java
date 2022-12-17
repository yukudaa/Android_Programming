package com.cookandroid.proj0929;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        setTitle("201858028 이유구 HW2");
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        LinearLayout baseLayout1 = new LinearLayout(this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT,1);
        baseLayout1.setOrientation(LinearLayout.VERTICAL);

        LinearLayout baseLayout2 = new LinearLayout(this);

        baseLayout2.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout redLayout = new LinearLayout(this);
        redLayout.setBackgroundColor(Color.RED);

        LinearLayout baseLayout3 = new LinearLayout(this);
        baseLayout3.setOrientation(LinearLayout.VERTICAL);

        LinearLayout yellowLayout = new LinearLayout(this);
        yellowLayout.setBackgroundColor(Color.YELLOW);

        LinearLayout blackLayout = new LinearLayout(this);
        blackLayout.setBackgroundColor(Color.BLACK);

        LinearLayout blueLayout = new LinearLayout(this);
        blueLayout.setBackgroundColor(Color.BLUE);

        baseLayout1.addView(baseLayout2, params);
        baseLayout2.addView(redLayout, params);
        baseLayout2.addView(baseLayout3, params);
        baseLayout3.addView(yellowLayout, params);
        baseLayout3.addView(blackLayout, params);
        baseLayout1.addView(blueLayout, params);

        setContentView(baseLayout1, params);
    }

}