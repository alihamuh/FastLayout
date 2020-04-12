package com.example.linearbuttons;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import androidx.appcompat.widget.AppCompatButton;

public class Main {

    View mainView;

    public Main(Context context) {
        setClickMethods(context);
    }

    public View getMainView() {
        return mainView;
    }

    public void setClickMethods(Context context) {

        mainView = View.inflate(context, R.layout.buttons, null);

        final AppCompatButton btn1 = mainView.findViewById(R.id.btn_1);
        final AppCompatButton btn2 = mainView.findViewById(R.id.btn_2);
        final AppCompatButton btn3 = mainView.findViewById(R.id.btn_3);
        final AppCompatButton btn4 = mainView.findViewById(R.id.btn_4);
        final AppCompatButton btn5 = mainView.findViewById(R.id.btn_5);
        final AppCompatButton btn6 = mainView.findViewById(R.id.btn_6);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn1.setText("Test 1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn2.setText("Test 2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setText("Test 3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn4.setText("Test 4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn5.setText("Test 5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn6.setText("Test 6");
            }
        });
    }

}
