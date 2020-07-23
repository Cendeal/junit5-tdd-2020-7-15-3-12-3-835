package junit5.tdd;

public class FizzBuzz {
    public String play(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (result.isEmpty()) {
            result += String.valueOf(number);
        }
        return result;
    }
}
