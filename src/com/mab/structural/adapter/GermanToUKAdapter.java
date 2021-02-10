package com.mab.structural.adapter;

public class GermanToUKAdapter implements UKPlugConnector{

    private GermanPlugConnector plug;

    public GermanToUKAdapter(GermanPlugConnector plug) {
        this.plug = plug;
    }

    @Override
    public void provideElectricity() {
        plug.giveElectricity();
    }

}
