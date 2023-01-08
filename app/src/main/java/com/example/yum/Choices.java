package com.example.yum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Choices extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);

        TextView title = findViewById(R.id.toolbar_title);
        title.setText("Choices");

        final RecyclerView choicesRV = findViewById(R.id.choices_RV);
        final LinearLayoutManager choicesLayout = new LinearLayoutManager(this);
        choicesRV.setLayoutManager(choicesLayout);
    }
}