package com.borymskyi.patterns.creational.adapter2;

public class AmericanSockerImpl implements AmericanSocket {
    @Override
    public void getPower() {
        System.out.println("get 110 volt");
    }
}
