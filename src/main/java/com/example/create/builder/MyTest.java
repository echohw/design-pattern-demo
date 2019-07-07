package com.example.create.builder;

/**
 * @ClassName MyTest.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 14:44:00
 */
public class MyTest {
    public static void main(String[] args) {
        Director director = new Director();
        Builder appleComputerBuilder = new AppleComputerBuilder();
        director.construct(appleComputerBuilder);
        Computer computer = appleComputerBuilder.getComputer();
    }
}
