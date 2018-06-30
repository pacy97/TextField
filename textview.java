package com.example.Pacasian.pacy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sumith on 16-10-2017.
 */

public class about extends AppCompatActivity {

private TextView textview;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        textview=(TextView)findViewById(R.id.textView);
        string st="Pacasian";
        textview.setText(st);
    }
}
