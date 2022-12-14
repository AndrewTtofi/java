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
            if (i%3==0 && i%5==0){
                a.put(i,"FizzBuzz");
            } else if (i%3==0){
                a.put(i, "Fizz");
            } else if(i%5==0) {
                a.put(i,"Buzz");
            } else {
                String x = String.valueOf(i);
                a.put(i,x);
            }
          }
        return a;
    }
}