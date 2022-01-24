package instrumentTest.brassTest;

import instrument.InstrumentType;
import instrument.brass.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    private Trumpet trumpet;
    
    @Before
    public void before() {
        trumpet = new Trumpet("Besson", "BE110", "Yellow Brass", 268.00, 335.00, (byte) 3);
    }

    @Test
    public void hasMake() {
        assertEquals("Besson", trumpet.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("BE110", trumpet.getModel());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Yellow Brass", trumpet.getMaterial());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(268.00, trumpet.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(335.00, trumpet.getSalePrice(), 0.0);
    }

    @Test
    public void hasNumberOfValves() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(67.00, trumpet.calculateMarkup(), 0.0);
    }

}
