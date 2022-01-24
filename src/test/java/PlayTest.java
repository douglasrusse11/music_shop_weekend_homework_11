import instrument.brass.Trumpet;
import instrument.percussion.Piano;
import instrument.string.Guitar;

public class PlayTest {

    public static void main(String[] args) {
//        Trumpet trumpet = new Trumpet("Besson", "BE110", "Yellow Brass", 268.00, 335.00, (byte) 3);
//        trumpet.play();
//        Piano piano = new Piano("Kawai", "GL-30ATX4", "Spruce", 14077.00, 20111.00, (byte) 88);
//        piano.play();
        Guitar guitar = new Guitar("Schecter", "C-7", "Mahogany", 674.50, 1349.00, (byte) 7);
        guitar.play();
    }
}
