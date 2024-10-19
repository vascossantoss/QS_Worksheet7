import org.example.Number;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberTest {

    @ParameterizedTest
    @CsvSource(value = {"3", "23", "311", "487", "653", "947" })
    public void isPrimeTest(int num){
        assertTrue(Number.isPrime(num));
    }

    @ParameterizedTest
    @CsvSource(value = {"32", "64", "2", "20", "30", "26" })
    public void isEvenTest(int num){
        assertTrue(Number.isEven(num));
    }

    @ParameterizedTest
    @CsvSource(value = {"23, 23", "46, 23", "115, 23", "184, 23", "207, 23", "230, 23"})
    public void isMultipleTest(int num1, int num2){
        assertTrue(Number.isMultiple(num1, num2));
    }
}
