package com.example.structure.decorator;

/**
 * @ClassName Beverage.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月11日 00:29:00
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
