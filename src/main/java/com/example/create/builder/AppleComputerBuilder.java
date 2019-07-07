package com.example.create.builder;

/**
 * @ClassName AppleComputerBuilder.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 14:34:00
 */
public class AppleComputerBuilder implements Builder {
    private Computer computer = new Computer();

    @Override
    public void buildMainBoard() {
        computer.setMainBoard("组装主板");
    }

    @Override
    public void buildCpu() {
        computer.setCpu("组装CPU");
    }

    @Override
    public void buildHardDisk() {
        computer.setHardDisk("组装硬盘");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
