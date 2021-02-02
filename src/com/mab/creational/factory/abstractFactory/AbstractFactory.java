package com.mab.creational.factory.abstractFactory;

public interface AbstractFactory<T> {
    T create(String type) ;
}
