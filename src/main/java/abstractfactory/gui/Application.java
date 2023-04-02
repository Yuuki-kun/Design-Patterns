/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory.gui;

/**
 *
 * @author tongcongminh
 */
public class Application {
    private static GUIFactory factory;
    private static Button btn;
    
    public Application(GUIFactory factory){
        this.factory = factory;
    }
    
    public void createUI(){
        this.btn = factory.createButton();
    }
    
    public void display(){
        this.btn.display();
    }
}
