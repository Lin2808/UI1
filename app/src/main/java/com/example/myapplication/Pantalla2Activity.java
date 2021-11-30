package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pantalla2Activity extends AppCompatActivity {
    TextView msj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        //Localizar los controles
        TextView txtSaludo = (TextView)findViewById(R.id.txtSaludo);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje a mostrar
        txtSaludo.setText("Hola!, Bienvenido \n " + bundle.getString("NOMBRE") + "La fecha es \n" + bundle.getString ("FECHA"));
    }

}