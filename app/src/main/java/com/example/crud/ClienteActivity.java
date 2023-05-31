package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ClienteActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        init();
    }
    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement( "1", "Pedro","56575676","CALLESDFSG","DFGDFGDF"));
        elements.add(new ListElement( "2", "Goku","56767","BRASIL","dfgfdgfdg"));
        elements.add(new ListElement( "3", "Roberto","578934","CALLE BENI","dfgdg"));
        elements.add(new ListElement( "4", "Sofia","789789","CALLE VENEZUELA","dfgfdgdf"));
        elements.add(new ListElement( "5", "Carla","79879","CALLE OSLO","dgfgdfdfg"));

        ListAdapter listAdapter = new ListAdapter(elements, this);

        RecyclerView recyclerView = findViewById(R.id.listRecy);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }

}