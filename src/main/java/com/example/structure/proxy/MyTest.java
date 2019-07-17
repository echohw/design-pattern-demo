package com.example.structure.proxy;

/**
 * @ClassName MyTest.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月14日 01:49:00
 */
public class MyTest {

    public static void main(String[] args) throws Exception {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.doSomething();
    }
}
