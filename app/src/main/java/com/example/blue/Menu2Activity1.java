package com.example.blue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Menu2Activity1 extends AppCompatActivity {
    int num_unchecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_1);

        // action bar 설정 (제목, 뒤로가기버튼)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("체크리스트(1/6)");

        RadioGroup groups[] = new RadioGroup[11];
        groups[0] = (RadioGroup) findViewById(R.id.rg_101);
        groups[1] = (RadioGroup) findViewById(R.id.rg_102);
        groups[2] = (RadioGroup) findViewById(R.id.rg_103);
        groups[3] = (RadioGroup) findViewById(R.id.rg_104);
        groups[4] = (RadioGroup) findViewById(R.id.rg_105);
        groups[5] = (RadioGroup) findViewById(R.id.rg_106);
        groups[6] = (RadioGroup) findViewById(R.id.rg_107);
        groups[7] = (RadioGroup) findViewById(R.id.rg_108);
        groups[8] = (RadioGroup) findViewById(R.id.rg_109);
        groups[9] = (RadioGroup) findViewById(R.id.rg_110);
        groups[10] = (RadioGroup) findViewById(R.id.rg_111);

        int answer[] = new int[11];
        for (int i=0; i<answer.length; ++i) {
            answer[i] = -1;
        }

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox1);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((CheckBox)v).isChecked()) {
                    for (int i = 0; i < groups.length; ++i) {
                        groups[i].check(groups[i].getChildAt(5).getId());
                        answer[i] = 5;
                    }
                } else {
                    for (int i = 0; i < groups.length; ++i) {
                        if (groups[i].getCheckedRadioButtonId() == groups[i].getChildAt(5).getId()) {
                            groups[i].clearCheck();
                            answer[i] = -1;
                        }
                    }
                }
            }
        });


        TextView texts[] = new TextView[11];
        texts[0] = (TextView) findViewById(R.id.question_101);
        texts[1] = (TextView) findViewById(R.id.question_102);
        texts[2] = (TextView) findViewById(R.id.question_103);
        texts[3] = (TextView) findViewById(R.id.question_104);
        texts[4] = (TextView) findViewById(R.id.question_105);
        texts[5] = (TextView) findViewById(R.id.question_106);
        texts[6] = (TextView) findViewById(R.id.question_107);
        texts[7] = (TextView) findViewById(R.id.question_108);
        texts[8] = (TextView) findViewById(R.id.question_109);
        texts[9] = (TextView) findViewById(R.id.question_110);
        texts[10] = (TextView) findViewById(R.id.question_111);



        for (int i=0; i<groups.length; ++i) {
            int finalI = i;
            groups[i].setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {
                    int index = group.indexOfChild(group.findViewById(checkedId));
                    if (index == 5) {
                        texts[finalI].setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOmitted));
                    } else {
                        texts[finalI].setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOriginal));
                    }
                    answer[finalI] = index;
                }
            });
        }


        Button next = (Button) findViewById(R.id.btn1_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_unchecked = 0;
                for (int i=0; i<groups.length; ++i) {
                    if (groups[i].getCheckedRadioButtonId() == -1) {
                        ++num_unchecked;
                        texts[i].setTypeface(null, Typeface.BOLD);
                    } else {
                        texts[i].setTypeface(null, Typeface.NORMAL);
                    }
                }

                if (num_unchecked != 0) {
                    Toast.makeText(getApplicationContext(), "모든 항목을 선택하세요", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), Menu2Activity2.class);
                    intent.putExtra("answer1", answer);
                    startActivity(intent);
                }
            }
        });
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