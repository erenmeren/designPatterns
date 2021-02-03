package com.mab.creational.builder;

public class Main {

    public static void main(String[] args) {
        UserDto user = UserDto.builder()
                .id("1")
                .name("eren")
                .surname("meren")
                .build();
    }

}
