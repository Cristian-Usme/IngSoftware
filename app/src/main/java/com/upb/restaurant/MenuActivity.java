package com.upb.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MenuActivity extends AppCompatActivity {

    private String [] categoriasProductos = new String[]{"Entrada","Plato Fuerte", "Bebida", "Postre"};
    private ListView listaCategorias = null;

    private ListAdapter adaptadorLista = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listaCategorias = findViewById(android.R.id.list);

        adaptadorLista = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categoriasProductos);

        listaCategorias.setAdapter(adaptadorLista);


    }

}