import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BasicTest {
    @Test
    public void evaluatesExpression() {
        int sum = 6;
        assertEquals(6, sum);
    }

    @Test
    public void testCapitalize() {
        MyApp a = new MyApp("ahoj");
        assertEquals("Ahoj", a.capitalizeFirstLetter());
    }
}
