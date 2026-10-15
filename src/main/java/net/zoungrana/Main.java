package net.zoungrana;


import net.zoungrana.adapter.VGAHDMIAdapter;
import net.zoungrana.computer.*;

public class Main {
    public static void main(String[] args) {
        UniteCentrale uc=new UniteCentrale();
        uc.setVga(new Ecran());
        uc.print("Bonjour");

        uc.setVga(new VideoProjecteur());
        uc.print("Bonjour");

        VGAHDMIAdapter adapter=new VGAHDMIAdapter();
        adapter.setHdmi(new TV());

        uc.setVga(adapter);
        uc.print("Bonjour");

        uc.setVga(new SuperVP());
        uc.print("Bonjour");

        VGAHDMIAdapter adapter1=new VGAHDMIAdapter();
        adapter1.setHdmi(new SuperVP());
        uc.setVga(adapter1);
        uc.print("Bonjour");
    }
}