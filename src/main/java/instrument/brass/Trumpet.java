package instrument.brass;

public class Trumpet extends BrassInstrument {
    public Trumpet(String make, String model, String material, double purchasePrice, double salePrice, byte numberOfValves) {
        super(make, model, material, purchasePrice, salePrice, numberOfValves);
    }

    public void play() {
        playSound("trumpet");
    }
}
