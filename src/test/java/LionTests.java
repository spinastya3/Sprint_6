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

public class LionTests {

    @Mock
    Feline feline;

    @Test
    public void wrongSexException()  {
        try {
            new Lion("Оно", feline);
            org.junit.Assert.fail("Ожидалось исключение");

        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    @Test
    public void getKittensTest() throws Exception{
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(30);
        int result =  lion.getKittens();
        assertEquals(30, result);
    }

    @Test
    public void getFoodTests() throws Exception{

        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> result = lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), result);
    }
}
