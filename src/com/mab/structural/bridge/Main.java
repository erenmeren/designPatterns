package com.mab.structural.bridge;

public class Main {

    public static void main(String[] args) {
        Shape square = new Square(new Pink());
        System.out.println(square.draw());
    }

}
