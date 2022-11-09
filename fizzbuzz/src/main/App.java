package main;

import java.util.HashMap;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App app = new App();
        HashMap<Integer,String> fizzbuzz = app.fizzbuzz();
        fizzbuzz.forEach((key, value) -> System.out.println(key + " " + value));
    }
    
    public HashMap<Integer,String> fizzbuzz() {
        HashMap a = new HashMap<Integer,String>();
        for (int i = 1; i < 101; i++) {
            a.put(i, "Fizz");
          }
        return a;
    }
}