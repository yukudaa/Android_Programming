package com.cookandroid.project7_2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button button1, button2;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        setTitle("배경색 바꾸기(Java 코드)");

        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.button1);
        registerForContextMenu(button1);

        button2 = (Button) findViewById(R.id.button2);
        registerForContextMenu(button2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);

        if (v == button1) {
            menu.setHeaderTitle("배경색 변경(이유구)");
            menu.add(0,1,0,"배경색(빨강)");
            menu.add(0,2,0,"배경색(초록)");
            menu.add(0,3,0,"배경색(파랑)");
            menu.add(0,4,0,"배경색(노랑)");
            menu.add(0,5,0,"배경색(검정)");
        }
        if (v == button2) {
            menu.add(0,6,0,"버튼 45도 회전");
            menu.add(0,7,0,"버튼 2배 확대");
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        super.onCreateOptionsMenu(menu);
//
//        menu.add(0,1,0, "배경색 (빨강)");
//        menu.add(0,2,0, "배경색 (초록)");
//        menu.add(0,3,0, "배경색 (파랑)");
//        menu.add(0,4,0, "배경색 (노랑)");
//        menu.add(0,5,0, "배경색 (검정)");
//
//        SubMenu sMenu = menu.addSubMenu("버튼 변경 >>");
//        sMenu.add(0,6,0,"버튼 45도 회전");
//        sMenu.add(0,7,0,"버튼 2배 확대");
//
//        return true;
//    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case 2:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case 3:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case 4:
                baseLayout.setBackgroundColor(Color.YELLOW);
                return true;
            case 5:
                baseLayout.setBackgroundColor(Color.BLACK);
                return true;
            case 6:
                button2.setRotation(45);
                return true;
            case 7:
                button2.setScaleX(2);
                return true;
        }
        return false;
    }


}
