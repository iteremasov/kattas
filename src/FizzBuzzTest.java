import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Fizz Buzz katta")
public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void initFizzBuzz() {
        this.fizzBuzz = new FizzBuzz();
    }

    @Test
    void test1() {
        assertEquals(1, this.fizzBuzz.getFizzBuzz(1));
    }

    @Test
    void test2() {
        assertEquals(2, this.fizzBuzz.getFizzBuzz(2));
    }

    @Test
    void test3() {
        assertEquals("Fizz", this.fizzBuzz.getFizzBuzz(3));
    }

    @Test
    void test5() {
        assertEquals("Buzz", this.fizzBuzz.getFizzBuzz(5));
    }

    @Test
    void test15() {
        assertEquals("FizzBuzz", this.fizzBuzz.getFizzBuzz(15));
    }

    @Test
    void test27() {
        assertEquals("Fizz", this.fizzBuzz.getFizzBuzz(27));
    }
}
