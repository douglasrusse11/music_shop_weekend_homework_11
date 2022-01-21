package instrument.woodwind;

public class CorAnglais extends WoodwindInstrument {

    public CorAnglais(String make, String model, String material, double purchasePrice, double salePrice, byte numberOfKeys) {
        super(make, model, material, purchasePrice, salePrice, numberOfKeys);
    }

    public String play() {
        return "I don't even know";
    }
}
