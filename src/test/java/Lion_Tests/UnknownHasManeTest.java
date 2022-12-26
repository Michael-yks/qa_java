package Lion_Tests;


import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnknownHasManeTest {
    private Feline feline;

    @Test
    public void unknownHasManeTest() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("сам", feline);

        });
        assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }
}
