package instrument.percussion;

public class Piano extends PercussionInstrument {
    public Piano(String make, String model, String material, double purchasePrice, double salePrice, byte numberOfPercussiveElements) {
        super(make, model, material, purchasePrice, salePrice, numberOfPercussiveElements);
    }

    public String play() {
        return "Probably some Chopin";
    }
}
