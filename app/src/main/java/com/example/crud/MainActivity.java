package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    EditText etID,etNOMBRE,etTELEFONO,etDIRECCION,etUBICACION;
    Button btngregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etID = findViewById(R.id.etIDm);
        etNOMBRE =  findViewById(R.id.etNombrem);
        etTELEFONO =  findViewById(R.id.etTelefonom);
        etDIRECCION =  findViewById(R.id.etDireccionm);
        etUBICACION =  findViewById(R.id.etUbicacionm);

        final BD bdimodelo = new BD(getApplicationContext());

        btngregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bdimodelo.agregarClientes(etID.getText().toString(),etNOMBRE.getText().toString(),etTELEFONO.getText().toString(),etDIRECCION.getText().toString(),etUBICACION.getText().toString());
                Toast.makeText(getApplicationContext(), "SE AGREGO CORRETAMENTE", Toast.LENGTH_SHORT).show();
            }
        });

    }



}