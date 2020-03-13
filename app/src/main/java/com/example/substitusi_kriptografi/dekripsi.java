package com.example.substitusi_kriptografi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class dekripsi extends AppCompatActivity {

    EditText plaintext, ciphertext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dekripsi);
        plaintext = findViewById(R.id.dekripsi_editText_plain);
        ciphertext = findViewById(R.id.dekripsi_editText_cipher);
    }

    public void dekripsi_button(View view) {
        int x,y;
        String cipher = ciphertext.getText().toString();
        char[] tampung = new char[ciphertext.length()];

        for(int i=0; i<ciphertext.length(); i++){
            x = cipher.charAt(i)-5;
            if(x<97)
                x+=26;

            y = x-3;
            if(y<97)
                y+=26;

            if(cipher.charAt(i)==' '){
                tampung[i] = ' ';
            }else{
                tampung[i] = (char)y;
            }
        }
        String hasil = new String(tampung);
        plaintext.setText(hasil+"");
    }
}
