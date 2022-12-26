package Animal_Tests;


import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalKind;
    private final String expectedFoodKind;

    public AnimalTest(String animalKind, String foodKind) {
        this.animalKind = animalKind;
        this.expectedFoodKind = foodKind;
    }

    @Parameterized.Parameters(name = "animalKind: {0}, foodKind: {1}")
    public static Object[][] animalParameters() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения").toString()},
                {"Хищник", List.of("Животные", "Птицы", "Рыба").toString()}

        };
    }

    @Test
    public void getFood() throws Exception {
        Animal animal = new Animal();
        assertEquals(expectedFoodKind, animal.getFood(animalKind).toString());

    }
}
