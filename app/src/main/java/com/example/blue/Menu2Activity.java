package com.example.blue;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Menu2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("체크리스트");

        ViewPager pager = (ViewPager) findViewById(R.id.menu2_pager);
        pager.setOffscreenPageLimit(5);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());

        Menu2Fragment1 fragment1 = new Menu2Fragment1();
        adapter.addItem(fragment1);
        Menu1Fragment2 fragment2 = new Menu1Fragment2();
        adapter.addItem(fragment2);
        Menu1Fragment3 fragment3 = new Menu1Fragment3();
        adapter.addItem(fragment3);
        Menu1Fragment4 fragment4 = new Menu1Fragment4();
        adapter.addItem(fragment4);

        pager.setAdapter(adapter);

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