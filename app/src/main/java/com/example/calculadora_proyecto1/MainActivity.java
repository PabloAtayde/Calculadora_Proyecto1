package com.example.calculadora_proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnp, btnsum, btnres, btnmul, btndiv,
            btnig, btnclr,btnborr,btnce;
    TextView label;
    String res, n1, n2, ide;
    Double doblee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}