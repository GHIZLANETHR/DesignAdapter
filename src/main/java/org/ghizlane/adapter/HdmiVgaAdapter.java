package org.ghizlane.adapter;

import org.ghizlane.Hdmi;
import org.ghizlane.VGA;

public class HdmiVgaAdapter implements VGA {
    private Hdmi hdmi;
    @Override
    public void print(String message) {
        System.out.println("******* Adapter**********");
        byte[] data = message.getBytes();
        hdmi.view(data);
        System.out.println("******* Adapter**********");


    }
    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
