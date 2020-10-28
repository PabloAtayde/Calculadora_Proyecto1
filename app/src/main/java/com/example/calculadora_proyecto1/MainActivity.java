package com.example.calculadora_proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
        btnp = findViewById(R.id.punto);
        btnp.setOnClickListener(nums);

        btnsum = findViewById(R.id.mas);
        btnsum.setOnClickListener(funciones);

        btnres = findViewById(R.id.menos);
        btnres.setOnClickListener(funciones);

        btndiv = findViewById(R.id.entre);
        btndiv.setOnClickListener(funciones);

        btnmul = findViewById(R.id.por);
        btnmul.setOnClickListener(funciones);

        btnclr = findViewById(R.id.clear);
        btnclr.setOnClickListener(funciones);

        btnborr = findViewById(R.id.borr);
        btnborr.setOnClickListener(funciones);

        btnce = findViewById(R.id.ce);
        btnce.setOnClickListener(funciones);

        btnig = findViewById(R.id.igual);
        btnig.setOnClickListener(Operaciones);



        btn1 = findViewById(R.id.uno);
        btn1.setOnClickListener(nums);

        btn2 = findViewById(R.id.dos);
        btn2.setOnClickListener(nums);

        btn3 = findViewById(R.id.tres);
        btn3.setOnClickListener(nums);

        btn4 = findViewById(R.id.cuatro);
        btn4.setOnClickListener(nums);

        btn5 = findViewById(R.id.cinco);
        btn5.setOnClickListener(nums);

        btn6 = findViewById(R.id.seis);
        btn6.setOnClickListener(nums);

        btn7 = findViewById(R.id.siete);
        btn7.setOnClickListener(nums);

        btn8 = findViewById(R.id.ocho);
        btn8.setOnClickListener(nums);

        btn9 = findViewById(R.id.nueve);
        btn9.setOnClickListener(nums);

        btn0 = findViewById(R.id.cero);
        btn0.setOnClickListener(nums);



        label = (TextView) findViewById(R.id.resultado);
    }


    View.OnClickListener funciones = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button operacion = (Button) v;
            ide  = operacion.getText().toString();
            res = label.getText().toString();
            n1 = res;
            String texto = operacion.getText().toString();
            switch (v.getId()) {
                case R.id.mas:
                    label.setText("");
                    break;
                case R.id.menos:
                    label.setText("");
                    break;
                case R.id.entre:
                    label.setText("");
                    break;
                case R.id.por:
                    label.setText("");
                    break;
                case R.id.clear:
                    label.setText("");
                    break;
                case R.id.borr:
                    label.setText("");
                    break;
                case R.id.ce:
                    label.setText("");
                    break;
            };
        }
    };

    View.OnClickListener Operaciones = new View.OnClickListener() {
        @Override
        public void onClick(View vh) {
            Button operacion = (Button) vh;
            String texto = operacion.getText().toString();
            n2 = label.getText().toString();
            doblee = Double.parseDouble(n1) + Double.parseDouble(n2);

            switch (ide) {
                //Entre
                case "/":
                    doblee = Double.parseDouble(n1) / Double.parseDouble(n2);
                    label.setText(doblee.toString());
                    break;
                //Por
                case "*":
                    doblee = Double.parseDouble(n1) * Double.parseDouble(n2);
                    label.setText(doblee.toString());
                    break;
                //Menos
                case "-":
                    doblee = Double.parseDouble(n1) - Double.parseDouble(n2);
                    label.setText(doblee.toString());
                    break;
                //Mas
                case "+":
                    doblee = Double.parseDouble(n1) + Double.parseDouble(n2);
                    label.setText(doblee.toString());
                    break;

            };
        }
    };

    View.OnClickListener nums = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button nums = (Button)v;
            String texto = nums.getText().toString();
            res = label.getText().toString();
            if (label.getText().toString() == "0" && texto == "0"){
                label.setText("0");
            }
            else {
                res = res + texto;
                label.setText(res);
            }
        }
    };
}
