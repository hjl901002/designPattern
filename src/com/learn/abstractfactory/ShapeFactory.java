package com.learn.abstractfactory;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null){
            return null;
        }else if("Circle".equalsIgnoreCase(shapeType)){
            return new Circle();
        }else if("Square".equalsIgnoreCase(shapeType)){
            return new Square();
        }else if("Rectangle".equalsIgnoreCase(shapeType)){
            return new Rectangle();
        }
        return null;
    }
}
