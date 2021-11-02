package com.example.appentrenamiento;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class adaptadoritems extends ArrayAdapter<ejercicioitem> {

    /**
     * Adaptador creado para poder llevar la conversion de un objeto elementoitem a tipos String
     * Se utiliza para poder llenar las ListViews de ejercicios
     * */

    private Context contexto;
    private List<ejercicioitem> ejlist = new ArrayList<>();

    public adaptadoritems(@NonNull Context context, ArrayList<ejercicioitem> list) {
        super(context, 0 , list);
        contexto = context;
        ejlist = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull final ViewGroup parent) {

        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(contexto).inflate(R.layout.activity_estructuraejercicio,parent,false);

        final ejercicioitem ejercicioActual = ejlist.get(position);

        TextView name = (TextView) listItem.findViewById(R.id.textView_name);
        name.setText(ejercicioActual.getmName());

        Button accept = (Button) listItem.findViewById(R.id.bExaminar);
        accept.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(contexto, PantallaDescripcion.class);
                intent.putExtra("dato1",ejercicioActual.getDescripcion());
                parent.getContext().startActivity(intent);
            }
        });


        return listItem;
    }



}
