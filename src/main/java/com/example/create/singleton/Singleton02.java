package com.example.create.singleton;

/**
 * @ClassName Singleton02.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 00:24:00
 */
public class Singleton02 {
    private static Singleton02 instance;

    private Singleton02() {
    }

    private static synchronized Singleton02 getInstance() {
        if (instance == null) {
            instance = new Singleton02();
        }
        return instance;
    }
}
