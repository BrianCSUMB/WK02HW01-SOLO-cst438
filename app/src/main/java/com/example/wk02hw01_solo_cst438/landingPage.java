package com.example.wk02hw01_solo_cst438;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class landingPage extends AppCompatActivity {
    private TextView welcome;
    private static String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        welcome = findViewById(R.id.welcome);

        welcome.setText("Welcome " + value);
    }

    public static Intent getIntent(Context context, String username) {
        Intent intent = new Intent(context, landingPage.class);
        intent.putExtra("Intent_extra_value", value);

        return intent;
    }
}