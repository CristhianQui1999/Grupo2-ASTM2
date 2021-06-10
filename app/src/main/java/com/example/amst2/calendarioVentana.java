package com.example.amst2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class calendarioVentana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_ventana);
    }

    public void ventanaPrincipal (View view){
        Intent cambioVentana = new Intent(calendarioVentana.this, MainActivity.class);
        startActivity(cambioVentana);
        finish();
    }
}