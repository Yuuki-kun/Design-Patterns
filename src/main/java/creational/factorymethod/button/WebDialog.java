/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creational.factorymethod.button;

/**
 *
 * @author tongcongminh
 */
public class WebDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HTMLBtn();
    }
    
}
