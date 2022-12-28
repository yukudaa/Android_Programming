package com.cookandroid.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit1,edit2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    TextView textResult;
    String num1, num2;
    Integer result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("실습2 계산기(201858028 이유구)");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);

        // 나머지 3개
        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                // 에디트텍스트 1 값 얻어오기, 에디트텍스트 2 값 얻어오기
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                // 더하기
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                // 텍스뷰에 출력하기
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

        btnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                // 에디트텍스트 1 값 얻어오기, 에디트텍스트 2 값 얻어오기
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                // 빼기
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                // 텍스뷰에 출력하기
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
        btnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                // 에디트텍스트 1 값 얻어오기, 에디트텍스트 2 값 얻어오기
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                // 곱하기
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                // 텍스뷰에 출력하기
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });
        btnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                // 에디트텍스트 1 값 얻어오기, 에디트텍스트 2 값 얻어오기
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                // 나누기
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                // 텍스뷰에 출력하기
                textResult.setText("계산 결과 : " + result.toString());
                return false;
            }
        });

    }
}