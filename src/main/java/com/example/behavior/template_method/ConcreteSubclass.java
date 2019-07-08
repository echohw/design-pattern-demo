package com.example.behavior.template_method;

/**
 * @ClassName ConcreteSubclass.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月08日 01:00:00
 */
public class ConcreteSubclass extends AbstractParentClass {
    @Override
    protected void abstractMethod() {
        System.out.println("Subclass#abstractMethod");
    }
}
