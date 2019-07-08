package com.example.behavior.template_method;

/**
 * @ClassName AbstractParentClass.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月08日 00:58:00
 */
public abstract class AbstractParentClass {
    public final void skeleton() {
        concreteMethod();
        hookMethod();
        abstractMethod();
        // ...
    }

    private void concreteMethod() {
        System.out.println("concreteMethod");
    }

    protected void hookMethod() {
        System.out.println("hookMethod");
    }

    protected abstract void abstractMethod();
}
