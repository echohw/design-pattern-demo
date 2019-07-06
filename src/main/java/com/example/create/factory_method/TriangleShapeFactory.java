package com.example.create.factory_method;

/**
 * @ClassName TriangleShapeFactory.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月03日 13:16:00
 */
public class TriangleShapeFactory implements ShapeFactory {
    @Override
    public Shape getShape() {
        return new TriangleShape();
    }
}
