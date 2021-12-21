package br.com.imc.modelo;



public class Calculo {


    private final double saida;

    public Calculo(double altura, double peso){
        String valor = String.format("%.1f", peso / Math.pow(altura, 2));
        valor = valor.replace(',', '.');
        this.saida = Double.parseDouble(valor);
    }

    public String getValor(){
        if(this.saida < 18.5){
            return "IMC = "+this.saida+" Você está Abaixo do Peso";
        }if(this.saida >= 18.5 && this.saida <= 24.9){
            return "IMC = "+this.saida+" Você está com o peso Normal";
        }if(this.saida > 24.9 && this.saida <= 29.9){
            return "IMC = "+this.saida+" Você está com Sobrepeso";
        }if(this.saida > 29.9 && this.saida <= 34.9){
            return "IMC = "+this.saida+" Você está em Obesidade Grau 1";
        }if(this.saida > 34.9 && this.saida <= 39.9){
            return "IMC = "+this.saida+" Você está em Obesidade Grau 2";
        }else{
            return "IMC = "+this.saida+" Você está em Obesidade Mórbida";
        }

    }

}
