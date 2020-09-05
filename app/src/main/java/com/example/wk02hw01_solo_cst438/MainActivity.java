package com.example.wk02hw01_solo_cst438;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private Button login;

    private String Username = "din_djarin";
    private String Password = "baby_yoda_ftw";

    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.userName);
        password = findViewById(R.id.password);
        login = findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputName = name.getText().toString();
                String inputPassword = password.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty()) {
                    Toast.makeText(MainActivity.this, "One or more of the fields is blank", Toast.LENGTH_SHORT).show();
                } else {
                    isValid = validate(inputName, inputPassword);

                    if(!isValid) {
                        Toast.makeText(MainActivity.this, "Password or Username is incorrect", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent intent = landingPage.getIntent(getApplicationContext(), inputName);

                    }
                }
            }
        });
    }

    private Boolean validate(String name, String password) {
        if(name.equals(Username) && password.equals(Password)) {
            return true;
        } else {
            return false;
        }
    }
}