package com.mab.creational.factory.abstractFactory;

public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Hev hev";
    }
}
