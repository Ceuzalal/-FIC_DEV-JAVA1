/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia7.DesafioDia7;

/**
 *
 * @author ficdev
 */
public class Carroca extends Transporte{
    int rodas = 2;
    int animalPuxador = 1;
    
    public Carroca(int velocidade, int rodas, int animalPuxador){
        super(velocidade);
        this.rodas = rodas;
        this.animalPuxador = animalPuxador;
    }
}
