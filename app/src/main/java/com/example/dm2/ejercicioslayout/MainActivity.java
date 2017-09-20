package com.example.dm2.ejercicioslayout;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button ejercicio1;
    private Button ejercicio2;
    private Button ejercicio3;
    private Button ejercicio4;
    private Button ejercicio5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ejercicio1=(Button)findViewById(R.id.Ejercicio1);

       ejercicio1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intento = new Intent(MainActivity.this,Ejercicio1.class);
               startActivity(intento);
           }
       });

        ejercicio2=(Button)findViewById(R.id.Ejercicio2);
        ejercicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this,Ejercicio2.class);
                startActivity(intento);
            }
        });

        ejercicio3=(Button)findViewById(R.id.Ejercicio3);
        ejercicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this,Ejercicio3.class);
                startActivity(intento);
            }
        });

        ejercicio4=(Button)findViewById(R.id.Ejercicio4);
        ejercicio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this,Ejercicio4.class);
                startActivity(intento);
            }
        });

        ejercicio5=(Button)findViewById(R.id.Ejercicio5);
        ejercicio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(MainActivity.this,Ejercicio5.class);
                startActivity(intento);
            }
        });




    }
}
