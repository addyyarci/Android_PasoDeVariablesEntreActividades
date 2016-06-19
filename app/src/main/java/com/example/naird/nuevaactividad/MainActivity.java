package com.example.naird.nuevaactividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //comentando para git2

    //habilitar los elementos

    EditText editTextEnviar;
    Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEnviar = (EditText) findViewById(R.id.editTextEnviar);

        boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:

                String dato = editTextEnviar.getText().toString();

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("DATO", dato);
                startActivity(intent);
                    break;
        }
    }
}
