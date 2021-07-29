package com.example.blue;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Menu2Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_4);

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

        RadioGroup rg01 = (RadioGroup) findViewById(R.id.rg_401);
        RadioGroup rg02 = (RadioGroup) findViewById(R.id.rg_402);
        RadioGroup rg03 = (RadioGroup) findViewById(R.id.rg_403);
        RadioGroup rg04 = (RadioGroup) findViewById(R.id.rg_404);
        RadioGroup rg05 = (RadioGroup) findViewById(R.id.rg_405);
        RadioGroup rg06 = (RadioGroup) findViewById(R.id.rg_406);
        RadioGroup rg07 = (RadioGroup) findViewById(R.id.rg_407);
        RadioGroup rg08 = (RadioGroup) findViewById(R.id.rg_408);

        TextView q01 = (TextView) findViewById(R.id.question_401);
        TextView q02 = (TextView) findViewById(R.id.question_402);
        TextView q03 = (TextView) findViewById(R.id.question_403);
        TextView q04 = (TextView) findViewById(R.id.question_404);
        TextView q05 = (TextView) findViewById(R.id.question_405);
        TextView q06 = (TextView) findViewById(R.id.question_406);
        TextView q07 = (TextView) findViewById(R.id.question_407);
        TextView q08 = (TextView) findViewById(R.id.question_408);


        rg01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = group.indexOfChild(group.findViewById(checkedId));
                if (index == 5) {
                    q01.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOmitted));
                } else {
                    q01.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOriginal));
                }

                answer[0] = (index == 0 || index == 1);
            }
        });

        rg02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = group.indexOfChild(group.findViewById(checkedId));
                if (index == 5) {
                    q02.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOmitted));
                } else {
                    q02.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOriginal));
                }

                answer[1] = (index == 0 || index == 1);
            }
        });

        rg03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = group.indexOfChild(group.findViewById(checkedId));
                if (index == 5) {
                    q03.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOmitted));
                } else {
                    q03.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOriginal));
                }

                answer[2] = (index == 0 || index == 1);
            }
        });

        rg04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = group.indexOfChild(group.findViewById(checkedId));
                if (index == 5) {
                    q04.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOmitted));
                } else {
                    q04.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOriginal));
                }

                answer[3] = (index == 0 || index == 1);
            }
        });

        rg05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = group.indexOfChild(group.findViewById(checkedId));
                if (index == 5) {
                    q05.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOmitted));
                } else {
                    q05.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOriginal));
                }

                answer[4] = (index == 0 || index == 1);
            }
        });

        rg06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = group.indexOfChild(group.findViewById(checkedId));
                if (index == 5) {
                    q06.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOmitted));
                } else {
                    q06.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOriginal));
                }

                answer[5] = (index == 0 || index == 1);
            }
        });

        rg07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = group.indexOfChild(group.findViewById(checkedId));
                if (index == 5) {
                    q07.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOmitted));
                } else {
                    q07.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOriginal));
                }

                answer[6] = (index == 0 || index == 1);
            }
        });

        rg08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = group.indexOfChild(group.findViewById(checkedId));
                if (index == 5) {
                    q08.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOmitted));
                } else {
                    q08.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOriginal));
                }

                answer[7] = (index == 0 || index == 1);
            }
        });



        Button prev = (Button) findViewById(R.id.btn4_prev);
        Button next = (Button) findViewById(R.id.btn4_next);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Menu2Activity3.class);
                startActivity(intent);
                finish();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rg01.getCheckedRadioButtonId() == -1 || rg02.getCheckedRadioButtonId() == -1 ||
                        rg03.getCheckedRadioButtonId() == -1 || rg04.getCheckedRadioButtonId() == -1 ||
                        rg05.getCheckedRadioButtonId() == -1 || rg06.getCheckedRadioButtonId() == -1 ||
                        rg07.getCheckedRadioButtonId() == -1 || rg08.getCheckedRadioButtonId() == -1) {
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