package com.cookandroid.project7_3;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editName, editEmail;
    Button button1;
    EditText dlgEdtName, dlgEdtEmail;   // 대화상자용
    TextView toastText;     // 토스트용
    View dialogView, toastView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
        setTitle("사용자 정보 입력");

        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogView = (View)View.inflate(MainActivity.this,
                        R.layout.dialog1, null);

                // 1) 대화상자 생성
                AlertDialog.Builder dlg =
                        new AlertDialog.Builder(MainActivity.this);

                // 2) 대화상자 설정
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.ic_menu_allfriends);
                dlg.setView(dialogView);

                // 액티비티에 있는 에티드 텍스트 2개 값을 얻어와야

                dlgEdtName = dialogView.findViewById(R.id.dlgEdt1);
                dlgEdtEmail = dialogView.findViewById(R.id.dlgEdt2);

                dlgEdtName.setText(editName.getText().toString());
                dlgEdtEmail.setText(editEmail.getText().toString());

                dlg.setPositiveButton("확인",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                // 댜화상자에 입력된 이름, 이메일 값을 엑티비티에 있는 에디트텍스트뷰에 보임
                                editName.setText(dlgEdtName.getText().toString());
                                editEmail.setText(dlgEdtEmail.getText().toString());
                            }
                        });

                dlg.setNegativeButton("취소",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast toast = new Toast(MainActivity.this);
                                toastView = (View) View.inflate(MainActivity.this,
                                        R.layout.toast1, null);
                                toastText = toastView.findViewById(R.id.toastText1);
                                toastText.setText("취소(이유구)");
                                toast.setView(toastView);

                                Display display =
                                        ((WindowManager)getSystemService(WINDOW_SERVICE))
                                                .getDefaultDisplay();

                                int xOffset = (int)(Math.random() * display.getWidth());
                                int yOffset = (int)(Math.random() * display.getHeight());
                                toast.setGravity(Gravity.TOP|Gravity.LEFT,
                                        xOffset, yOffset);

                                toast.show();
                            }
                        });

                // 3) 대화상자 출력
                dlg.show();

            }
        });

    }
}
