package Lion_Tests;


import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTestWithMock {
    Lion lion;
@Mock
Feline feline;
@Test
public void getKittensTest() throws Exception {
    String sex = "Самец";
    lion = new Lion(sex);
        Mockito.when(feline.getKittens()).thenReturn(1);
    assertEquals(1, lion.getKittens());

}
@Test
    public void getFoodTest() throws Exception {
    String sex = "Самка";
    Lion lion = new Lion(sex);
    Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные, Птицы, Рыба"));
    assertEquals(List.of("Животные, Птицы, Рыба"), lion.getFood());
}

}

