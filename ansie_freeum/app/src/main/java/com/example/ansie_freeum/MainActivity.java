package com.example.ansie_freeum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAcessar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAcessar = findViewById(R.id.btnAcessar);
        btnAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acessarApp = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(acessarApp);
            }
        });
    }

}



