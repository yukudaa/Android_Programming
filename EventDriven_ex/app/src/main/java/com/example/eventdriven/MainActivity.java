package com.example.eventdriven;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// 5. 액티비티에 인터페이스를 구현
//public class MainActivity extends AppCompatActivity implements View.OnClickListener{
public class MainActivity extends AppCompatActivity {

    // 4. 내부 클래스로 처리
//    class myListenerClass implements View.OnClickListener {
//        @Override
//        public void onClick(View view) {
//            TextView textView1 = (TextView) findViewById(R.id.textView1);
//            switch (view.getId()) {
//                case R.id.buttonRed :
//                    textView1.setText("Red") ;
//                    textView1.setBackgroundColor(Color.rgb(255, 0, 0));
//                    break ;
//                case R.id.buttonGreen :
//                    textView1.setText("Green") ;
//                    textView1.setBackgroundColor(Color.rgb(0, 255, 0));
//                    break ;
//                case R.id.buttonBlue :
//                    textView1.setText("Blue") ;
//                    textView1.setBackgroundColor(Color.rgb(0, 0, 255));
//                    break ;
//            }
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 이벤트 처리를 위한 방법
        // 1. 익명 클래스 생성하여 이벤트 리스너로 사용
//        final TextView textView1 = findViewById(R.id.textView1);
//        Button button1 = findViewById(R.id.buttonRed);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textView1.setText("Red") ;
//                textView1.setBackgroundColor(Color.rgb(255, 0, 0));
//            }
//        });

        // 3. 익명 클래스 객체 생성, Button의 이벤트 리스너로 사용
//        View.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                TextView textView1 = findViewById(R.id.textView1);
//                switch(view.getId()) {
//                    case R.id.buttonRed:
//                        textView1.setText("Red");
//                        textView1.setBackgroundColor(Color.rgb(255,0,0));
//                        break;
////                    case R.id.buttonGreen :
////                        textView1.setText("Green");
////                        textView1.setBackgroundColor(Color.rgb(0, 255, 0));
////                        break;
////                    case R.id.buttonBlue :
////                        textView1.setText("Blue");
////                        textView1.setBackgroundColor(Color.rgb(0, 0, 255));
////                        break;
//                }
//            }
//        };
//
//        Button buttonRed = (Button) findViewById(R.id.buttonRed);
//        buttonRed.setOnClickListener(onClickListener);
//        Button buttonGreen = (Button) findViewById(R.id.buttonGreen);
//        buttonGreen.setOnClickListener(onClickListener);
//        Button button2 = findViewById(R.id.buttonBlue);
//        button2.setOnClickListener(onClickListener);


        // 4.  내부 클래스로 처리
//        myListenerClass buttonListener = new myListenerClass();
//        Button button2 = findViewById(R.id.buttonBlue);
//        button2.setOnClickListener(buttonListener);

    }

    // 5. 액티비티에 인터페이스를 구현
//    @Override
//    public void onClick(View view) {
//        TextView textView1 = (TextView) findViewById(R.id.textView1);
//        switch (view.getId()) {
//            case R.id.buttonRed :
//                textView1.setText("Red") ;
//                textView1.setBackgroundColor(Color.rgb(255, 0, 0));
//                break ;
//            case R.id.buttonGreen :
//                textView1.setText("Green") ;
//                textView1.setBackgroundColor(Color.rgb(0, 255, 0));
//                break ;
//            case R.id.buttonBlue :
//                textView1.setText("Blue") ;
//                textView1.setBackgroundColor(Color.rgb(0, 0, 255));
//                break ;
//        }
//    }

    // 2. Button의 onClick 속성을 이용, 실행할 메소드 추가 public void function_name(View v) 형식으로
//    public void onButtonClick(View view) {
//        TextView textView1 = findViewById(R.id.textView1);
//        switch(view.getId())
//        {
//            case R.id.buttonGreen:
//                textView1.setText("Green");
//                textView1.setBackgroundColor(Color.rgb(0,255,0));
//                break;
//        }
//    }

}