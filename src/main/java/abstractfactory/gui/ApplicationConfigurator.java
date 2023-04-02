/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory.gui;

/**
 *
 * @author tongcongminh
 */
public class ApplicationConfigurator {
    //depending on the current configuration or environment settings and creates it
    //at runtime (usually at the initialization stage).
    
    private static GUIFactory factory;
    
    public static void main(String[] args) throws Exception {
        //assuming that the environment is MacOS
        String config = "Mac";
        if(config.equals("Mac")){
            factory = new MacFactory();
        }else if(config.equals("Windows")){
            factory = new WindowsFactory();
        }
        else
            throw new Exception("Error! Unknown OS.");
//        .....

        //pass <<I>> GUIFactory 
        Application app = new Application(factory);
        app.createUI();
        app.display();
    }
    
}
