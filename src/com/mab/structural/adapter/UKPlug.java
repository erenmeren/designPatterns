package com.mab.structural.adapter;

public class UKPlug implements UKPlugConnector{
    @Override
    public void provideElectricity() {
        System.out.println("UK plug working");
    }
}
