import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(3, 2));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
    }

    @Test
    void solver() {
        assertEquals(20, calculator.solver());
    }
}