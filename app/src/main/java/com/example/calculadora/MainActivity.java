package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    double val1 = 0;
    double val2 = 0;
    double resultado = 0;
    boolean sumar = false;
    boolean restar = false;
    boolean multiplicar = false;
    boolean dividir = false;

    Thread hilo = new Thread();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.txt_resultado);
    }

    public void uno(View view) {
        result.append("1");
    }

    public void dos(View view) {
        result.append("2");
    }

    public void tres(View view) {
        result.append("3");
    }

    public void cuatro(View view) {
        result.append("4");
    }

    public void cinco(View view) {
        result.append("5");
    }

    public void seis(View view) {
        result.append("6");
    }

    public void siete(View view) {
        result.append("7");
    }

    public void ocho(View view) {
        result.append("8");
    }

    public void nueve(View view) {
        result.append("9");
    }

    public void cero(View view) {
        result.append("0");
    }

    public void mas(View view) {
        val1 = Double.parseDouble(result.getText().toString());
        result.setText("");
        sumar = true;

    }

    public void menos(View view) {
        val1 = Double.parseDouble(result.getText().toString());
        result.setText("");
        restar = true;
    }

    public void por(View view) {
        val1 = Double.parseDouble(result.getText().toString());
        result.setText("");
        multiplicar = true;
    }

    public void entre(View view) {
        val1 = Double.parseDouble(result.getText().toString());
        result.setText("");
        dividir = true;
    }

    public void reset(View view) {
        result.setText("");
        val1 = 0;
        val2 = 0;
        resultado = 0;
        sumar = false;
        restar = false;
        multiplicar = false;
        dividir = false;
    }

    public void igual(View view) {
        val2 = Double.parseDouble(result.getText().toString());
        if ( sumar ) {
            resultado = val1 + val2;
        } else if ( restar ) {
            resultado = val1 - val2;
        } else if ( multiplicar ) {
            resultado = val1 * val2;
        } else if ( dividir ) {
            resultado = val1 / val2;
        }

        result.setText("" + resultado);
    }





}
