package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txt1;
    private EditText txt2;
    private TextView txt3;
    private RadioButton sum;
    private RadioButton res;
    private RadioButton mul;
    private RadioButton div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        sum = findViewById(R.id.sum);
        res = findViewById(R.id.res);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

    }

    public void limpiar(View view){
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt1.requestFocus();

    }

    public void calcular(View view){
        if (sum.isChecked()){
            Sumar();
        } else if (res.isChecked()) {
            Resta();
        } else if (mul.isChecked()) {
            Multi();
        } else if (div.isChecked()) {
            Divi();
        }

    }

    public void Sumar(){
        int v1 = Integer.parseInt(txt1.getText().toString());
        int v2 = Integer.parseInt(txt2.getText().toString());
        txt3.setText("Resultado: "+ String.valueOf(v1+v2));
    }
    public void Resta(){
        int v1 = Integer.parseInt(txt1.getText().toString());
        int v2 = Integer.parseInt(txt2.getText().toString());
        txt3.setText("Resultado: "+ String.valueOf(v1-v2));
    }
    public void Multi(){
        int v1 = Integer.parseInt(txt1.getText().toString());
        int v2 = Integer.parseInt(txt2.getText().toString());
        txt3.setText("Resultado: "+ String.valueOf(v1*v2));
    }
    public void Divi(){
        int v1 = Integer.parseInt(txt1.getText().toString());
        int v2 = Integer.parseInt(txt2.getText().toString());
        txt3.setText("Resultado: "+ String.valueOf(v1/v2));

    }

}