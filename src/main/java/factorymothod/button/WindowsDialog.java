/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymothod.button;

/**
 *
 * @author tongcongminh
 */
public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsBtn();
    }
    
}
