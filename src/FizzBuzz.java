import java.io.Serializable;

public class FizzBuzz {
    public Serializable getFizzBuzz(int number) {
        String result = "";

        if (number % 3 == 0) {
            result += "Fizz";
        }

        if (number % 5 == 0) {
            result += "Buzz";
        }

        return result.equals("") ? number : result;
    }
}
