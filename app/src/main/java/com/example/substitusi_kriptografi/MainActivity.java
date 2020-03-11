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
        // menggunakan tabel
        String alfabet  = "abcdefghijklmnopqrstuvwxyz";
        String key1     = "defghijklmnopqrstuvwxyzabc";
        String key2     = "ghijklmnopqrstuvwxyzabcdef";
        String plain    = plaintext.getText().toString();
        char[] tampung  = new char[plain.length()];

//        for(int i=0; i<plain.length(); i++){
//            for(int j=0; j<alfabet.length(); j++){
//                if(plain.charAt(i)==alfabet.charAt(j)){
//                    tampung[i] = key1.charAt(j);
//                    break;
//                }else if(plain.charAt(i)==' '){
//                    tampung[i] = ' ';
//                }
//            }
//        }

        // menggunakan ascii
        for(int i=0; i<plain.length(); i++){
            int x = (plain.charAt(i)-94)%26+97;
            int y = (x-92)%26+97;
            tampung[i] = (char)y;
        }

        String hasil = new String(tampung);

        ciphertext.setText(hasil+"");
    }
}
