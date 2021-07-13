package com.example.blue;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;


public class Menu2Fragment6 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.menu2_fragment6, container, false);

        boolean answer6[] = new boolean[11];

        for (int i=0; i<11; ++i) {
            answer6[i] = false;
        }

        RadioGroup rg01 = (RadioGroup) rootView.findViewById(R.id.rg_601);
        RadioGroup rg02 = (RadioGroup) rootView.findViewById(R.id.rg_602);
        RadioGroup rg03 = (RadioGroup) rootView.findViewById(R.id.rg_603);
        RadioGroup rg04 = (RadioGroup) rootView.findViewById(R.id.rg_604);
        RadioGroup rg05 = (RadioGroup) rootView.findViewById(R.id.rg_605);
        RadioGroup rg06 = (RadioGroup) rootView.findViewById(R.id.rg_606);
        RadioGroup rg07 = (RadioGroup) rootView.findViewById(R.id.rg_607);
        RadioGroup rg08 = (RadioGroup) rootView.findViewById(R.id.rg_608);
        RadioGroup rg09 = (RadioGroup) rootView.findViewById(R.id.rg_609);
        RadioGroup rg10 = (RadioGroup) rootView.findViewById(R.id.rg_610);
        RadioGroup rg11 = (RadioGroup) rootView.findViewById(R.id.rg_611);

        TextView q01 = (TextView) rootView.findViewById(R.id.question_601);
        TextView q02 = (TextView) rootView.findViewById(R.id.question_602);
        TextView q03 = (TextView) rootView.findViewById(R.id.question_603);
        TextView q04 = (TextView) rootView.findViewById(R.id.question_604);
        TextView q05 = (TextView) rootView.findViewById(R.id.question_605);
        TextView q06 = (TextView) rootView.findViewById(R.id.question_606);
        TextView q07 = (TextView) rootView.findViewById(R.id.question_607);
        TextView q08 = (TextView) rootView.findViewById(R.id.question_608);
        TextView q09 = (TextView) rootView.findViewById(R.id.question_609);
        TextView q10 = (TextView) rootView.findViewById(R.id.question_610);
        TextView q11 = (TextView) rootView.findViewById(R.id.question_611);

        int radio01 = R.id.radio_601f;
        int radio02 = R.id.radio_602f;
        int radio03 = R.id.radio_603f;
        int radio04 = R.id.radio_604f;
        int radio05 = R.id.radio_605f;
        int radio06 = R.id.radio_606f;
        int radio07 = R.id.radio_607f;
        int radio08 = R.id.radio_608f;
        int radio09 = R.id.radio_609f;
        int radio10 = R.id.radio_610f;
        int radio11 = R.id.radio_611f;

        // 해당 없음 선택 -> 글씨 흐리게
        rg01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio01) {
                    q01.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q01.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }

                answer6[0] = (checkedId == R.id.radio_601a || checkedId == R.id.radio_601b) ? true : false;
            }
        });

        rg02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio02) {
                    q02.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q02.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }

                answer6[1] = (checkedId == R.id.radio_602a || checkedId == R.id.radio_602b) ? true : false;
            }
        });

        rg03.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio03) {
                    q03.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q03.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }

                answer6[2] = (checkedId == R.id.radio_603a || checkedId == R.id.radio_603b) ? true : false;
            }
        });

        rg04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio04) {
                    q04.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q04.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }

                answer6[3] = (checkedId == R.id.radio_604a || checkedId == R.id.radio_604b) ? true : false;
            }
        });

        rg05.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio05) {
                    q05.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q05.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }

                answer6[4] = (checkedId == R.id.radio_605a || checkedId == R.id.radio_605b) ? true : false;
            }
        });

        rg06.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio06) {
                    q06.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q06.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }

                answer6[5] = (checkedId == R.id.radio_606a || checkedId == R.id.radio_606b) ? true : false;
            }
        });

        rg07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio07) {
                    q07.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q07.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }

                answer6[6] = (checkedId == R.id.radio_607a || checkedId == R.id.radio_607b) ? true : false;
            }
        });

        rg08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio08) {
                    q08.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q08.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }

                answer6[7] = (checkedId == R.id.radio_608a || checkedId == R.id.radio_608b) ? true : false;
            }
        });

        rg09.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio09) {
                    q09.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q09.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }

                answer6[8] = (checkedId == R.id.radio_609a || checkedId == R.id.radio_609b) ? true : false;
            }
        });

        rg10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio10) {
                    q10.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q10.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }

                answer6[9] = (checkedId == R.id.radio_610a || checkedId == R.id.radio_610b) ? true : false;
            }
        });

        rg11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio11) {
                    q11.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q11.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }

                answer6[10] = (checkedId == R.id.radio_611a || checkedId == R.id.radio_611b) ? true : false;
            }
        });


        // 결과 확인 버튼
        Button button_result = (Button) rootView.findViewById(R.id.button_result);
        button_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Menu2Result.class);
                intent.putExtra("answer6", answer6);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return rootView;
    }
}