package com.example.blue;

import android.content.Intent;
import android.graphics.Paint;
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

public class Menu2Activity6 extends AppCompatActivity {
    int num_unchecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_6);

        // action bar 설정 (제목, 뒤로가기버튼)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("체크리스트(6/6)");

        RadioGroup groups[] = new RadioGroup[11];
        groups[0] = (RadioGroup) findViewById(R.id.rg_601);
        groups[1] = (RadioGroup) findViewById(R.id.rg_602);
        groups[2] = (RadioGroup) findViewById(R.id.rg_603);
        groups[3] = (RadioGroup) findViewById(R.id.rg_604);
        groups[4] = (RadioGroup) findViewById(R.id.rg_605);
        groups[5] = (RadioGroup) findViewById(R.id.rg_606);
        groups[6] = (RadioGroup) findViewById(R.id.rg_607);
        groups[7] = (RadioGroup) findViewById(R.id.rg_608);
        groups[8] = (RadioGroup) findViewById(R.id.rg_609);
        groups[9] = (RadioGroup) findViewById(R.id.rg_610);
        groups[10] = (RadioGroup) findViewById(R.id.rg_611);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int[] answer1 = bundle.getIntArray("answer1");
        int[] answer2 = bundle.getIntArray("answer2");
        int[] answer3 = bundle.getIntArray("answer3");
        int[] answer4 = bundle.getIntArray("answer4");
        int[] answer5 = bundle.getIntArray("answer5");

        int answer[] = new int[11];
        for (int i=0; i<answer.length; ++i) {
            answer[i] = -1;
        }

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox6);
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
        texts[0] = (TextView) findViewById(R.id.question_601);
        texts[1] = (TextView) findViewById(R.id.question_602);
        texts[2] = (TextView) findViewById(R.id.question_603);
        texts[3] = (TextView) findViewById(R.id.question_604);
        texts[4] = (TextView) findViewById(R.id.question_605);
        texts[5] = (TextView) findViewById(R.id.question_606);
        texts[6] = (TextView) findViewById(R.id.question_607);
        texts[7] = (TextView) findViewById(R.id.question_608);
        texts[8] = (TextView) findViewById(R.id.question_609);
        texts[9] = (TextView) findViewById(R.id.question_610);
        texts[10] = (TextView) findViewById(R.id.question_611);


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


        Button prev = (Button) findViewById(R.id.btn6_prev);
        Button next = (Button) findViewById(R.id.btn6_next);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                        texts[i].setPaintFlags(texts[i].getPaintFlags() | Paint.FAKE_BOLD_TEXT_FLAG);
                    } else {
                        texts[i].setPaintFlags(texts[i].getPaintFlags() &~ Paint.FAKE_BOLD_TEXT_FLAG);
                    }
                }

                if (num_unchecked != 0) {
                    Toast.makeText(getApplicationContext(), "모든 항목을 선택하세요", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), Menu2Result.class);
                    intent.putExtra("answer1", answer1);
                    intent.putExtra("answer2", answer2);
                    intent.putExtra("answer3", answer3);
                    intent.putExtra("answer4", answer4);
                    intent.putExtra("answer5", answer5);
                    intent.putExtra("answer6", answer);
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