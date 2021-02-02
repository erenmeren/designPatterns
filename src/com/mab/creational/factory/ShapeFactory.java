package com.mab.creational.factory;

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(ShapeType shapeType){

        if(shapeType == null)
            return null;

        if( shapeType.equals(ShapeType.CIRCLE) )
            return new Circle();
        else if( shapeType.equals(ShapeType.RECTANGLE) )
            return new Rectangle();
        else if( shapeType.equals(ShapeType.SQUARE) )
            return new Square();

        return null;
    }
}
