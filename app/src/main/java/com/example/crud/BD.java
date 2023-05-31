package com.example.crud;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BD extends SQLiteOpenHelper {

    private static final String NOMBRE_BD="emprendimiento3.db";
    private static final int VERSION_BD=2;
    public static final String TABLA_CLIENTES = "clientes";



    public BD(@Nullable Context context) {
        super(context, NOMBRE_BD,null, VERSION_BD);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE "+ TABLA_CLIENTES +"(" +
                "id TEXT PRIMARY KEY," +
                "nombre TEXT," +
                "telefono TEXT," +
                "direccion," +
                "ubicacion TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE "+ TABLA_CLIENTES);
        onCreate(sqLiteDatabase);
        // sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLA_CLIENTES);
        //sqLiteDatabase.execSQL(TABLA_CLIENTES);
    }

    public void agregarClientes(String id,String nombre,String telefono,String direccion,String ubicacion){
        SQLiteDatabase bd = getWritableDatabase();
        if (bd != null){
            bd.execSQL("INSERT INTO TABLA_CLIENTES VALUES('"+id+"','"+nombre+"','"+telefono+"','"+direccion+"','"+ubicacion+"')");
            bd.close();
        }
    }
}
