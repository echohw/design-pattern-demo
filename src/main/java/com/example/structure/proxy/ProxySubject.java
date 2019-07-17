package com.example.structure.proxy;

/**
 * @ClassName ProxySubject.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月17日 22:56:00
 */
public class ProxySubject implements Subject {
    private Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void doSomething() {
        realSubject.doSomething();
    }
}
