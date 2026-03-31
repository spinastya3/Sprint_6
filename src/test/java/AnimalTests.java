import com.example.Animal;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AnimalTests {

    private Animal animal;

    @Before
    public void setUp(){
        animal = new Animal();
    }

    @Test
    public void getFoodHerbivoreTest() throws  Exception{
        List<String> result = animal.getFood("Травоядное");
        assertEquals(List.of("Трава", "Различные растения"), result);
    }

    @Test
    public void getFoodHerbivorePredator() throws  Exception{
        List<String> result = animal.getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), result);
    }

    @Test
    public void wrongTypeException() throws Exception{
        try {
            animal.getFood("робот");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

    @Test
    public void getFamilyTest(){
        String result = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", result);
    }
}
