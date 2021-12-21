package br.com.imc.modelo;

import android.widget.EditText;

import br.com.imc.excption.InputNull;

public class TratamentoEntrada {

    private final String altura;
    private final String peso;

    public TratamentoEntrada(EditText altura,EditText peso){

        this.altura = altura.getText().toString();
        this.peso = peso.getText().toString();

    }
    public double getAltura() throws InputNull {
        if (this.altura.isEmpty()){
            throw new InputNull();
        }
        if (Double.parseDouble(this.altura) >= 100){
            return Double.parseDouble(this.altura.charAt(0)+"."+this.altura.substring(1));
        }else{
            return Double.parseDouble(this.altura);
        }

    }

    public double getPeso() throws InputNull {
        if (this.peso.isEmpty()){
            throw new InputNull();
        }else{
            return Double.parseDouble(this.peso);
        }
    }

}
