package br.com.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.imc.excption.InputNull;
import br.com.imc.modelo.Calculo;
import br.com.imc.modelo.TratamentoEntrada;


public class TelaInicial extends AppCompatActivity {

    private EditText altura;
    private EditText peso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        altura = findViewById(R.id.insert_altura);
        peso = findViewById(R.id.insert_peso);

        Button calcular = findViewById(R.id.calcular);

        calcular.setOnClickListener((View view) -> {

            TratamentoEntrada tratar = new TratamentoEntrada(altura,peso);

            try{
                double valorAltura = tratar.getAltura();
                double valorPeso = tratar.getPeso();

                Calculo calc = new Calculo(valorAltura,valorPeso);

                Toast.makeText(TelaInicial.this, calc.getValor(), Toast.LENGTH_LONG).show();
            }catch (InputNull ex){
                Toast.makeText(TelaInicial.this,"Valor Vazio", Toast.LENGTH_LONG).show();
            }
        });

    }
}