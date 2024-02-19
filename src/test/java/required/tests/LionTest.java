package required.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {
    Feline feline = new Feline();

    @Test
    public void getKittensLionFemaleTestShouldReturnOne() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodTestShouldReturnLionFoodList() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void otherSexExceptionShouldReturnUnknownSexLionMessageString() {
        String expectedString = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("Неизвестный пол", feline));
        Assert.assertEquals(expectedString, exception.getMessage());
    }
}
