package com.example.sumaymultiplicaciondenumeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaraciones
    TextView tvResult;
    EditText caja1;
    EditText caja2;
    String mensaje = "";
    double n1, n2,suma;
    double acum = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //extraccion de datos por medio de Id
        caja1 = findViewById(R.id.n1);
        caja2 = findViewById(R.id.n2);
        tvResult = findViewById(R.id.tvResult);


    }

    public void sumar(View view) {

        if (caja1.getText().toString().isEmpty() || caja2.getText().toString().isEmpty()) {
            mensaje = "Completar los campo";
            tvResult.setText(mensaje);
        } else {
            n1=Double.parseDouble(caja1.getText().toString());
            n2=Double.parseDouble(caja2.getText().toString());
            for (double i = n1; i <= n2; i++) {
                if (i % 5 == 0) {
                    suma = suma + i;

                }
            }
            tvResult.setText("EL SUMATORIA DE LOS MULTIPLOS DE 5 ES : " + suma);
            borrar();


        }
    }

    public void multiplicar(View view) {
        if (caja1.getText().toString().isEmpty() || caja2.getText().toString().isEmpty()) {
            mensaje = "Completar los campo";
            tvResult.setText(mensaje);
        } else {
            n1=Double.parseDouble(caja1.getText().toString());
            n2=Double.parseDouble(caja2.getText().toString());

            for (double i = n1; i <= n2; i++) {
                if (i % 7 == 0) {
                    acum = acum * i;
                }

            }
            tvResult.setText("EL PRODUCTO DE LOS MULTIPLOS DE 7 ES : " + acum);
            borrar();


        }
    }
    public void eliminar(View view){
        tvResult.setText("");
        caja1.setText("");
        caja2.setText("");
    }
    void borrar(){
        acum=1;
        suma=0;
    }

}


