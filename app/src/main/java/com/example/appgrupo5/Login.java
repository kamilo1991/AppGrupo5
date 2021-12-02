package com.example.appgrupo5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button btn_registrar;
    Button btn_iniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_registrar=findViewById(R.id.btn_registrar);
        btn_iniciar=findViewById(R.id.btn_iniciar);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentreg= new Intent(Login.this, Registro.class);
                Login.this.startActivity(intentreg);
            }
        });
        btn_iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intemenu= new Intent(Login.this, Menu.class);
                Login.this.startActivity(intemenu);
            }
        });
    }
}