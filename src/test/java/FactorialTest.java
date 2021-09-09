import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FactorialTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "11, 39916800",
            "16, 20922789888000"
    })

    public void checkFactorial(int number, long expected) {
        // when
        long actual = Factorial.calculateFactorial(number);
        //then
        Assertions.assertEquals(expected, actual);
    }

}
