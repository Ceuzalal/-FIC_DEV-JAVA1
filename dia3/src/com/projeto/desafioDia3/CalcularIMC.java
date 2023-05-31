package com.projeto.desafioDia3;

public class CalcularIMC {
    //Scanner input = new Scanner(System.in);
    
    private double altura;
    private double peso;
    
    public void imc(double altura, double peso){
        this.altura = altura;
        this.peso = peso;
    }
    public double calculo(){
        return this.peso/(this.altura*this.altura);
    }
}
