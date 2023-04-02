/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.adapter.roundsquare;

/**
 *
 * @author tongcongminh
 */
//this class will fit square pegs into round holes
//it extends the roudPeg to let the adapter object act as round pegs
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0);
        this.peg = peg;
    }

    public int getRadius() {
        // The adapter pretends that it's a round peg with a
        // radius that could fit the square peg that the adapter
        // actually wraps.
        
        //return radius = diameter of square * √2/2
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
