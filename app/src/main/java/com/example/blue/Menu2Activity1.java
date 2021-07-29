package com.example.blue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Menu2Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2_1);

        // action bar 설정 (제목, 뒤로가기버튼)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("체크리스트");


        boolean answer[] = new boolean[11];

        for (int i=0; i<11; ++i) {
            answer[i] = false;
        }

        RadioGroup rg01 = (RadioGroup) findViewById(R.id.rg_101);
        RadioGroup rg02 = (RadioGroup) findViewById(R.id.rg_102);
        RadioGroup rg03 = (RadioGroup) findViewById(R.id.rg_103);
        RadioGroup rg04 = (RadioGroup) findViewById(R.id.rg_104);
        RadioGroup rg05 = (RadioGroup) findViewById(R.id.rg_105);
        RadioGroup rg06 = (RadioGroup) findViewById(R.id.rg_106);
        RadioGroup rg07 = (RadioGroup) findViewById(R.id.rg_107);
        RadioGroup rg08 = (RadioGroup) findViewById(R.id.rg_108);
        RadioGroup rg09 = (RadioGroup) findViewById(R.id.rg_109);
        RadioGroup rg10 = (RadioGroup) findViewById(R.id.rg_110);
        RadioGroup rg11 = (RadioGroup) findViewById(R.id.rg_111);

        TextView q01 = (TextView) findViewById(R.id.question_101);
        TextView q02 = (TextView) findViewById(R.id.question_102);
        TextView q03 = (TextView) findViewById(R.id.question_103);
        TextView q04 = (TextView) findViewById(R.id.question_104);
        TextView q05 = (TextView) findViewById(R.id.question_105);
        TextView q06 = (TextView) findViewById(R.id.question_106);
        TextView q07 = (TextView) findViewById(R.id.question_107);
        TextView q08 = (TextView) findViewById(R.id.question_108);
        TextView q09 = (TextView) findViewById(R.id.question_109);
        TextView q10 = (TextView) findViewById(R.id.question_110);
        TextView q11 = (TextView) findViewById(R.id.question_111);


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

        rg09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = group.indexOfChild(group.findViewById(checkedId));
                if (index == 5) {
                    q09.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOmitted));
                } else {
                    q09.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOriginal));
                }

                answer[8] = (index == 0 || index == 1);
            }
        });

        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = group.indexOfChild(group.findViewById(checkedId));
                if (index == 5) {
                    q10.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOmitted));
                } else {
                    q10.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOriginal));
                }

                answer[9] = (index == 0 || index == 1);
            }
        });

        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int index = group.indexOfChild(group.findViewById(checkedId));
                if (index == 5) {
                    q11.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOmitted));
                } else {
                    q11.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.textOriginal));
                }

                answer[10] = (index == 0 || index == 1);
            }
        });


        Button next = (Button) findViewById(R.id.btn1_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rg01.getCheckedRadioButtonId() == -1 || rg02.getCheckedRadioButtonId() == -1 ||
                        rg03.getCheckedRadioButtonId() == -1 || rg04.getCheckedRadioButtonId() == -1 ||
                        rg05.getCheckedRadioButtonId() == -1 || rg06.getCheckedRadioButtonId() == -1 ||
                        rg07.getCheckedRadioButtonId() == -1 || rg08.getCheckedRadioButtonId() == -1 ||
                        rg09.getCheckedRadioButtonId() == -1 || rg10.getCheckedRadioButtonId() == -1 ||
                        rg11.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "모든 항목을 선택하세요", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), Menu2Activity2.class);
                    intent.putExtra("answer1", answer);
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