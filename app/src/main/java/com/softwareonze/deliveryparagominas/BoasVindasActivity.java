package com.softwareonze.deliveryparagominas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BoasVindasActivity extends AppCompatActivity {

    Button botaoIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas);

        botaoIniciar = findViewById(R.id.bt_iniciar);
        botaoIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(BoasVindasActivity.this, NavActivity.class));

            }
        });

    }
}
