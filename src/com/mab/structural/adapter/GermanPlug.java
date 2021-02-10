package com.mab.structural.adapter;

public class GermanPlug implements GermanPlugConnector{
    @Override
    public void giveElectricity() {
        System.out.println("German plug working");
    }
}
