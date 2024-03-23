import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    @Description("Sum success test")
    void sumTest(){
        float firstValue = 10;
        float secondValue = 20;
        float expected = 30f;

        Calc calc = new Calc();
        float result = calc.Sum(firstValue, secondValue);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @Description("Substract success test")
    void SubstractTest(){
        float firstValue = 10;
        float secondValue = 20;
        float expected = -10f;
        Calc calc = new Calc();
        float result = calc.Substract(firstValue, secondValue);

        Assertions.assertEquals(expected, result);
    }
}
