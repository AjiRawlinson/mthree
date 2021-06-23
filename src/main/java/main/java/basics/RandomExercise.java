package main.java.basics;

import java.util.Random;
import java.util.Scanner;

public class RandomExercise {

    public static void main(String[] args) {
        RandomExercise rand = new RandomExercise();

//        rand.aLittleChaos();
        rand.guessMeAgain();
    }

    private void aLittleChaos() {
        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print((randomizer.nextInt(51) + 50) + ", ");
        System.out.print((randomizer.nextInt(51) + 50) + ", ");
        System.out.print((randomizer.nextInt(51) + 50) + ", ");
        System.out.print((randomizer.nextInt(51) + 50) + ", ");
        System.out.print((randomizer.nextInt(51) + 50) + ", ");
        System.out.println((randomizer.nextInt(51)+ 50));
    }


    public void guessMeAgain() {
        Random randomizer = new Random();

        int hiddenNumber = randomizer.nextInt(201) - 100, userGuess;
        String userGuessString;
        int guesses = 12;

        Scanner input = new Scanner(System.in);

        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        while(guesses > 0) {
            if(guesses < 3) System.out.println("Try Again!");
            System.out.print("Your guess: ");
            userGuessString = input.nextLine();

            userGuess = Integer.parseInt(userGuessString);

            if (userGuess == hiddenNumber) {
                System.out.println("Wow, nice guess! That was it!");
                guesses = 0;
            }
            else if (userGuess < hiddenNumber) {
                System.out.println("Ha, nice try - too low!");
                guesses--;
            }
            else {
                System.out.println("Too bad, way too high.");
                guesses--;
            }
        }
    }
}
