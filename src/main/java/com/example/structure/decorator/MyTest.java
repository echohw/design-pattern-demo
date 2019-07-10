package com.example.structure.decorator;

/**
 * @ClassName MyTest.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月10日 23:31:00
 */
public class MyTest {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost()); // DarkRoast, Mocha, Whip $1.39

    }
}
