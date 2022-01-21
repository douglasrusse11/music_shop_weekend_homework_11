package instrument.brass;

import instrument.Instrument;
import instrument.InstrumentType;

public abstract class BrassInstrument extends Instrument {
    private byte numberOfValves;

    public BrassInstrument(String make, String model, String material, double purchasePrice, double salePrice, byte numberOfValves) {
        super(make, model, InstrumentType.BRASS, material, purchasePrice, salePrice);
        this.numberOfValves = numberOfValves;
    }

    public byte getNumberOfValves() {
        return numberOfValves;
    }
}
