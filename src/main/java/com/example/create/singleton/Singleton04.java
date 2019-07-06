package com.example.create.singleton;

/**
 * @ClassName Singleton04.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 00:26:00
 */
public class Singleton04 {
    private static class SingletonHolder {
        private static final Singleton04 INSTANCE = new Singleton04();
    }

    private Singleton04() {
    }

    public static Singleton04 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
