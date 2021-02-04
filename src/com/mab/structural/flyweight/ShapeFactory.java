package com.mab.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {

    private static HashMap<ShapeType, Shape> shapes = new HashMap();

    //use getShape method to get object of type shape
    public static Shape getShape(ShapeType shapeType){

        Shape shape = shapes.get(shapeType);

        if(shape == null) {
            if( shapeType.equals(ShapeType.CIRCLE) )
                shape = new Circle();
            else if( shapeType.equals(ShapeType.RECTANGLE) )
                shape = new Rectangle();
            else if( shapeType.equals(ShapeType.SQUARE) )
                shape = new Square();
            shapes.put(shapeType,shape);
        }


        return shape;
    }
}
