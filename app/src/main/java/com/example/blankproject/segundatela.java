package com.example.blankproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class segundatela extends AppCompatActivity {
    TextView tvRecebe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_tela);

        tvRecebe = (TextView)findViewById(R.id.tvRecebe);
        String valor = getIntent().getStringExtra("Chave");
        tvRecebe.setText(valor);
    }
}
