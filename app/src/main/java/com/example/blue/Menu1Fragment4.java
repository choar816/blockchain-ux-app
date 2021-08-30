package com.example.blue;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class Menu1Fragment4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.menu1_fragment4, container, false);

        Button button = (Button) rootView.findViewById(R.id.button_uxstart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rootView.getContext(), Menu2Activity1.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return rootView;
    }
}