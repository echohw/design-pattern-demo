package com.example.create.simple_factory;

/**
 * @ClassName ShapeFactory.java
 * @Author echohw
 * @Version 1.0.0
 * @CreateTime 2019年07月04日 11:06:00
 */
public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        Shape shape = null;
        if ("CIRCLE".equalsIgnoreCase(shapeType)) {
            shape = new CircleShape();
        } else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            shape = new RectangleShape();
        } else if ("TRIANGLE".equalsIgnoreCase(shapeType)) {
            shape = new TriangleShape();
        }
        return shape;
    }

    public static Shape getShape(Class<? extends Shape> clazz) {
        Shape shape = null;
        try {
            shape = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return shape;
    }
}