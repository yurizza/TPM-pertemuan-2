package com.example.explicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private Button btnOperator;
    private EditText etOperand1,etOperand2;
    private TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnOperator = findViewById(R.id.btnOperator);
        etOperand1 = findViewById(R.id.etOperand1);
        etOperand2 = findViewById(R.id.etOperand2);
        tvHasil = findViewById(R.id.tvHasil);

        btnOperator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sOperand1 = etOperand1.getText().toString();
                    String sOperand2 = etOperand2.getText().toString();

                    float fOperand1 = Float.parseFloat(sOperand1);
                    float fOperand2 = Float.parseFloat(sOperand2);
                    float fHasil = fOperand1 * fOperand2;
                    String sHasil = String.valueOf(fHasil);

                    tvHasil.setText(sHasil);
                }catch (NumberFormatException x){
                    Toast.makeText(getApplicationContext(),"field tidak boleh kosong",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
