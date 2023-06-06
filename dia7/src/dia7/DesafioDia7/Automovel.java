/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia7.DesafioDia7;
public class Automovel extends Transporte{
    String nome;
    boolean motor;
    
    //construtor
    public Automovel(int velocidade, String nome, boolean motor){
    super(velocidade);
    this.nome = nome;
    this.motor = motor;
    }
}
