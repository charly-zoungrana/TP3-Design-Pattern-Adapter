package net.zoungrana;


import net.zoungrana.computer.Ecran;
import net.zoungrana.computer.UniteCentrale;
import net.zoungrana.computer.VideoProjecteur;

public class Main {
    public static void main(String[] args) {
        UniteCentrale uc=new UniteCentrale();
        uc.setVga(new Ecran());
        uc.print("Bonjour");

        uc.setVga(new VideoProjecteur());
        uc.print("Bonjour");
    }
}