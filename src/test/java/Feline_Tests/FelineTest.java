package Feline_Tests;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatFelineTest() throws Exception {
    assertEquals("[Животные, Птицы, Рыба]", feline.eatMeat().toString());
    }

    @Test
    public void getFamilyFelineTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensFelineTest() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensFelineParam() {
        assertEquals(1, feline.getKittens(1));
    }
}