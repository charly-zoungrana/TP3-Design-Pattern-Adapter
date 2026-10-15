package net.zoungrana.adapter;

import net.zoungrana.computer.HDMI;
import net.zoungrana.computer.TV;
import net.zoungrana.computer.VGA;

public class VGAHDMIAdapterH extends TV implements VGA {


    @Override
    public void print(String message) {
        System.out.println("........................... Adapter .....................");
        byte[] data=message.getBytes();
        super.view(data);
        System.out.println("........................... Adapter .....................");
    }

}
