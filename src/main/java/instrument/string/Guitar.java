package instrument.string;

public class Guitar extends StringInstrument {
    public Guitar(String make, String model, String material, double purchasePrice, double salePrice, byte numberOfStrings) {
        super(make, model, material, purchasePrice, salePrice, numberOfStrings);
    }

    public String play() {
        return "No Stairway, denied";
    }
}
