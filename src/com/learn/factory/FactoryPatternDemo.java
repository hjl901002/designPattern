package com.learn.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {

        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();

        Shape rectangle = ShapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape square = ShapeFactory.getShape("Square");
        square.draw();
    }
}
