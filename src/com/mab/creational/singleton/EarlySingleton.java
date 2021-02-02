package com.mab.creational.singleton;

public class EarlySingleton {

    private static EarlySingleton obj = new EarlySingleton();//Early, instance will be created at load time

    private EarlySingleton(){}

    public static EarlySingleton getEarlySingleton(){
        return obj;
    }
}
