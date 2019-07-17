package com.example.structure.proxy;

/**
 * @ClassName RealSubject.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月17日 22:56:00
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("This is real doSomeThing");
    }
}
