package org.ghizlane;

public class UniteCentre {
    private VGA vga;
    public void print(String message) {
        System.out.println("***************");
        vga.print(message);
        System.out.println("*****************");

    }
    public void setVGA(VGA vga) {
        this.vga = vga;
    }
}
