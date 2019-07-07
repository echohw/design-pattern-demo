package com.example.create.builder;

/**
 * @ClassName Director.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 14:32:00
 */
public class Director {
    public void construct(Builder builder) {
        builder.buildMainBoard();
        builder.buildCpu();
        builder.buildHardDisk();
    }
}
