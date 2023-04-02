/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factorymethod.button;

/**
 *
 * @author tongcongminh
 */
public abstract class Dialog {
    public void render(){
        //call the factory method to create a product object
        Button btn = createButton();
        //now use the product
        btn.onClick("close");
        btn.render();
    }
    public abstract Button createButton();
}
