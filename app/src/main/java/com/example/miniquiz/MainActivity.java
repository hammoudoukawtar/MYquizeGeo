package com.example.miniquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvRegister;
    private Button button;
    private EditText login;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (EditText) findViewById(R.id.Login);       //R c'est une class predéfinit qui contion les id !
        password = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.button);
        tvRegister = (TextView) findViewById(R.id.tvRegister);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login.getText().toString().equals("kawtar") && password.getText().toString().equals("kawtar")) {
                    startActivity(new Intent(MainActivity.this, quiz1.class));
                } else {
                    Toast.makeText(getApplicationContext(), "Login or Password incorrect ! ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Login.class));
            }
        });

    }
}

