package com.example.create.prototype;

/**
 * @ClassName MyTest.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 20:42:00
 */
public class MyTest {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        ConcretePrototype clonedPrototype = prototype.clone();
        System.out.println(prototype == clonedPrototype);
    }
}
