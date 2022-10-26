package com.example.a3_mhw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private EditText etEmail;
     private EditText etTheme;
     private EditText etText;
     private Button btSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.edt_third);
        etTheme = findViewById(R.id.edt_second);
        etText = findViewById(R.id.edt_first);
        btSend = findViewById(R.id.btn_send);

        btSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{etEmail.getText().toString()});
                intent.putExtra(Intent.EXTRA_SUBJECT,etTheme.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,etText.getText().toString());

                intent.setData(Uri.parse("mailto:"));
                if (intent.resolveActivity(getPackageManager()) != null){
                startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Нет приложение поддерживающий",
                       Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}