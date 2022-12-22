package Lion_Tests;


import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHasManeTest {
    private Feline feline = Mockito.mock(Feline.class);
    private final String sex;
    private final Boolean expectedHasMane;

    public LionHasManeTest(String sex, Boolean hasMane) {
        this.sex = sex;
        this.expectedHasMane = hasMane;
    }
    @Parameterized.Parameters
    public static Object[][] lionParameters() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}

        };
    }

    @Test

    public void lionHasManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}

