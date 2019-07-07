package com.example.create.prototype;

/**
 * @ClassName Prototype.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 20:41:00
 */
public interface Prototype<T> extends Cloneable {
    T clone();
}
