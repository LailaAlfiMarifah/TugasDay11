package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageButton ibMulai = findViewById(R.id.ibMulai);
        EditText etNohp = findViewById(R.id.etNohp);

        etNohp.setKeyListener(new DigitsKeyListener());

        ibMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, BuatProfilActivity.class);
                startActivity(intent);
            }
        });
    }


    public static class DigitsKeyListener extends android.text.method.DigitsKeyListener {

        public DigitsKeyListener() {
            super();
        }

        @Override
        public int getInputType() {
            return InputType.TYPE_CLASS_NUMBER;
        }
    }
}

