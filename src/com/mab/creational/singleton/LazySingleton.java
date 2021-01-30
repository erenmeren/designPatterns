package com.mab.creational.singleton;

public class LazySingleton {

    private static LazySingleton obj;
    private LazySingleton(){}

    public static LazySingleton getLazySingleton(){
        if (obj == null){
            synchronized(LazySingleton.class){
                if (obj == null){
                    obj = new LazySingleton();//instance will be created at request time
                }
            }
        }
        return obj;
    }

}
