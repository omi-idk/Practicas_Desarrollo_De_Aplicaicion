package com.example.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editNombre = findViewById(R.id.user_name);
        TextView txtSaludo = findViewById(R.id.txt_saludo);
        Button boton = findViewById(R.id.btn_saludar);

        boton.setOnClickListener(v->{
            String nombre = editNombre.getText().toString();
            String saludo = "Hola " + nombre.toUpperCase() + "! Bienvenido a DDA";
            txtSaludo.setText(saludo);
            txtSaludo.setTextColor(Color.WHITE);

        });

    }


}