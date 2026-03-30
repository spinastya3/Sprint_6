import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTests {

    private Feline feline;

    @Before
    public void setUp(){
         feline = new Feline();
    }

    @Test
    public void getKittensTest(){
       int result =  feline.getKittens();
        assertEquals(1, result);
    }

    @Test
    public void getKittensCountTest(){
        int result =  feline.getKittens(15);
        assertEquals(15, result);
    }

    @Test
    public void getFamilyTest(){
        String result =  feline.getFamily();
        assertEquals("Кошачьи", result);
    }

    @Test
    public void eatMeatTest() throws Exception {
            List<String> result = feline.eatMeat();
            assertEquals(List.of("Животные", "Птицы", "Рыба"), result);
        }
}
