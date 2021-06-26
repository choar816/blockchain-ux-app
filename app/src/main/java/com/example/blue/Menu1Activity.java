package com.example.blue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class Menu1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        ViewPager pager = (ViewPager) findViewById(R.id.menu1_pager);
        pager.setOffscreenPageLimit(3);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());

        Menu1Fragment1 fragment1 = new Menu1Fragment1();
        adapter.addItem(fragment1);
        Menu1Fragment2 fragment2 = new Menu1Fragment2();
        adapter.addItem(fragment2);
        Menu1Fragment3 fragment3 = new Menu1Fragment3();
        adapter.addItem(fragment3);

        pager.setAdapter(adapter);

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
}