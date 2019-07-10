package com.example.structure.decorator;

/**
 * @ClassName Whip.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月11日 00:36:00
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
