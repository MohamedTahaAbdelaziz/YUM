package com.example.yum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Choices extends DirectoryLocation {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.choices, contentFrameLayout);
//        setContentView(R.layout.activity_choices);

        TextView title = findViewById(R.id.toolbar_title);
        title.setText("Choices");

        final RecyclerView choicesRV = findViewById(R.id.choices_RV);
        final LinearLayoutManager choicesLayout = new LinearLayoutManager(this);
        choicesRV.setLayoutManager(choicesLayout);
    }
}