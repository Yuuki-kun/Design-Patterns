/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.strategy.example;

/**
 *
 * @author tongcongminh
 */
public class Application {
    public static void main(String[] args) {
        
        Context c = new Context();
        
        String action = "add";
        if(action=="add"){
            c.setStrategy(new ConcreteStrategyAdd());
        }else if(action=="subs"){
            c.setStrategy(new ConcreteStrategySubtract());
        }else if(action=="multi"){
            c.setStrategy(new ConcreteStrategyMultiply());
        }
        int result = c.executeStrategy(2, 3);
        System.out.println("result = "+result);
    }
}
