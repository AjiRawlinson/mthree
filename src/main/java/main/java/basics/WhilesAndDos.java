package main.java.basics;

import java.util.Random;

public class WhilesAndDos {

    public static void main(String[] args) {
        WhilesAndDos wad = new WhilesAndDos();

//        wad.waitAWhile();
        wad.lazyTeenager();

    }



    private void waitAWhile() {
        int timeNow = 5;
        int bedTime = 11;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }

    private void lazyTeenager() {
        Random randomizor = new Random();
        int count = 1;
        boolean resolved = false;

        do{
            System.out.println("Parent: Clean your Room! (" + count + "X)");

            int chance = randomizor.nextInt(10) + 1;
            if(chance < count) {
                System.out.println("Teenager: Fine....");
                resolved = true;
            } else if(count >= 4) {
                System.out.println("Parent: That's it you're grounded!");
                resolved = true;
            } else {
                System.out.println("Teenager: Yeah in a minute...");
                count++;
            }
        }while(!resolved);


    }
}
