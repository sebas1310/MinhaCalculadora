package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity {

    private EditText opr1;
    private EditText opr2;
    private Button soma;
    private Button sub;
    private Button mult;
    private Button div;

    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        opr1 = findViewById(R.id.opr1XML);
        opr2 = findViewById(R.id.opr2XML);
        soma = findViewById(R.id.sumaXML);
        sub = findViewById(R.id.restaXML);
        mult = findViewById(R.id.multXML);
        div = findViewById(R.id.divisionXML);
        result = findViewById(R.id.resultXML);
        View.OnClickListener handler = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result_int = 0;
                int botao = view.getId();
                if(opr1.getText().length()==0 || opr2.getText().length()==0){
                    Toast.makeText(calculator.this,"fill ",Toast.LENGTH_SHORT).show();
                }else {
                    int opr1_int = Integer.parseInt(opr1.getText().toString());
                    int opr2_int = Integer.parseInt(opr2.getText().toString());
                    System.out.println("opr1: "+opr1_int);
                    System.out.println("opr2: "+ opr2_int);
                    try {
                        if(botao == R.id.sumaXML){
                            result_int = opr1_int+opr2_int;
                        } else if (botao == R.id.restaXML) {
                            result_int = opr1_int-opr2_int;
                        }
                        else if (botao == R.id.multXML) {
                            result_int = opr1_int*opr2_int;
                        }
                        else {
                            result_int = opr1_int/opr2_int;
                        }
                        result.setText(Integer.toString(result_int));
                    }
                    catch (ArithmeticException e){
                        Toast.makeText(calculator.this,"Error ",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        };
        soma.setOnClickListener(handler);
        sub.setOnClickListener(handler);
        div.setOnClickListener(handler);
        mult.setOnClickListener(handler);

    }
}