/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia7;

/**
 *
 * @author ficdev
 */
public class Cachorro2 extends Animal2 {
    
    public Cachorro2(int a, int p){
        super(a,p);
      
    }
    public void falar(){
        latir();
    }
    private void latir(){
        System.out.println("AuAu!!");
    }
}
