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

public class Menu2Activity4 extends AppCompatActivity {
    int num_unchecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_4);

        RadioGroup groups[] = new RadioGroup[8];
        groups[0] = (RadioGroup) findViewById(R.id.rg_401);
        groups[1] = (RadioGroup) findViewById(R.id.rg_402);
        groups[2] = (RadioGroup) findViewById(R.id.rg_403);
        groups[3] = (RadioGroup) findViewById(R.id.rg_404);
        groups[4] = (RadioGroup) findViewById(R.id.rg_405);
        groups[5] = (RadioGroup) findViewById(R.id.rg_406);
        groups[6] = (RadioGroup) findViewById(R.id.rg_407);
        groups[7] = (RadioGroup) findViewById(R.id.rg_408);

        // action bar 설정 (제목, 뒤로가기버튼)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("체크리스트");

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        boolean[] answer1 = bundle.getBooleanArray("answer1");
        boolean[] answer2 = bundle.getBooleanArray("answer2");
        boolean[] answer3 = bundle.getBooleanArray("answer3");

        boolean answer[] = new boolean[8];
        for (int i=0; i<8; ++i) {
            answer[i] = false;
        }

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox4);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0; i<groups.length; ++i) {
                    groups[i].check(groups[i].getChildAt(5).getId());
                }

                Intent intent = new Intent(getApplicationContext(), Menu2Activity5.class);
                intent.putExtra("answer1", answer1);
                intent.putExtra("answer2", answer2);
                intent.putExtra("answer3", answer3);
                intent.putExtra("answer4", answer);
                startActivity(intent);
                finish();
            }
        });

        TextView texts[] = new TextView[8];
        texts[0] = (TextView) findViewById(R.id.question_401);
        texts[1] = (TextView) findViewById(R.id.question_402);
        texts[2] = (TextView) findViewById(R.id.question_403);
        texts[3] = (TextView) findViewById(R.id.question_404);
        texts[4] = (TextView) findViewById(R.id.question_405);
        texts[5] = (TextView) findViewById(R.id.question_406);
        texts[6] = (TextView) findViewById(R.id.question_407);
        texts[7] = (TextView) findViewById(R.id.question_408);

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

        Button prev = (Button) findViewById(R.id.btn4_prev);
        Button next = (Button) findViewById(R.id.btn4_next);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Menu2Activity3.class);
                intent.putExtra("answer1", answer1);
                intent.putExtra("answer2", answer2);
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
                    Intent intent = new Intent(getApplicationContext(), Menu2Activity5.class);
                    intent.putExtra("answer1", answer1);
                    intent.putExtra("answer2", answer2);
                    intent.putExtra("answer3", answer3);
                    intent.putExtra("answer4", answer);
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