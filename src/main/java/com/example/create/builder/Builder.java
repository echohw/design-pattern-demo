package com.example.create.builder;

/**
 * @ClassName Builder.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 14:24:00
 */
public interface Builder {
    void buildMainBoard();

    void buildCpu();

    void buildHardDisk();

    Computer getComputer();
}
