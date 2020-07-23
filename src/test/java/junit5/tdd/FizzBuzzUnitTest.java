package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzUnitTest {
    @Test
    public void should_return_1_when_play_fizz_buzz_given_1(){
        //given
        int given = 1;
        //when
        FizzBuzz game = new FizzBuzz();
        String actual = game.play(given);
        //then
        String expect = "1";
        assertEquals(expect,actual);
    }

    @Test
    public void should_return_Fizz_when_play_fizz_buzz_given_3(){
        //given
        int given = 3;
        //when
        FizzBuzz game = new FizzBuzz();
        String actual = game.play(given);
        //then
        String expect = "Fizz";
        assertEquals(expect,actual);
    }
}
