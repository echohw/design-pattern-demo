package com.example.create.prototype;

/**
 * @ClassName ConcretePrototype.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月07日 20:42:00
 */
public class ConcretePrototype implements Prototype<ConcretePrototype> {
    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
