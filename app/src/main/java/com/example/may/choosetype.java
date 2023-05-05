package com.example.may;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.may.databinding.ActivityChoosetypeBinding;


public class choosetype extends AppCompatActivity {
    ActivityChoosetypeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChoosetypeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choosetype.this, StudentLogin.class);
                startActivity(intent);
            }
        });
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choosetype.this, WardenLogin.class);
                startActivity(intent);
            }
        });
        binding.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(choosetype.this, GuardLogin.class);
                startActivity(intent);
            }
        });
    }
}