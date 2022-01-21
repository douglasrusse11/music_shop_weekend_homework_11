package instrument.percussion;

import instrument.Instrument;
import instrument.InstrumentType;

public abstract class PercussionInstrument extends Instrument {
    private byte numberOfPercussiveElements;

    public PercussionInstrument(String make, String model, String material, double purchasePrice, double salePrice, byte numberOfPercussiveElements) {
        super(make, model, InstrumentType.PERCUSSION, material, purchasePrice, salePrice);
        this.numberOfPercussiveElements = numberOfPercussiveElements;
    }

    public byte getNumberOfPercussiveElements() {
        return numberOfPercussiveElements;
    }
}
