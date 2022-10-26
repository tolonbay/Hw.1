package com.example.a3_mhw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private TextView tvTo;
    private EditText edtTheme;
    private EditText etdText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvTo = findViewById(R.id.to_2);
        edtTheme = findViewById(R.id.theme);
        etdText = findViewById(R.id.text1);

        String etEmail = getIntent().getStringExtra("tvFrom");
        tvTo.setText(etEmail);
        String etTheme = getIntent().getStringExtra("tvTo");
        edtTheme.setText(etTheme);
        String etText = getIntent().getStringExtra("tvFrom");
        etdText.setText(etText);
    }
}