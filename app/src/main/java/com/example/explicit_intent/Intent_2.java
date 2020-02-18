package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Intent_2 extends AppCompatActivity {
    private Button btnPerkalian;
    private TextView tvNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_2);
        btnPerkalian = findViewById(R.id.btnPerkalian);
        tvNama = findViewById(R.id.tvNama);

        String sNama = getIntent().getStringExtra("nama");
        String hasilNama = "Hai "+sNama+"!";
        tvNama.setText(hasilNama);

        btnPerkalian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent_2.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
