import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Проверка входных данных")
public class CalculatorTest {

    @Test
    @DisplayName("Проверка вычитания 2 чисел")
    public void testGetResultSubtraction() {
        Object actual = 2;
        Object expected = Calculator.getResult("4-2");
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Проверка сложения 2 чисел")
    public void testGetResultAddition() {
        Object actual = 20;
        Object expected = Calculator.getResult("11+9");
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Проверка умножения 2 чисел")
    public void testGetResultMultiplication() {
        Object actual = 20;
        Object expected = Calculator.getResult("11+9");
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Проверка деления 2 чисел")
    public void testGetResultDivision() {
        Object actual = 3;
        Object expected = Calculator.getResult("9/3");
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Проверка с использованием нескольких чисел")
    public void testGetResultSeveralNumbers() {
        Object actual = 3;
        Object expected = Calculator.getResult("9-3*2");
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Проверка с использованием сложного выражения")
    public void testGetResultComplexExpression() {
        Object actual = 1;
        Object expected = Calculator.getResult("9-3*2-(4-2)");
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Проверка с использованием текста")
    public void testGetResultText() {
        Object actual = "";
        Object expected = Calculator.getResult("hello");
        assertEquals(actual, expected);
    }
}
