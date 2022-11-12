package com.borymskyi.patterns.structural.adapter2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class AdapterSocketEuroToAmerican implements EuroSockert {

    AmericanSocket americanSocket;

    public AdapterSocketEuroToAmerican(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
    }
}
