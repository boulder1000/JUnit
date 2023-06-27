import be.vdab.Persoon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
public class PersoonTest {

    private Persoon persoon;
    @BeforeEach
    void beforeEach() {
        persoon = new Persoon(new ArrayList<>());
    }
    @Test
    void testGeenDubbel() {
        persoon.addVoornaam("Jan");
        Assertions.assertThrows(IllegalArgumentException.class, () -> persoon.addVoornaam("Jan"));
    }
    @Test
    void testBlank() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> persoon.addVoornaam(" "));
    }
    @Test
    void testToString(){
        persoon.addVoornaam("Jane");
        persoon.addVoornaam("Jan");
        Assertions.assertEquals("Jane Jan", persoon.toString());
        persoon.addVoornaam("John");
        Assertions.assertEquals("Jane Jan John", persoon.toString());
    }
}
