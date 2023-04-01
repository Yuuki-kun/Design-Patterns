/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymothod.button;

/**
 *
 * @author tongcongminh
 */
public class Application {
    
    private static Dialog dialog;
    
    public static void initialize(){
        //depends on our environment the application will choose the corresponding creator type
        //example
        String type="windows";
        if(type.equals("windows")){
            dialog = new WindowsDialog();
        }else if(type.equals("web")){
            dialog = new WebDialog();
        }
    }
    
    public static void main(String[] args) {
        initialize();
        dialog.render();
    }
}
