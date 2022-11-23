package com.example.eventdriven;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("실습#3");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 이벤트 처리를 위한 방법
        // 1. 익명 클래스 생성하여 이벤트 리스너로 사용
        final TextView textView1 = findViewById(R.id.textView1);
        final TextView textView2 = findViewById(R.id.textView2);
        final TextView textView3 = findViewById(R.id.textView3);
        Button buttonName = findViewById(R.id.buttonName);
        Button buttonNum = findViewById(R.id.buttonNum);
        Button buttonMbti = findViewById(R.id.buttonMBTI);
        buttonName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView1.setText("이유구");
                textView1.setBackgroundColor(Color.rgb(255, 0, 0));
            }
        });
        buttonNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("201858028");
                textView2.setBackgroundColor(Color.rgb(0, 255, 0));
            }
        });
        buttonMbti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView3.setText("ESTP");
                textView3.setBackgroundColor(Color.rgb(0, 0, 255));
            }
        });
    }


}