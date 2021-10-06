package com.learn.factory;

public class ShapeFactory {

    //使用getShape方法获取形状类型的对象
    public static Shape getShape(String className){
        if (className == null){
            return null;
        }else if("Circle".equalsIgnoreCase(className)){
            return new Circle();
        }else if("Square".equalsIgnoreCase(className)){
            return new Square();
        }else if("Rectangle".equalsIgnoreCase(className)){
            return new Rectangle();
        }
        return null;
    }
}
