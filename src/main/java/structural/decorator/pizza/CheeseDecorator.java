/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.decorator.pizza;

/**
 *
 * @author tongcongminh
 */
public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(IPizza mPizza) {
        super(mPizza);
    }

    @Override
    public String doPizza() {
        String type = mpizza.doPizza();
        return type + addCheese();
    }
    public String addCheese(){
        return "+ cheese!";
    }
}
