/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymothod.button;

/**
 *
 * @author tongcongminh
 */
public class HTMLBtn implements Button{

    @Override
    public void render() {
        //render here
        System.out.println("HTMLBtn rendered!");
    }

    @Override
    public void onClick(String strCommand) {
        //do what strCommand is
        System.out.println("HTMLBtn onclick="+strCommand);
    }
}
