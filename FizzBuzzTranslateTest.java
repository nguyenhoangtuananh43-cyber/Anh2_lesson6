import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translate() {
        assertEquals("Fizz", FizzBuzzTranslate.translate(3));
        assertEquals("Buzz", FizzBuzzTranslate.translate(5));
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(15));
        assertEquals("Fizz", FizzBuzzTranslate.translate(13));
        assertEquals("Buzz", FizzBuzzTranslate.translate(52));
        assertEquals("hai sáu", FizzBuzzTranslate.translate(26));

    }
}