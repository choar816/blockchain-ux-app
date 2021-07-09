package com.example.blue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;


public class Menu2Fragment5 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.menu2_fragment5, container, false);

        RadioGroup rg01 = (RadioGroup) rootView.findViewById(R.id.rg_501);
        RadioGroup rg02 = (RadioGroup) rootView.findViewById(R.id.rg_502);
        RadioGroup rg03 = (RadioGroup) rootView.findViewById(R.id.rg_503);
        RadioGroup rg04 = (RadioGroup) rootView.findViewById(R.id.rg_504);
        RadioGroup rg05 = (RadioGroup) rootView.findViewById(R.id.rg_505);
        RadioGroup rg06 = (RadioGroup) rootView.findViewById(R.id.rg_506);
        RadioGroup rg07 = (RadioGroup) rootView.findViewById(R.id.rg_507);
        RadioGroup rg08 = (RadioGroup) rootView.findViewById(R.id.rg_508);

        TextView q01 = (TextView) rootView.findViewById(R.id.question_501);
        TextView q02 = (TextView) rootView.findViewById(R.id.question_502);
        TextView q03 = (TextView) rootView.findViewById(R.id.question_503);
        TextView q04 = (TextView) rootView.findViewById(R.id.question_504);
        TextView q05 = (TextView) rootView.findViewById(R.id.question_505);
        TextView q06 = (TextView) rootView.findViewById(R.id.question_506);
        TextView q07 = (TextView) rootView.findViewById(R.id.question_507);
        TextView q08 = (TextView) rootView.findViewById(R.id.question_508);

        int radio01 = R.id.radio_501f;
        int radio02 = R.id.radio_502f;
        int radio03 = R.id.radio_503f;
        int radio04 = R.id.radio_504f;
        int radio05 = R.id.radio_505f;
        int radio06 = R.id.radio_506f;
        int radio07 = R.id.radio_507f;
        int radio08 = R.id.radio_508f;

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

        return rootView;
    }
}