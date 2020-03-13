package com.example.substitusi_kriptografi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button enkripsi = findViewById(R.id.buttonHome_enkripsi);
        Button dekripsi = findViewById(R.id.buttonHome_dekripsi);

        enkripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, enkripsi.class);
                startActivity(intent);
            }
        });

        dekripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, dekripsi.class);
                startActivity(intent);
            }
        });
    }
}
