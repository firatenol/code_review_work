import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(0, calc.add(0, 0));
        assertEquals(-1, calc.add(-2, 1));
    }

    @Test
    void dif() {
        assertEquals(2, calc.dif(5, 3));
        assertEquals(0, calc.dif(0, 0));
        assertEquals(-3, calc.dif(-1, 2));
    }

    @Test
    void div() {
        assertEquals(2, calc.div(10, 5));
        assertEquals(0, calc.div(0, 5));
        assertThrows(ArithmeticException.class, () -> calc.div(1, 0));
    }

    @Test
    void times() {
        assertEquals(15, calc.times(3, 5));
        assertEquals(0, calc.times(0, 5));
        assertEquals(-6, calc.times(-2, 3));
    }

    @Test
    void solver() {
        assertEquals(5, calc.solver());
    }
}