package com.example.appentrenamiento;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class ejercicioitem {

    private int imagenicono;
    private String nombre;
    private String descripcion;
    private int repeticiones;

    /**
     * Clase creada para almacenar un objeto de tipo ejercicioitem
     * Posee un nombre, una imagen y una descripcion
     * */

    // Constructor that is used to create an instance of the Movie object
    public ejercicioitem(int mImageDrawable, String mName, String descripcion) {
        this.imagenicono = mImageDrawable;
        this.nombre = mName;
        this.descripcion = descripcion;
    }

    public ejercicioitem(){

    }

    public ejercicioitem(int mImageDrawable, String mName, String descripcion,int n) {
        this.imagenicono = mImageDrawable;
        this.nombre = mName;
        this.descripcion = descripcion;
        this.repeticiones=n;
    }


    public int getmImageDrawable() {
        return imagenicono;
    }

    public void setmImageDrawable(int mImageDrawable) {
        this.imagenicono = mImageDrawable;
    }

    public String getmName() {
        return nombre;
    }

    public void setmName(String mName) {
        this.nombre = mName;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String mRelease) {
        this.descripcion= mRelease;
    }

    public void setRepeticiones(int r){
        repeticiones=r;
    }

    public int getRepeticiones(){
        return repeticiones;
    }

}