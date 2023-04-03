/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.decorator.pizza;

/**
 *
 * @author tongcongminh
 */
public class PepperDecorator extends PizzaDecorator{

    public PepperDecorator(IPizza mPizza) {
        super(mPizza);
    }
    
    @Override
    public String doPizza() {
        String type = mpizza.doPizza();
        return type + addPepper();
    }
    
    public String addPepper(){
        return "+ pepper!";
    }
}
