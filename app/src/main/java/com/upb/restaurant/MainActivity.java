package com.upb.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
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
        i =  new Intent(this, MapsActivity.class);
        startActivity(i);
    }

    public void abrirPedido(View v){
        Intent i;
        i =  new Intent(this, PedidoActivity.class);
        startActivity(i);
    }
    public void abrirReserva(View v){
        String whatsApp = "com.whatsapp";
        PackageManager pm = getPackageManager();
        Intent i = pm.getLaunchIntentForPackage(whatsApp);
        startActivity(i);
    }
}