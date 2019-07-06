package com.example.create.singleton;

/**
 * @ClassName Singleton01.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 00:23:00
 */
public class Singleton01 {
    private static Singleton01 instance;

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        if (instance == null) {
            instance = new Singleton01();
        }
        return instance;
    }
}
