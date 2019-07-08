package com.example.structure.adapter;

/**
 * @ClassName AppleCharger.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月08日 16:59:00
 */
public class AppleCharger implements LightningInterface {
    @Override
    public void chargeWithLightning() {
        System.out.println("使用Lightning接口的充电器充电...");
    }
}
