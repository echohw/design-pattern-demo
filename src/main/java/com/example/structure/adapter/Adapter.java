package com.example.structure.adapter;

/**
 * @ClassName Adapter.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月08日 17:00:00
 */
public class Adapter implements LightningInterface {
    private MicroUsbInterface microUsbInterface;

    public Adapter() {
    }

    public Adapter(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    @Override
    public void chargeWithLightning() {
        microUsbInterface.chargeWithMicroUsb();
    }

    public MicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }
}
