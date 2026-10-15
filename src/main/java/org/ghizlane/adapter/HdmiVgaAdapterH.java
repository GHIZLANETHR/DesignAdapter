package org.ghizlane.adapter;

import org.ghizlane.Hdmi;
import org.ghizlane.TV;
import org.ghizlane.VGA;

public class HdmiVgaAdapterH extends TV implements VGA {
    @Override
    public void print(String message) {
        System.out.println("******* Adapter**********");
        byte[] data = message.getBytes();
        super.view(data);
        System.out.println("******* Adapter**********");


    }
}
