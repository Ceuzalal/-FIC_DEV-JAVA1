/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia7;

/**
 *
 * @author ficdev
 */
public class Gato extends Animal2{
    
    public Gato(int a, int p){
        super(a,p);
    }
    public void falar(){
        miar();
    }
    public void miar(){
        System.out.println("Miau!!");
    }
}
