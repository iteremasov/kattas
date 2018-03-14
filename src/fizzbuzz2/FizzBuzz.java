package fizzbuzz2;

import java.io.Serializable;

public class FizzBuzz {
    public Serializable get(int n) {
     String Fizz = "Fizz";
        if(n % 3 != 0 && n % 5 != 0 ){
            return n;
        }

        if(n % 5 != 0){
            return Fizz;
        }
        if(n % 3 != 0 ){
            return "Buzz";
        }

        return "FizzBuzz";
    }
}
