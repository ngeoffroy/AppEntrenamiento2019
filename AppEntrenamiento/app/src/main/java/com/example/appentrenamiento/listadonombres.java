package com.example.appentrenamiento;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class listadonombres extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<String> adaptadordeejerciciosrutina;

    /**
     * Ejecuta una nueva actividad.**
     * Vincula la nueva actividad con la interfaz activity_listadonombres.**
     * Vincula la listView listView con la listView listadodepibes creado en la interfaz anteriormente mencionada.
     * Crea un String e que recibe los datos de ActividadAgregarAlumno
     * Se utiliza el adaptador por defecto para String
     * El adaptador adapta la listView a la cadena de texto mencionada anteriormente**
     * */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listadonombres);
        listView = (ListView) findViewById(R.id.listadodepibes);
        String e = "";
        e=recibirDatos();
        final ArrayList<String> nombres=new ArrayList<>();
        nombres.add(recibirDatos());
        adaptadordeejerciciosrutina = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,nombres);
        listView.setAdapter(adaptadordeejerciciosrutina);
    }
    private String recibirDatos() {
        Bundle extra = getIntent().getExtras();
        String recibirDato1 = extra.getString("dato1");
        return recibirDato1;
    }
}
