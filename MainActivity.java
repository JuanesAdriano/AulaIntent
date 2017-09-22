package com.example.ifgoiano.intentaula;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btExplicita = (Button) findViewById(R.id.button);
        btExplicita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(it);
            }
        });
        Button btImplicita = (Button) findViewById(R.id.button2);
        btImplicita.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.youtube.com");
                Intent it = new Intent(Intent.ACTION_VIEW, url);
               if(it.resolveActivity(getPackageManager()) != null){
                startActivity(it);
               }
            }
        });
        Button btLigacao = (Button) findViewById(R.id.button3);
        btLigacao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Uri tel = Uri.parse("tel:64992830358");
                Intent it = new Intent(Intent.ACTION_CALL, tel);
                if(it.resolveActivity(getPackageManager()) != null){
                    startActivity(it);
                }
            }
        });
    }
}
