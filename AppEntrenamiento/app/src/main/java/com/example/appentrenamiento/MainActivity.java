package com.example.appentrenamiento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button bcliente;
    Button bcoach;

    /**
     * Ejecuta una nueva actividad.**
     * Vincula la nueva actividad con la interfaz activity_main.**
     * Vincula el boton bcliente con el boton botoncliente de la interfaz anterior mencionada
     * Vincula el boton bcoach con el boton botoncoach de la interfaz anterior mencionada
     * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bcliente=(Button) findViewById(R.id.botonCliente);
        bcoach=(Button) findViewById(R.id.botonCoach);

        bcliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,ActividadCliente.class);
                startActivity(i);
            }
        });
        bcoach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,ActividadCoach.class);
                startActivity(i);
            }
        });
    }
}
