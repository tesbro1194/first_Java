package week04.Generic;

public class Main {
     static Generic<String> stringGeneticTwo = new Generic<>();

     public static void main(String[] args) {
        String tValueTurnOutWithString = stringGeneticTwo.get();
        stringGeneticTwo.set("Hello World");
        System.out.println(tValueTurnOutWithString);
    }
}
