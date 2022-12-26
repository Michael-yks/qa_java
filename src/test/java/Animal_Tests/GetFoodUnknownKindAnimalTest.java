package Animal_Tests;


import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetFoodUnknownKindAnimalTest {
@Test
    public void getFoodUnknownKindAnimalTest() throws Exception {


    Exception exception = Assert.assertThrows(Exception.class, () -> {
        Animal animal = new Animal();
        animal.getFood("Человек");
    });
    assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());

}
}


