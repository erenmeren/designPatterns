package com.mab.creational.factory.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory animalFactory = FactoryProvider.getFactory("Animal");
        Animal animal = (Animal) animalFactory.create("Duck");
        System.out.println("dudck.makeSound() = " + animal.makeSound());

    }
}
