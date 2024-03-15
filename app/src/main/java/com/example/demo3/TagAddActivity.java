package com.example.demo3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class TagAddActivity extends AppCompatActivity{

    private EditText edTagName;
    private Button btnColor;

    private ImageView imgIcon;

    private FloatingActionButton btnCheckTag;

    private FloatingActionButton btnCancelTag;

    private int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tag_add);

        edTagName = findViewById(R.id.edTagName);
        btnColor = findViewById(R.id.btnPickColor);
        imgIcon= findViewById(R.id.imgPickIcon);
        btnCheckTag= findViewById(R.id.btnMarkTag);
        btnCancelTag= findViewById(R.id.btnCancelTag);

        color= ContextCompat.getColor(TagAddActivity.this, R.color.lavender);

        btnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorPicker();
            }
        });

    }

    private void openColorPicker() {

    }
}