package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button calcBtc;
    private Button webBtc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcBtc = findViewById(R.id.calcXML);
        webBtc = findViewById(R.id.webXML);

        calcBtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calcIntent = new Intent(MainActivity.this, calculadora.class);
                startActivity(calcIntent);
            }
        });

        webBtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ft.unicamp.br"));
                startActivity(webIntent);
            }
        });
    }

}