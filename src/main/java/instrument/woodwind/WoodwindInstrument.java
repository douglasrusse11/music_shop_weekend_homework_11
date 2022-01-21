package instrument.woodwind;

import instrument.Instrument;
import instrument.InstrumentType;

public abstract class WoodwindInstrument extends Instrument {
    private byte numberOfKeys;

    public WoodwindInstrument(String make, String model, String material, double purchasePrice, double salePrice, byte numberOfKeys) {
        super(make, model, InstrumentType.WOODWIND, material, purchasePrice, salePrice);
        this.numberOfKeys = numberOfKeys;
    }

    public byte getNumberOfKeys() {
        return numberOfKeys;
    }
}
