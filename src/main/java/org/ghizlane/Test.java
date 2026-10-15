package org.ghizlane;

import org.ghizlane.adapter.HdmiVgaAdapter;
import org.ghizlane.adapter.HdmiVgaAdapterH;

public class Test {
    public static void main(String[] args) {
        UniteCentre uniteCentre = new UniteCentre();
        uniteCentre.setVGA(new Ecran());
        uniteCentre.print("Bonjour");
        uniteCentre.setVGA(new VideoProjecteur());
        uniteCentre.print("Bonjour");

        HdmiVgaAdapter adapter = new HdmiVgaAdapter();
        adapter.setHdmi(new TV());
        uniteCentre.setVGA(adapter);
        adapter.print("Bonjour GLSID ");

        HdmiVgaAdapterH adapterH = new HdmiVgaAdapterH();
        uniteCentre.setVGA(adapterH);
        adapterH.print("Test GLSID ");


        uniteCentre.setVGA(new SuperVP());
        uniteCentre.print("Hello World ");

        HdmiVgaAdapter adapter2 = new HdmiVgaAdapter();
        adapter2.setHdmi(new SuperVP());
        uniteCentre.setVGA(adapter2);
        uniteCentre.print("Bonsoir ");
    }


}
