package com.example.amst2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class graficoLinealVentana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafico_lineal_ventana);
    }

    public void ventanaPrincipal (View view){
        Intent cambioVentana = new Intent(graficoLinealVentana.this, MainActivity.class);
        startActivity(cambioVentana);
        finish();
    }
}