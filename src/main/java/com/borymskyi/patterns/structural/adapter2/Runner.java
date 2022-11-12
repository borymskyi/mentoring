package com.borymskyi.patterns.structural.adapter2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Runner {
    public static void main(String[] args) {
        EuroSockert euroSockert = new AdapterSocketEuroToAmerican(new AmericanSockerImpl());

        Radio radio = new Radio();

        radio.listenMusic(euroSockert);
    }
}
