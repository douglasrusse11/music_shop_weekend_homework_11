package instrumentTest.stringTest;

import instrument.InstrumentType;
import instrument.string.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Schecter", "C-7", "Mahogany", 674.50, 1349.00, (byte) 7);
    }

    @Test
    public void hasMake() {
        assertEquals("Schecter", guitar.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("C-7", guitar.getModel());
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(674.50, guitar.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(1349.00, guitar.getSalePrice(), 0.0);
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(7, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("No Stairway, denied", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(674.50, guitar.calculateMarkup(), 0.0);
    }
}

