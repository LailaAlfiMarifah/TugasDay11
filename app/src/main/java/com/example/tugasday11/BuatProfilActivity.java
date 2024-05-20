package com.example.tugasday11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BuatProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_profil);

        EditText etNama = findViewById(R.id.etNama);
        EditText etEmail = findViewById(R.id.etEmail);
        ImageButton ibMulai = findViewById(R.id.ibMulai);

        ibMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToMainActivity();
            }
        });
    }

    private void navigateToMainActivity() {
        Intent intent = new Intent(BuatProfilActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
