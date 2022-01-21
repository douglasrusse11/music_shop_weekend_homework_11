package accessory;

import behaviours.ISell;

public class Accessory implements ISell {
    private String type;
    private double purchasePrice;
    private double salePrice;

    public Accessory(String type, double purchasePrice, double salePrice) {
        this.type = type;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }

    public String getType() {
        return type;
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
}
