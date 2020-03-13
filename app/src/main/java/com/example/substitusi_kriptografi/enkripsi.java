package com.example.substitusi_kriptografi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class enkripsi extends AppCompatActivity {
    EditText plaintext, ciphertext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enkripsi);
        plaintext = findViewById(R.id.enkripsi_editText_plain);
        ciphertext = findViewById(R.id.enkripsi_editText_cipher);
    }

    public void enkripsi_button(View view) {
//        ***MENGGUNAKAN ASCII***
//        int x, y;
//        String plain    = plaintext.getText().toString();
//        char[] tampung  = new char[plain.length()];
//
//        for(int i=0; i<plain.length(); i++){
//            x = plain.charAt(i)+3;
//            if(x>122)
//                x-=26;
//
//            y = (x-92)%26+97;
//            if(y>122)
//                y-=26;
//
//            if(plain.charAt(i)==' '){
//                tampung[i] = ' ';
//            }else{
//                tampung[i] = (char)y;
//            }
//        }
//        String hasil = new String(tampung);
//        ciphertext.setText(hasil+"");

//        ***MENGGUNAKAN TABEL***
        String plain = plaintext.getText().toString();
        char[] tampung = new char[plain.length()];

        String alfabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String key1 = "defghijklmnopqrstuvwxyzabcDEFGHIJKLMNOPQRSTUVWXYZABC";
        String key2 = "ijklmnopqrstuvwxyzabcdefghIJKLMNOPQRSTUVWXYZABCDEFGH";
        for (int i = 0; i < plain.length(); i++) {
            for (int j = 0; j < alfabet.length(); j++) {
                if (plain.charAt(i) == alfabet.charAt(j)) {
                    tampung[i] = key1.charAt(j);
                    tampung[i] = key2.charAt(j);
                    break;
                } else if (plain.charAt(i) == ' ') {
                    tampung[i] = ' ';
                }
            }
        }
        String hasil = new String(tampung);
        ciphertext.setText(hasil + "");
    }
}
