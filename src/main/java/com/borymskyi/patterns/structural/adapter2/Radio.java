package com.borymskyi.patterns.structural.adapter2;

/**
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Radio {
    public void listenMusic(EuroSockert euroSockert) {
        euroSockert.getPower();
    }
}
