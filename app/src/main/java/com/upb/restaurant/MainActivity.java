package com.upb.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirMenu(View v){
        Intent i;
        i =  new Intent(this, MenuActivity.class);
        startActivity(i);
    }
    public void abrirSede(View v){
        Intent i;
        i =  new Intent(this, SedeActivity.class);
        startActivity(i);
    }
    public void abrirPedido(View v){
        Intent i;
        i =  new Intent(this, PedidoActivity.class);
        startActivity(i);
    }
    public void abrirReserva(View v){
        Intent i;
        i =  new Intent(this, ReservaActivity.class);
        startActivity(i);
    }
}