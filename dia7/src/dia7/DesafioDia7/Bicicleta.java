/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia7.DesafioDia7;

/**
 *
 * @author ficdev
 */
public class Bicicleta extends Automovel{
    int rodas = 2;
    
    public Bicicleta(int velocidade, String nome, boolean motor, int rodas){
        super(velocidade, nome, motor);
        this.rodas = rodas;
    }
}
