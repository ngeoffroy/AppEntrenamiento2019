package com.example.appentrenamiento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PantallaDescripcion extends AppCompatActivity {
    TextView descripcion;


    /**
     * Ejecuta una nueva actividad.**
     * Vincula la nueva actividad con la interfaz activity_descripcion.**
     * Se encarga de generar un TextView con la descripcion de un ejercicio
     * */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion);
        descripcion=findViewById(R.id.textoDescripcionEj);
        descripcion.setText(recibirDatos());
    }

    ;


    private String recibirDatos() {
        Bundle extra = getIntent().getExtras();
        String recibirDato1 = extra.getString("dato1");
        return recibirDato1;
    }
}

