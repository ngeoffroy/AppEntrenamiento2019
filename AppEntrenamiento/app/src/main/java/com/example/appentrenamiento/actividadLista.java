package com.example.appentrenamiento;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Map;

/**
 * Actividad creada para poder inicializar la lista de ejercicios
 * En esta actividad, podrá contar con una gran variedad de ejercicios para armar cualquier wod
 * */

public class actividadLista extends AppCompatActivity {

    private ListView listView;
    @Override

    /**
     * Ejecuta una nueva actividad.**
     * Vincula la nueva actividad con la interfaz activity_estructuraejercicio.**
     * Agrega ejercicios a la listView
     * */

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estructuraejercicio);
        adaptadoritems adaptadordeejercicios;
        listView = (ListView) findViewById(R.id.listej);
        ArrayList<ejercicioitem> listaejercicios=new ArrayList<>();
        adaptadordeejercicios=new adaptadoritems(this,listaejercicios);
        Bundle extras= getIntent().getExtras();


        listaejercicios.add(new ejercicioitem(R.drawable.katebell, "Thruster", "Sentadilla mas push press"));
        listaejercicios.add(new ejercicioitem(R.drawable.katebell, "Power Squat Snatch", "Snatch mas sentadilla"));
        listaejercicios.add(new ejercicioitem(R.drawable.katebell, "Pull Ups", "Dominadas"));
        listaejercicios.add(new ejercicioitem(R.drawable.katebell, "Push Ups", "Flexiones de brazos"));
        listaejercicios.add(new ejercicioitem(R.drawable.katebell, "Sit Ups", "Abdominales con plantas de pies juntos"));
        listaejercicios.add(new ejercicioitem(R.drawable.katebell, "Muscle Up", "Dominada mas subida a la barra"));
        listaejercicios.add(new ejercicioitem(R.drawable.katebell, "Cluster", "Clean mas thruster"));
        listaejercicios.add(new ejercicioitem(R.drawable.katebell, "Superman", "Espinales con miembros extendidos"));
        listaejercicios.add(new ejercicioitem(R.drawable.katebell, "Run 400mts", "Correr una vuelta a la manzana"));
        listaejercicios.add(new ejercicioitem(R.drawable.katebell, "Pistols", "Sentadillas a una pierna"));
        listView.setAdapter(adaptadordeejercicios);
        if(extras!=null) {
            listaejercicios.add(new ejercicioitem(R.drawable.katebell, extras.getString("nombreej"), extras.getString("desc")));
            adaptadordeejercicios.notifyDataSetChanged();
        }
        listView.setAdapter(adaptadordeejercicios);
        };


    }





