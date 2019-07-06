package com.example.create.singleton;

/**
 * @ClassName Singleton03.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 00:25:00
 */
public class Singleton03 {
    private volatile static Singleton03 instance;

    private Singleton03() {
    }

    public static Singleton03 getInstance() {
        if (instance == null) {
            synchronized (Singleton03.class) {
                if (instance == null) {
                    instance = new Singleton03();
                }
            }
        }
        return instance;
    }
}
