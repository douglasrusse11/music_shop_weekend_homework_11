package instrumentTest.percussionTest;

import instrument.InstrumentType;
import instrument.percussion.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    private Piano piano;

    @Before
    public void before() {
        piano = new Piano("Kawai", "GL-30ATX4", "Spruce", 14077.00, 20111.00, (byte) 88);
    }

    @Test
    public void hasMake() {
        assertEquals("Kawai", piano.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("GL-30ATX4", piano.getModel());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.PERCUSSION, piano.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Spruce", piano.getMaterial());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(14077.00, piano.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(20111.00, piano.getSalePrice(), 0.0);
    }

    @Test
    public void hasNumberOfPercussiveElements() {
        assertEquals(88, piano.getNumberOfPercussiveElements());
    }

    @Test
    public void canPlay() {
        assertEquals("Probably some Chopin", piano.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(6034.00, piano.calculateMarkup(), 0.0);
    }
}
