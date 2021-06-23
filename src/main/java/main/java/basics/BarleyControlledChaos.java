package main.java.basics;

import java.util.Random;

public class BarleyControlledChaos {

    public static void main(String[] args) {

        String color = getColour(); // call color method here
        String animal = getAnimal(); // call animal method again here
        String colorAgain = getColour(); // call color method again here
        int weight = getNumber(5, 200); // call number method,
        // with a range between 5 - 200
        int distance = getNumber(10, 20); // call number method,
        // with a range between 10 - 20
       int number = getNumber(10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = getNumber(2, 6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    static String getColour() {
        Random randomizer = new Random();
        int r = randomizer.nextInt(5);

        switch(r) {
            case 0:
                return "Yellow";
            case 1:
                return "red";
            case 2:
                return "green";
            case 3:
                return "blue";
            case 4:
                return "orange";
            default:
                return "Black";
        }
    }

    static String getAnimal() {
        Random randomizer = new Random();
        int r = randomizer.nextInt(5);

        switch (r) {
            case 0:
                return "Dog";
            case 1:
                return "Fish";
            case 2:
                return "Bird";
            case 3:
                return "Cow";
            case 4:
                return "Horse";
            default:
                return "Cat";
        }
    }

    static int getNumber(int min, int max) {
        Random randomizer = new Random();
        return randomizer.nextInt(max-min) + min;
    }
}
