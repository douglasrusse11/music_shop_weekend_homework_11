package shopTest;

import accessory.Accessory;
import instrument.brass.Trumpet;
import instrument.percussion.Piano;
import instrument.string.Guitar;
import instrument.woodwind.CorAnglais;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;

    @Before
    public void before() {
        shop = new Shop();
    }

    @Test
    public void hasStock() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(new CorAnglais("Buffet", "Prestige", "Grenadilla", 6507.75, 8677.00, (byte) 12));
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveItemFromStock() {
        Trumpet trumpet = new Trumpet("Besson", "BE110", "Yellow Brass", 268.00, 335.00, (byte) 3);
        shop.addItemToStock(trumpet);
        shop.addItemToStock(trumpet);
        shop.removeItemFromStock(trumpet);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        shop.addItemToStock(new Piano("Kawai", "GL-30ATX4", "Spruce", 14077.00, 20111.00, (byte) 88));
        shop.addItemToStock(new Trumpet("Besson", "BE110", "Yellow Brass", 268.00, 335.00, (byte) 3));
        shop.addItemToStock(new CorAnglais("Buffet", "Prestige", "Grenadilla", 6507.75, 8677.00, (byte) 12));
        shop.addItemToStock(new Guitar("Schecter", "C-7", "Mahogany", 674.50, 1349.00, (byte) 7));
        shop.addItemToStock(new Accessory("Guitar Strings", 3.99, 6.99));
        shop.addItemToStock(new Accessory("Tuner", 14.99, 19.99));
        assertEquals(8952.75, shop.getTotalPotentialProfit(), 0.0);
    }
}
