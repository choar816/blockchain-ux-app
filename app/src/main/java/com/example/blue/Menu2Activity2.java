package com.example.blue;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Menu2Activity2 extends AppCompatActivity {
    int num_unchecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_2);

        // action bar 설정 (제목, 뒤로가기버튼)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("체크리스트");

        RadioGroup groups[] = new RadioGroup[12];
        groups[0] = (RadioGroup) findViewById(R.id.rg_201);
        groups[1] = (RadioGroup) findViewById(R.id.rg_202);
        groups[2] = (RadioGroup) findViewById(R.id.rg_203);
        groups[3] = (RadioGroup) findViewById(R.id.rg_204);
        groups[4] = (RadioGroup) findViewById(R.id.rg_205);
        groups[5] = (RadioGroup) findViewById(R.id.rg_206);
        groups[6] = (RadioGroup) findViewById(R.id.rg_207);
        groups[7] = (RadioGroup) findViewById(R.id.rg_208);
        groups[8] = (RadioGroup) findViewById(R.id.rg_209);
        groups[9] = (RadioGroup) findViewById(R.id.rg_210);
        groups[10] = (RadioGroup) findViewById(R.id.rg_211);
        groups[11] = (RadioGroup) findViewById(R.id.rg_212);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        boolean[] answer1 = bundle.getBooleanArray("answer1");

        boolean answer[] = new boolean[12];
        for (int i=0; i<12; ++i) {
            answer[i] = false;
        }

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox2);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0; i<groups.length; ++i) {
                    groups[i].check(groups[i].getChildAt(5).getId());
                }

                Intent intent = new Intent(getApplicationContext(), Menu2Activity3.class);
                intent.putExtra("answer1", answer1);
                intent.putExtra("answer2", answer);
                startActivity(intent);
                finish();
            }
        });

        TextView texts[] = new TextView[12];
        texts[0] = (TextView) findViewById(R.id.question_201);
        texts[1] = (TextView) findViewById(R.id.question_202);
        texts[2] = (TextView) findViewById(R.id.question_203);
        texts[3] = (TextView) findViewById(R.id.question_204);
        texts[4] = (TextView) findViewById(R.id.question_205);
        texts[5] = (TextView) findViewById(R.id.question_206);
        texts[6] = (TextView) findViewById(R.id.question_207);
        texts[7] = (TextView) findViewById(R.id.question_208);
        texts[8] = (TextView) findViewById(R.id.question_209);
        texts[9] = (TextView) findViewById(R.id.question_210);
        texts[10] = (TextView) findViewById(R.id.question_211);
        texts[11] = (TextView) findViewById(R.id.question_212);


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
                    answer[finalI] = (index == 0 || index == 1);
                }
            });
        }


        Button prev = (Button) findViewById(R.id.btn2_prev);
        Button next = (Button) findViewById(R.id.btn2_next);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Menu2Activity1.class);
                startActivity(intent);
                finish();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_unchecked = 0;
                for (int i=0; i<groups.length; ++i) {
                    if (groups[i].getCheckedRadioButtonId() == -1) {
                        ++num_unchecked;
                    }
                }

                if (num_unchecked != 0) {
                    Toast.makeText(getApplicationContext(), "모든 항목을 선택하세요", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), Menu2Activity3.class);
                    intent.putExtra("answer1", answer1);
                    intent.putExtra("answer2", answer);
                    startActivity(intent);
                    finish();
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