import com.example.Alex;
import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    @Test
    public void integrationTest() throws Exception{
        Feline feline = new Feline();
        Alex alex = new Alex(feline);
        List<String> result = alex.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), result);
    }
}
