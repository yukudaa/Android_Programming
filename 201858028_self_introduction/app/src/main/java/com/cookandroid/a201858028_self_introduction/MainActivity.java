package com.cookandroid.a201858028_self_introduction;

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
    Button nextPic;
    int i = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
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
        nextPic = (Button) findViewById(R.id.NextPic);


        nextPic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (i == 0) {
                    imgPet.setImageResource(R.drawable.yk2);
                    i++;
                } else if (i == 1) {
                    imgPet.setImageResource(R.drawable.yk3);
                    i++;
                } else if (i == 2) {
                    imgPet.setImageResource(R.drawable.yk1);
                    i = 0;
                }
            }

        });

    }

}
