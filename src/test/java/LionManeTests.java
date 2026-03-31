import com.example.Feline;
import com.example.Lion;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionManeTests {

    private AutoCloseable closeable;
    private final String sex;
    private final boolean result;

    public LionManeTests(String sex, boolean result){
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[] existOfMane() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    @Before
    public void init() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(result, actual);
    }

    @After
    public void tearDown() throws Exception{
        closeable.close();
    }
}
