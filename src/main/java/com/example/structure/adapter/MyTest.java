package com.example.structure.adapter;

/**
 * @ClassName MyTest.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月08日 17:01:00
 */
public class MyTest {
    public static void main(String[] args) {
        Iphone6Plus iphone6Plus = new Iphone6Plus();
        iphone6Plus.charge(new AppleCharger());
        Adapter adapter = new Adapter(new AndroidCharger());
        iphone6Plus.charge(adapter);
    }
}
