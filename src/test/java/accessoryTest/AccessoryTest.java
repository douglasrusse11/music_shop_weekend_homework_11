package accessoryTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    private Accessory accessory;

    @Before
    public void before() {
        accessory = new Accessory("Guitar Strings", 3.99, 6.99);
    }

    @Test
    public void hasType() {
        assertEquals("Guitar Strings", accessory.getType());
    }

    @Test
    public void hasPurchasePrice() {
        assertEquals(3.99, accessory.getPurchasePrice(), 0.0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(6.99, accessory.getSalePrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(3, accesorry.calculateMarkup(), 0.0);
    }
}
