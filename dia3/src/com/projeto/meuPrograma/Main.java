package com.projeto.meuPrograma;
import com.projeto.geometria.Retangulo;

public class Main {
    // Metodo principal do programa
    public static void main(String[] args){
        //  Criando um objeto da classe Retangulo com base 5 e altua 10
        Retangulo retangulo = new Retangulo(10, 10);
        
        //  Calculando a area e o perimetro do retangulo
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        
        //  Imprimindo os resultados na tela
        System.out.println("Area do retangulo: " + area);
        System.out.println("Perimetro do retangulo: " + perimetro);
    }
}
