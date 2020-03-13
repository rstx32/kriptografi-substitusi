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
        int x, y;
        String plain    = plaintext.getText().toString();
        char[] tampung  = new char[plain.length()];

        // menggunakan ascii
        for(int i=0; i<plain.length(); i++){
            x = plain.charAt(i)+3;
            if(x>122)
                x-=26;

            y = (x-92)%26+97;
            if(y>122)
                y-=26;

            if(plain.charAt(i)==' '){
                tampung[i] = ' ';
            }else{
                tampung[i] = (char)y;
            }
        }
        String hasil = new String(tampung);
        ciphertext.setText(hasil+"");
    }
}
