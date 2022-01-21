package instrumentTest.woodwindTest;

import instrument.InstrumentType;
import instrument.woodwind.CorAnglais;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CorAnglaisTest {

    private CorAnglais corAnglais;

    @Before
    public void before() {
        corAnglais = new CorAnglais("Buffet", "Prestige", "Grenadilla", 6507.75, 8677.00, (byte) 12);
    }

    @Test
    public void hasMake() {
        assertEquals("Buffet", corAnglais.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Prestige", corAnglais.getModel());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.WOODWIND, corAnglais.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Grenadilla", corAnglais.getMaterial());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(6507.75, corAnglais.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(8677.00, corAnglais.getSalePrice(), 0.0);
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(12, corAnglais.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("I don't even know", corAnglais.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(2169.25, corAnglais.calculateMarkup(), 0.0);
    }

}
