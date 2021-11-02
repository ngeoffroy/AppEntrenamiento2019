package com.example.appentrenamiento;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Map;

public class MensajeNuevoEjercicio extends AppCompatActivity {
    private EditText texto;
    private Button boton;
    private EditText texto2;
    private Button boton2;

    /**
     * Ejecuta una nueva actividad.**
     * Vincula la nueva actividad con la interfaz activity_nuevotexto.**
     * Vincula el boton boton con el boton botonListado creado en la interfaz anteriormente mencionada.
     *  Vincula el boton boton2 con el boton botonAgregarDescripcion creado en la interfaz anteriormente mencionada.
     *  Vincula el EditText texto con el EditText editText creado en la interfaz anteriormente mencionada.
     *  Vincula el EditText texto2 con el EditText editTextDesc creado en la interfaz anteriormente mencionada.
     * Se manda texto y texto2 a la actividad "actividadLista"
     * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevotexto);
        texto = (EditText) findViewById(R.id.editText);
        boton = (Button) findViewById(R.id.botonListado);
        texto2=(EditText) findViewById(R.id.editTextDesc);
        boton2=(Button) findViewById(R.id.botonAgregarDescripcion);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarActivity(v, texto.getText().toString(),texto2.getText().toString());
            }
        });
    }

    public void lanzarActivity(View v, String texto1,String textoo) {
        Intent i = new Intent(this, actividadLista.class);
        i.putExtra("nombreej",texto1);
        i.putExtra("desc",textoo);
        startActivity(i);
    }

}
