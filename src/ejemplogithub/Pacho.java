/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplogithub;

/**
 *
 * @author perez
 */
public class Pacho {
    
    private int polas;
    public Pacho(int polas)
    {
        this.polas = polas;
    }
    
    public static void tomarPolas(int polas)
    {
        System.out.println("Tinti se toma " + polas + " diarias");
    }
    
    public static void main(String []args){
        tomarPolas(2);
    }
}
