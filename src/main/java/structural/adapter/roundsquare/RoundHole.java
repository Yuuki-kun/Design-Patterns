/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.adapter.roundsquare;

/**
 *
 * @author tongcongminh
 */
public class RoundHole {

    private int radius;
    
    public RoundHole(int radius) {
        this.radius = radius;
    }
    public int getRadius(){
        return this.radius;
    }
    public boolean fits(RoundPeg peg){
        return this.radius >= peg.getRadius();
    }
}
