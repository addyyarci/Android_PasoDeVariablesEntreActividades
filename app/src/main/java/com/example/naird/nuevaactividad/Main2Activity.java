package com.example.naird.nuevaactividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        texto = (TextView) findViewById(R.id.textoAct2);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras!=null){
            String dato = extras.getString("DATO");
            texto.setText(dato);
        }
    }
}
