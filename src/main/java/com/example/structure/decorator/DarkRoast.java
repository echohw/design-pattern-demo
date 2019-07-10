package com.example.structure.decorator;

/**
 * @ClassName DarkRoast.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月11日 00:32:00
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        super.description = "DarkRoast";
    }

    public double cost() {
        return .99;
    }
}
