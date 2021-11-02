package com.example.appentrenamiento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ActividadCliente extends AppCompatActivity {

    Button vEjercicios;

    /**
     * Ejecuta la actividad del cliente.**
            * Vincula la nueva actividad con la interfaz activity_cliente.**
            * Vincula el boton vEjercicios con el boton verRutinas creado en la interfaz anteriormente mencionada**
            * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_actividad_cliente);
        super.onCreate(savedInstanceState);
        vEjercicios=(Button)findViewById(R.id.verRutinas);

        vEjercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ActividadCliente.this,actividadLista.class);
                startActivity(i);
            }
        });
    }

}

