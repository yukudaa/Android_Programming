package com.cookandroid.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2, text3;
    RadioGroup rGroup1;
    RadioButton rdoAge1, rdoAge2, rdoAge3, rdoAge4;
    ImageView imgPet;
    Button btnOK;
    int i = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);

        setTitle("자기 소개 앱");


        text1 = (TextView) findViewById(R.id.Text1);
        text2 = (TextView) findViewById(R.id.Text2);
        text3 = (TextView) findViewById(R.id.Text3);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoAge1 = (RadioButton) findViewById(R.id.RdoAge1);
        rdoAge2 = (RadioButton) findViewById(R.id.RdoAge2);
        rdoAge3 = (RadioButton) findViewById(R.id.RdoAge3);
        rdoAge4 = (RadioButton) findViewById(R.id.RdoAge4);
        imgPet = (ImageView) findViewById(R.id.ImgPet);
        btnOK = (Button) findViewById(R.id.BtnOK);


        // (4)선택확인 버튼을 클릭하면
        btnOK.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (i == 0) {
                    imgPet.setImageResource(R.drawable.dog);
                    i++;
                } else if (i == 1) {
                    imgPet.setImageResource(R.drawable.rabbit);
                    i++;
                } else if (i == 2) {
                    imgPet.setImageResource(R.drawable.cat);
                    i = 0;
                }
            }

        });

    }

}
