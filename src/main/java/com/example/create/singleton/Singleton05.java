package com.example.create.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @ClassName Singleton05.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 00:27:00
 */
public class Singleton05 implements Serializable {
    private static Singleton05 instance = new Singleton05();

    private Singleton05() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    public static Singleton05 getInstance() {
        return instance;
    }

    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
