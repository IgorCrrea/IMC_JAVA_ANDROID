package br.com.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.imc.R;

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
            Toast.makeText(TelaInicial.this, peso.getText().toString()+"-"+altura.getText().toString(), Toast.LENGTH_SHORT).show();
        });

    }
}