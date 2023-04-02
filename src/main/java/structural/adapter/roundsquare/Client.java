/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.adapter.roundsquare;

/**
 *
 * @author tongcongminh
 */
public class Client {

    public static void main(String[] args) {
        RoundHole rh = new RoundHole(5);
        RoundPeg rp = new RoundPeg(5);
        boolean canFit = rh.fits(rp);
        System.out.println("Round hole can fit round peg?: " + canFit);

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
//        System.out.println("This won't compile (imcompatible type): "+rh.fits(smallSquarePeg));

        SquarePegAdapter sSquare = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter lSquare = new SquarePegAdapter(largeSquarePeg);

        System.out.println("round hole (5) can fit small square peg (5)?: " + rh.fits(sSquare));
        System.out.println("round hole (5) can fit large square peg (10)?: " + rh.fits(lSquare));

    }
}
