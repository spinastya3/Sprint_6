import com.example.Alex;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)

public class AlexTests {

    private Alex alex;

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        alex = new Alex(feline);
    }

    @Test
    public void getFriendsTest() {
        List<String> result = alex.getFriends();
        assertEquals(List.of("Марти", "Глория", "Мелман"), result);
    }

    @Test
    public void getPlaceOfLivingTest() {
        String result = alex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк", result);
    }

    @Test
    public void getKittensTest() {
        int result = alex.getKittens();
        assertEquals(0, result);
    }

    @Test
    public void doesHaveManeTest() {
        assertTrue(alex.doesHaveMane());
    }

    @Test
    public void getFoodTest() throws Exception{

        // Проверяю изоляцию теста от класса Animal
        List<String> menu = List.of("Стейк","Суши");
        Mockito.when(feline.getFood("Хищник")).thenReturn(menu);
        List<String> result = alex.getFood();
        Mockito.verify(feline).getFood("Хищник");
        assertEquals(menu, result);
    }
}
