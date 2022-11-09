package test;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

import main.App;

public class AppTest {
    
    @Test
    public void should_return_100_entries(){
        // given
        App app = new App();

        // when
        HashMap<Integer,String> fizzbuzz = app.fizzbuzz();

        // then
        assertTrue("Fizzbuzz size not equal to 100", fizzbuzz.size() == 100);
    }
    @Test
    public void return_fizz_for_multiple_of_3() {
        //given
        App app = new App();
        //when
        HashMap<Integer,String> fizzbuzz = app.fizzbuzz();
        //then
        /*
        Iterate the fizzbuzz list, for each element, check if it is a multiple of 3, if it is then make sure its fizz
        */ 
        for (int i=1; i < fizzbuzz.size(); i++)
            if (i%3==0 && i%5!=0){
                assertTrue("Fizz is not included", fizzbuzz.get(i) == "Fizz");
            }
    }
    @Test
    public void return_fizz_for_multiple_of_5() {
        //given
        App app = new App();

        //when
        HashMap<Integer,String> fizzbuzz = app.fizzbuzz();
        //then
        /*
        Iterate the fizzbuzz list, for each element, check if it is a multiple of 3, if it is then make sure its fizz
        */ 
        for (int i=1; i < fizzbuzz.size(); i++)
            if (i%5==0 && i%3!=0){
                assertTrue("Buzz is not included", fizzbuzz.get(i) == "Buzz");
            }
    }
    @Test
    public void return_fizzbuzz_for_mod_3_5() {
        //given
        App app = new App();
        //when
        HashMap<Integer,String> fizzbuzz = app.fizzbuzz();
        //then
        for (int i=1; i < fizzbuzz.size(); i++)
            if (i%5==0 && i%3==0){
                assertTrue("Buzz is not included", fizzbuzz.get(i) == "FizzBuzz");
            }
    }
    @Test
    public void check_if_fizz_exist_if_number_3_exists() {
        //given
        App app = new App();
        //when
        HashMap<Integer,String> fizzbuzz = app.fizzbuzz();
        //then
        for (int i=1; i < fizzbuzz.size(); i++)
            if (String.valueOf(i).contains("3")){
                assertTrue("Fizz is not included", fizzbuzz.get(i).contains("Fizz"));
            }
    }
}
