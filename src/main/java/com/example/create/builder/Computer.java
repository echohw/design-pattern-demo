package com.example.create.builder;

/**
 * @ClassName Computer.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 14:21:00
 */
public class Computer {
    private Object mainBoard;
    private Object cpu;
    private Object hardDisk;
    // ...

    public Object getMainBoard() {
        return mainBoard;
    }

    public Computer setMainBoard(Object mainBoard) {
        this.mainBoard = mainBoard;
        return this;
    }

    public Object getCpu() {
        return cpu;
    }

    public Computer setCpu(Object cpu) {
        this.cpu = cpu;
        return this;
    }

    public Object getHardDisk() {
        return hardDisk;
    }

    public Computer setHardDisk(Object hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }
}
