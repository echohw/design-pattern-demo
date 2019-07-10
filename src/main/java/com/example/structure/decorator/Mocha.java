package com.example.structure.decorator;

/**
 * @ClassName Mocha.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月11日 00:31:00
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
