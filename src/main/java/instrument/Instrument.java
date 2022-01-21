package instrument;

import behaviours.IPlay;
import behaviours.ISell;

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

    public abstract String play();
}
