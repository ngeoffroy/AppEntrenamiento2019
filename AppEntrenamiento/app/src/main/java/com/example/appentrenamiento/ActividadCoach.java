package com.example.appentrenamiento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActividadCoach extends AppCompatActivity {

    Button agregarAlumno;
    Button coachagregarEjercicio;

    /**
     * Ejecuta una nueva actividad.**
     * Vincula la nueva actividad con la interfaz activity_actividad_coach.**
     * Vincula el boton agregarAlumno con el boton bagregarpibe creado en la interfaz anteriormente mencionada.
     * Vincula el boton coachagregarEjercicio con el boton bagregarpibe de la interfaz anterior mencionada
     * El boton coachagregarEjercicio manda a la actividad MensajeNuevoEjercicio**
     * El boton agregarAlumno manda a la actividad ActividadAgregarAlumno
     * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_coach);
        agregarAlumno=(Button) findViewById(R.id.bagregarpibe);
        coachagregarEjercicio=(Button)findViewById(R.id.bagregarnuevoejercicio);
        coachagregarEjercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(ActividadCoach.this,MensajeNuevoEjercicio.class);
                startActivity(i);
            }
        });
        agregarAlumno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(ActividadCoach.this, ActividadAgregarAlumno.class);
                startActivity(i);
            }
        });
    }
}
