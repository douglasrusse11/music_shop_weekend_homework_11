package instrument;

import behaviours.IPlay;
import behaviours.ISell;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public abstract class Instrument implements IPlay, ISell {
    private String make;
    private String model;
    private InstrumentType type;
    private String material;
    private double purchasePrice;
    private double salePrice;

    public Instrument(String make, String model, InstrumentType type, String material, double purchasePrice, double salePrice) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.material = material;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double calculateMarkup() {
        return salePrice - purchasePrice;
    }

    public abstract void play();

    public void playSound(String instrument) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    File f = new File("./soundExamples/" + instrument + ".wav");
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioIn);
                    clip.start();
                    while(clip.getMicrosecondLength() != clip.getMicrosecondPosition()) {
                        Thread.yield();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
