package com.example.blue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;


public class Menu2Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.menu2_fragment2, container, false);

        RadioGroup rg01 = (RadioGroup) rootView.findViewById(R.id.rg_201);
        RadioGroup rg02 = (RadioGroup) rootView.findViewById(R.id.rg_202);
        RadioGroup rg03 = (RadioGroup) rootView.findViewById(R.id.rg_203);
        RadioGroup rg04 = (RadioGroup) rootView.findViewById(R.id.rg_204);
        RadioGroup rg05 = (RadioGroup) rootView.findViewById(R.id.rg_205);
        RadioGroup rg06 = (RadioGroup) rootView.findViewById(R.id.rg_206);
        RadioGroup rg07 = (RadioGroup) rootView.findViewById(R.id.rg_207);
        RadioGroup rg08 = (RadioGroup) rootView.findViewById(R.id.rg_208);
        RadioGroup rg09 = (RadioGroup) rootView.findViewById(R.id.rg_209);
        RadioGroup rg10 = (RadioGroup) rootView.findViewById(R.id.rg_210);
        RadioGroup rg11 = (RadioGroup) rootView.findViewById(R.id.rg_211);
        RadioGroup rg12 = (RadioGroup) rootView.findViewById(R.id.rg_212);

        TextView q01 = (TextView) rootView.findViewById(R.id.question_201);
        TextView q02 = (TextView) rootView.findViewById(R.id.question_202);
        TextView q03 = (TextView) rootView.findViewById(R.id.question_203);
        TextView q04 = (TextView) rootView.findViewById(R.id.question_204);
        TextView q05 = (TextView) rootView.findViewById(R.id.question_205);
        TextView q06 = (TextView) rootView.findViewById(R.id.question_206);
        TextView q07 = (TextView) rootView.findViewById(R.id.question_207);
        TextView q08 = (TextView) rootView.findViewById(R.id.question_208);
        TextView q09 = (TextView) rootView.findViewById(R.id.question_209);
        TextView q10 = (TextView) rootView.findViewById(R.id.question_210);
        TextView q11 = (TextView) rootView.findViewById(R.id.question_211);
        TextView q12 = (TextView) rootView.findViewById(R.id.question_212);

        int radio01 = R.id.radio_201f;
        int radio02 = R.id.radio_202f;
        int radio03 = R.id.radio_203f;
        int radio04 = R.id.radio_204f;
        int radio05 = R.id.radio_205f;
        int radio06 = R.id.radio_206f;
        int radio07 = R.id.radio_207f;
        int radio08 = R.id.radio_208f;
        int radio09 = R.id.radio_209f;
        int radio10 = R.id.radio_210f;
        int radio11 = R.id.radio_211f;
        int radio12 = R.id.radio_212f;

        // 해당 없음 선택 -> 글씨 흐리게
        rg01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio01) {
                    q01.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q01.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }
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
            }
        });

        rg12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == radio12) {
                    q12.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q12.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }
            }
        });


        return rootView;
    }
}