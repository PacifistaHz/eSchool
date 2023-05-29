package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Home extends Fragment {
    CardView maths, geometry, analitics, physics, astronomy,history, french, english, spanish, biology, chemistry, music;




    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root =  inflater.inflate(R.layout.fragment_home, container, false);
        maths=root.findViewById(R.id.maths);
        geometry=root.findViewById(R.id.geometry);
        analitics=root.findViewById(R.id.analitics);
        physics=root.findViewById(R.id.physics);
        astronomy=root.findViewById(R.id.astronomy);
        history=root.findViewById(R.id.history);
        french=root.findViewById(R.id.french);
        english=root.findViewById(R.id.english);
        spanish=root.findViewById(R.id.spanish);
        biology=root.findViewById(R.id.biology);
        chemistry=root.findViewById(R.id.chemistry);
        music=root.findViewById(R.id.music);

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),Math.class));
            }
        });

        return root;
    }
}