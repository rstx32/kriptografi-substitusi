package com.example.substitusi_kriptografi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText plaintext, ciphertext;
    Button enkripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plaintext = findViewById(R.id.editText_plaintext);
        ciphertext = findViewById(R.id.editText_cipher);
        enkripsi = findViewById(R.id.button_enkripsi);
    }

    public void enkripsi(View view) {
        ciphertext.setText(plaintext.getText());
    }
}
