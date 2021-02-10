package com.mab.structural.adapter;

public class Main {

    public static void main(String[] args) {

        GermanPlugConnector plugConnector = new GermanPlug();

        UKSocket electricalSocket = new UKSocket();

        UKPlugConnector ukAdapter = new GermanToUKAdapter(plugConnector);

        electricalSocket.plugIn(ukAdapter);
    }

}
