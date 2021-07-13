package com.example.blue;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Menu2Activity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        // action bar 설정 (제목, 뒤로가기버튼)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("체크리스트");

        // viewpager, adapter 설정
        ViewPager pager = (ViewPager) findViewById(R.id.menu2_pager);
        pager.setOffscreenPageLimit(5);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());

        Menu2Fragment1 fragment1 = new Menu2Fragment1();
        adapter.addItem(fragment1);
        Menu2Fragment2 fragment2 = new Menu2Fragment2();
        adapter.addItem(fragment2);
        Menu2Fragment3 fragment3 = new Menu2Fragment3();
        adapter.addItem(fragment3);
        Menu2Fragment4 fragment4 = new Menu2Fragment4();
        adapter.addItem(fragment4);
        Menu2Fragment5 fragment5 = new Menu2Fragment5();
        adapter.addItem(fragment5);
        Menu2Fragment6 fragment6 = new Menu2Fragment6();
        adapter.addItem(fragment6);


        pager.setAdapter(adapter);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                TextView title = (TextView) findViewById(R.id.menu2_title);
                switch (position) {
                    case 0:
                        title.setText("암호 화폐 지갑");
                        break;
                    case 1:
                        title.setText("거래");
                        break;
                    case 2:
                        title.setText("보상");
                        break;
                    case 3:
                        title.setText("큐레이팅");
                        break;
                    case 4:
                        title.setText("보안");
                        break;
                    case 5:
                        title.setText("증명");
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        TabLayout tab = (TabLayout) findViewById(R.id.menu2_tab);
        tab.setupWithViewPager(pager);
    }


    class PagerAdapter extends FragmentStatePagerAdapter {
        ArrayList<Fragment> items = new ArrayList<Fragment>();

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        public void addItem(Fragment item) {
            items.add(item);
        }

        @Override
        public Fragment getItem(int position) {
            return items.get(position);
        }

        @Override
        public int getCount() {
            return items.size();
        }
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

