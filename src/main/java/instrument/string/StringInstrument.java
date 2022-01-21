package instrument.string;

import instrument.Instrument;
import instrument.InstrumentType;

public abstract class StringInstrument extends Instrument {
    private byte numberOfStrings;

    public StringInstrument(String make, String model, String material, double purchasePrice, double salePrice, byte numberOfStrings) {
        super(make, model, InstrumentType.STRING, material, purchasePrice, salePrice);
        this.numberOfStrings = numberOfStrings;
    }

    public byte getNumberOfStrings() {
        return numberOfStrings;
    }
}
