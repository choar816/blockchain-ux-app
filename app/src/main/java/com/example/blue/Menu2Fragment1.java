package com.example.blue;

import android.graphics.Color;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;


public class Menu2Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.menu2_fragment1, container, false);
        View resultView = inflater.inflate(R.layout.activity_menu2_result, container, false);

        RadioGroup rg101 = (RadioGroup) rootView.findViewById(R.id.rg_101);
        RadioGroup rg102 = (RadioGroup) rootView.findViewById(R.id.rg_102);
        RadioGroup rg103 = (RadioGroup) rootView.findViewById(R.id.rg_103);
        RadioGroup rg104 = (RadioGroup) rootView.findViewById(R.id.rg_104);
        RadioGroup rg105 = (RadioGroup) rootView.findViewById(R.id.rg_105);
        RadioGroup rg106 = (RadioGroup) rootView.findViewById(R.id.rg_106);
        RadioGroup rg107 = (RadioGroup) rootView.findViewById(R.id.rg_107);
        RadioGroup rg108 = (RadioGroup) rootView.findViewById(R.id.rg_108);
        RadioGroup rg109 = (RadioGroup) rootView.findViewById(R.id.rg_109);
        RadioGroup rg110 = (RadioGroup) rootView.findViewById(R.id.rg_110);
        RadioGroup rg111 = (RadioGroup) rootView.findViewById(R.id.rg_111);

        TextView q101 = (TextView) rootView.findViewById(R.id.question_101);
        TextView q102 = (TextView) rootView.findViewById(R.id.question_102);
        TextView q103 = (TextView) rootView.findViewById(R.id.question_103);
        TextView q104 = (TextView) rootView.findViewById(R.id.question_104);
        TextView q105 = (TextView) rootView.findViewById(R.id.question_105);
        TextView q106 = (TextView) rootView.findViewById(R.id.question_106);
        TextView q107 = (TextView) rootView.findViewById(R.id.question_107);
        TextView q108 = (TextView) rootView.findViewById(R.id.question_108);
        TextView q109 = (TextView) rootView.findViewById(R.id.question_109);
        TextView q110 = (TextView) rootView.findViewById(R.id.question_110);
        TextView q111 = (TextView) rootView.findViewById(R.id.question_111);

        TextView a101 = (TextView) resultView.findViewById(R.id.answer_101);

        rg101.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // 해당 없음 선택 -> 글씨 흐리게
                if (checkedId == R.id.radio_101f) {
                    q101.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q101.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }

                // 전혀 아니다, 아니다 -> 솔루션 visible
                if (checkedId == R.id.radio_101a || checkedId == R.id.radio_101b) {
                    a101.setVisibility(View.VISIBLE);
                } else {
                    a101.setVisibility(View.GONE);
                }
            }
        });

        rg102.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_102f) {
                    q102.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q102.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }
            }
        });

        rg103.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_103f) {
                    q103.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q103.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }
            }
        });

        rg104.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_104f) {
                    q104.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q104.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }
            }
        });

        rg105.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_105f) {
                    q105.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q105.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }
            }
        });

        rg106.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_106f) {
                    q106.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q106.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }
            }
        });

        rg107.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_107f) {
                    q107.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q107.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }
            }
        });

        rg108.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_108f) {
                    q108.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q108.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }
            }
        });

        rg109.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_109f) {
                    q109.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q109.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }
            }
        });

        rg110.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_110f) {
                    q110.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q110.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }
            }
        });

        rg111.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_111f) {
                    q111.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOmitted));
                } else {
                    q111.setTextColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.textOriginal));
                }
            }
        });


        return rootView;
    }
}