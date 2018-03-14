package fizzbuzz2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

@DisplayName("MyKataTesting")
public class FizzBuzzTest {
    FizzBuzz testInstance;

    @BeforeEach
    void init() {
        this.testInstance = new FizzBuzz();
    }

    @Test
    void test1() {
        assertEquals(1, this.testInstance.get(1));
    }

    @Test
    void test2(){
        assertEquals(2, this.testInstance.get(2));
    }

    @Test
    void test3(){
        assertEquals("Fizz", this.testInstance.get(3));

    }
    @Test
    void test5() {
        assertEquals("Buzz",this.testInstance.get(5) );
    }
    @Test
    void test15() {assertEquals("FizzBuzz",this.testInstance.get(15));}

    @Test
    void testN() {assertEquals(31,this.testInstance.get(31));}
}
