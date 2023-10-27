import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int result = Calculator.add(1, 2);
        assertEquals(result, 3);
    }
    @Test
    public void testSub() {
        int result = Calculator.sub(3, 2);
        assertEquals(result, 1);
    }
}