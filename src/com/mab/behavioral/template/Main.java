package com.mab.behavioral.template;

public class Main {
    public static void main(String[] args) {
        Game chess = new Chess();
        chess.start();
        Game contractBridge = new Chess();
        contractBridge.start();
    }
}
