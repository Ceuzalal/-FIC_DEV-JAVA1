package com.projeto.geometria;
import java.util.Scanner;

public class Retangulo {
    //  Propriedades do retangulo
    private double base;
    private double altura;
    
    //  Construtor da classe
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    //  Metodo para calcular a area do retangulo
    public double calcularArea(){
        return this.base * this.altura;
    }
    
    //  Metodo para calcular o perimetro do retangulo
    public double calcularPerimetro(){
        return 2 * (this.base + this.altura);
    }
}
