package com.example.blue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Menu1Activity extends AppCompatActivity {

    private ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("블록체인 UX");

        ViewPager pager = (ViewPager) findViewById(R.id.menu1_pager);
        pager.setOffscreenPageLimit(3);
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager());

        Menu1Fragment1 fragment1 = new Menu1Fragment1();
        adapter.addItem(fragment1);
        Menu1Fragment2 fragment2 = new Menu1Fragment2();
        adapter.addItem(fragment2);
        Menu1Fragment3 fragment3 = new Menu1Fragment3();
        adapter.addItem(fragment3);
        Menu1Fragment4 fragment4 = new Menu1Fragment4();
        adapter.addItem(fragment4);

        pager.setAdapter(adapter);

        TabLayout tab = (TabLayout) findViewById(R.id.menu1_tab);
        tab.setupWithViewPager(pager);

/*
        img1 = (ImageView) findViewById(R.id.menu1_imgview1);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.menu1_img1);
        //Bitmap resized = Bitmap.createScaledBitmap( bitmap, 240, 160, true );

        int[] maxTextureSize = new int[1];
        GLES20.glGetIntegerv(GLES20.GL_MAX_TEXTURE_SIZE, maxTextureSize, 0);

        if (bitmap.getHeight() > maxTextureSize[0]){
            int resizedWidth = 160;
            int resizedHeight = 80;
            bitmap.createScaledBitmap(bitmap, resizedWidth, resizedHeight, false);
        }

        img1.setImageBitmap(bitmap);*/

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