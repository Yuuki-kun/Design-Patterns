/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package behavioral.strategy.example;

/**
 *
 * @author tongcongminh
 */
public class Context {
     // The context maintains a reference to one of the strategy
    // objects. The context doesn't know the concrete class of a
    // strategy. It should work with all strategies via the
    // strategy interface.
    private Strategy strategy;
    
     // Usually the context accepts a strategy through the
    // constructor, and also provides a setter so that the
    // strategy can be switched at runtime.
    public void setStrategy(Strategy s){
        this.strategy=s;
    }
    
     // Usually the context accepts a strategy through the
    // constructor, and also provides a setter so that the
    // strategy can be switched at runtime.
    
    public int executeStrategy(int a, int b){
        return strategy.execute(a, b);
    }
    
}
