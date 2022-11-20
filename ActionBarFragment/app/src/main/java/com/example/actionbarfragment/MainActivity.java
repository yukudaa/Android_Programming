package com.example.actionbarfragment;

import android.graphics.Color;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity implements ActionBar.TabListener{

    ActionBar.Tab tabSong, tabArtist, tabAlbum;
    MyTabFragment myFrags[] = new MyTabFragment[3];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar(); // 상단에 표시할 액션바 준비
        // 탭호스트와 같이 탭의 모양이 되도록 설정
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        tabSong = bar.newTab(); // 액션바에 탭 생성
        tabSong.setText("음악별"); // 탭의 글자 설정
        tabSong.setTabListener(this); // 탭을 터치하면 작동하는 리스너 지정
        bar.addTab(tabSong); // 액션바에 탭 추가

        tabArtist = bar.newTab();
        tabArtist.setText("가수별");
        tabArtist.setTabListener(this);
        bar.addTab(tabArtist);

        tabAlbum = bar.newTab();
        tabAlbum.setText("앨범별");
        tabAlbum.setTabListener(this);
        bar.addTab(tabAlbum);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        MyTabFragment myTabFrag = null;

        if (myFrags[tab.getPosition()] == null) { // 선택한 탭이 기존에 한 번도 선택된 적이 없는 탭이라면 프로그맨트 생성해서 배열에 저장

            myTabFrag = new MyTabFragment();
            Bundle data = new Bundle(); // 여러 타입의 값을 저장하는 Map 클래스
            data.putString("tabName", tab.getText().toString());

            myTabFrag.setArguments(data);
            myFrags[tab.getPosition()] = myTabFrag;
        } else
            myTabFrag = myFrags[tab.getPosition()];

        ft.replace(android.R.id.content, myTabFrag); // 선택한 탭에 해당하는 프래그먼트를 액션바 아래쪽에 출력

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }

    // Fragment를 상속받는 MyTabFragment 클래스를 내부 클래스로 생성
    public static class MyTabFragment extends androidx.fragment.app.Fragment {
        String tabName;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Bundle data = getArguments();
            tabName = data.getString("tabName");
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);

            LinearLayout baseLayout = new LinearLayout(super.getActivity());
            baseLayout.setOrientation(LinearLayout.VERTICAL);
            baseLayout.setLayoutParams(params);

            // 탭별로 배경색을 다르게 설정
            if (tabName == "음악별")
                baseLayout.setBackgroundColor(Color.RED);
            if (tabName == "가수별")
                baseLayout.setBackgroundColor(Color.GREEN);
            if (tabName == "앨범별")
                baseLayout.setBackgroundColor(Color.BLUE);

            return baseLayout; // 구성한 레이아웃을 반환
        }

    }
}