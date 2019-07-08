package com.example.structure.adapter;

/**
 * @ClassName AndroidCharger.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月08日 16:58:00
 */
public class AndroidCharger implements MicroUsbInterface {
    @Override
    public void chargeWithMicroUsb() {
        System.out.println("使用MicroUsb接口的充电器充电...");
    }
}
