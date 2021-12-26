package br.com.imc.modelo;

public class Calculo {


    private final double imc;
    private final double pesoMax;
    private final double pesoMin;


    public Calculo(double altura, double peso){
        double alturaQuadrado = Math.pow(altura,2);
        this.pesoMin = formatar(18.5 * alturaQuadrado) - 0.1;
        this.pesoMax = formatar(24.9 * alturaQuadrado) + 0.1;
        this.imc = formatar(peso / alturaQuadrado);
    }

    public String getValor(){
        if(this.imc < 18.5){
            return "IMC = "+this.imc +" Você está Abaixo do Peso.\nSeu peso ideal é " + pesoMin + " até " + pesoMax;
        }if(this.imc >= 18.5 && this.imc <= 24.9){
            return "IMC = "+this.imc +" Você está com o peso Normal.\nSeu peso ideal é " + pesoMin + " até " + pesoMax;
        }if(this.imc > 24.9 && this.imc <= 29.9){
            return "IMC = "+this.imc +" Você está com Sobrepeso.\nSeu peso ideal é " + pesoMin + " até " + pesoMax;
        }if(this.imc > 29.9 && this.imc <= 34.9){
            return "IMC = "+this.imc +" Você está em Obesidade Grau 1.\nSeu peso ideal é " + pesoMin + " até " + pesoMax;
        }if(this.imc > 34.9 && this.imc <= 39.9){
            return "IMC = "+this.imc +" Você está em Obesidade Grau 2.\nSeu peso ideal é " + pesoMin + " até " + pesoMax;
        }else{
            return "IMC = "+this.imc +" Você está em Obesidade Mórbida.\nSeu peso ideal é " + pesoMin + " até " + pesoMax;
        }

    }

    private double formatar(double resultado){
        String valor = String.format("%.1f", resultado);
        valor = valor.replace(',', '.');
        return Double.parseDouble(valor);
    }

}
