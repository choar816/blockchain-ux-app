package com.example.blue;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Menu2Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_result);

        TextView a01 = (TextView) findViewById(R.id.answer_601);
        TextView a02 = (TextView) findViewById(R.id.answer_602);

        // action bar 설정 (제목, 뒤로가기버튼)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("체크리스트");


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        boolean[] bool = bundle.getBooleanArray("answer6");

        // true가 한개라도 있으면 소제목 visible, 아니면 gone
        int numTrue = 0;

        if (bool[0] == true) {
            a01.setVisibility(View.VISIBLE);
            ++numTrue;
        } else {
            a01.setVisibility(View.GONE);
        }
        if (bool[1] == true) {
            a02.setVisibility(View.VISIBLE);
            ++numTrue;
        } else {
            a02.setVisibility(View.GONE);
        }


        if (numTrue != 0) {

        }


    }
/*
    public void UpdateVisible(int id) {
        findViewById(id).setVisibility(View.VISIBLE);
    }

    public void UpdateInvisible(int id) {
        findViewById(id).setVisibility(View.GONE);
    }
 */

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

