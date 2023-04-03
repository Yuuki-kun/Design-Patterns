/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.decorator.pizza;

/**
 *
 * @author tongcongminh
 */
public abstract class PizzaDecorator implements IPizza{
    protected IPizza mpizza;
    
    public PizzaDecorator(IPizza mPizza){
        this.mpizza = mPizza;
    }

    public IPizza getMpizza() {
        return mpizza;
    }

    public void setMpizza(IPizza mpizza) {
        this.mpizza = mpizza;
    }
    
}
