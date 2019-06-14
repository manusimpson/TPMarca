package com.ites.marca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button ingresarBtn;
    Button registroBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        ingresarBtn = findViewById(R.id.ingresar_btn);
        registroBtn = findViewById(R.id.registro_btn);
        // Si paso this como contexto entonces el listener lo implementa la Activity escuchando el evt click
        ingresarBtn.setOnClickListener(this);
        registroBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ingresar_btn:
                abrirPrincipal();
                break;
            case R.id.registro_btn:
                abrirRegistro();
                break;
        }
    }

    private void abrirRegistro() {
        Intent i = new Intent(this, RegistroActivity.class);
        startActivity(i);
    }

    private void abrirPrincipal() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
