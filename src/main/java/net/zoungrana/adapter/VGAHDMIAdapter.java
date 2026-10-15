package net.zoungrana.adapter;

import net.zoungrana.computer.HDMI;
import net.zoungrana.computer.VGA;

public class VGAHDMIAdapter implements VGA {

    private HDMI hdmi;

    @Override
    public void print(String message) {
        System.out.println("........................... Adapter .....................");
        byte[] data=message.getBytes();
        hdmi.view(data);
        System.out.println("........................... Adapter .....................");
    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
