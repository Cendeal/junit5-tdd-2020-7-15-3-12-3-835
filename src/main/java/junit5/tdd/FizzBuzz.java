package junit5.tdd;

import java.util.Scanner;

public class FizzBuzz {
    public String play(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "Fizz";
        }
        if (number % 5 == 0) {
            result += "Buzz";
        }
        if (number % 7 == 0) {
            result += "Whizz";
        }
        if (result.isEmpty()) {
            result += String.valueOf(number);
        }
        return result;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input your number[other words to exit]:");
        while (sc.hasNext()) {

            try {
                int number = sc.nextInt();
                System.out.println(play(number));
            } catch (Exception e) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        new FizzBuzz().start();
    }
}
