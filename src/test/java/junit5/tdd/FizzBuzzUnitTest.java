package junit5.tdd;

import javafx.scene.media.AudioClip;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzUnitTest {
    @Test
    public void should_return_1_when_play_fizz_buzz_given_1() {
        //given
        int given = 1;
        //when
        FizzBuzz game = new FizzBuzz();
        String actual = game.play(given);
        //then
        String expect = "1";
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_Fizz_when_play_fizz_buzz_given_3() {
        //given
        int given = 3;
        //when
        FizzBuzz game = new FizzBuzz();
        String actual = game.play(given);
        //then
        String expect = "Fizz";
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_Buzz_when_play_fizz_buzz_given_5() {
        //given
        int given = 5;
        //when
        FizzBuzz game = new FizzBuzz();
        String actual = game.play(given);
        //then
        String expect = "Buzz";
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_Whizz_when_play_fizz_buzz_given_7() {
        //given
        int given = 7;
        //when
        FizzBuzz game = new FizzBuzz();
        String actual = game.play(given);
        //then
        String expect = "Whizz";
        assertEquals(expect, actual);
    }

    @Test
    public void should_return_FizzBuzz_when_play_fizz_buzz_given_21() {
        //given
        int given = 15;
        //when
        FizzBuzz game = new FizzBuzz();
        String actual = game.play(given);
        //then
        String expect = "FizzBuzz";
        assertEquals(expect, actual);
    }
}
