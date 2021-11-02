package com.example.appentrenamiento;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


public class ActividadAgregarAlumno extends AppCompatActivity {
    private ListView l;
    private EditText texto;
    private Button boton;

    /**
     * Ejecuta una nueva actividad.**
            * Vincula la nueva actividad con la interfaz activity_listviewalumno.**
            * Vincula la listView l con la listView listadodepibes creado en la interfaz anteriormente mencionada.
            * Vincula el EditText texto con el editText2 de la interfaz anterior mencionada
            * Vincula el boton con el boton botonagregaralumno de la interfaz anterior mencionada
            * Manda datos de los nombres a la actividad listadonombres**
            * */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewalumno);
        l=(ListView) findViewById(R.id.listadodepibes) ;
        texto = (EditText) findViewById(R.id.editText2);
        boton = (Button) findViewById(R.id.botonagregaralumno);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarActivity(v, texto.getText().toString());
            }
        });
    }

    public void lanzarActivity(View v, String texto) {
        Intent i = new Intent(this, listadonombres.class);
        i.putExtra("dato1",texto);
        startActivity(i);
    }

}
