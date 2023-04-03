/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.decorator.pizza;

/**
 *
 * @author tongcongminh
 */
public class PizzaShop {

    public static void main(String[] args) {
        IPizza tomatoPizza = new TomatoPizza();
        IPizza chickenPizza = new ChickenPizza();

        System.out.println(tomatoPizza.doPizza());
        System.out.println(chickenPizza.doPizza());

        System.out.println("Use Decorator Pattern to extend existing pizza dynamically");

        System.out.println("Add pepper to tomato pizza");
        PepperDecorator pepperDecorator = new PepperDecorator(tomatoPizza);
        System.out.println(pepperDecorator.doPizza());

        System.out.println("Add cheese to tomato pizza");
        CheeseDecorator cheeseDecorator = new CheeseDecorator(tomatoPizza);
        System.out.println(cheeseDecorator.doPizza());

        System.out.println("Add cheese and pepper to tomato pizza");
        CheeseDecorator cheeseDecorator2 = new CheeseDecorator(pepperDecorator);
        System.out.println(cheeseDecorator2.doPizza());
    }
}
