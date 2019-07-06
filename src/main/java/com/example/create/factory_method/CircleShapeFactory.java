package com.example.create.factory_method;

/**
 * @ClassName CircleShapeFactory.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月03日 11:53:00
 */
public class CircleShapeFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new CircleShape();
    }
}
