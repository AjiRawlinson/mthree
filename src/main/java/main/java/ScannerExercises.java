package main.java;

import java.util.Scanner;

public class ScannerExercises {

    public static void main(String[] args) {
        ScannerExercises scan = new ScannerExercises();

        scan.questForUserInput();
        scan.DontForgetToStoreIt();
        scan.passingTheTuringTest();
        scan.alltheTrivia();
        scan.doItBetter();
        scan.biggerBetterAdder();
        scan.HealthyHearts();
        scan.miniMadLibs();

    }

    private void questForUserInput() {
        Scanner inputReader = new Scanner(System.in);

        String yourName;
        String yourQuest;
        double velocityOfSwallow;

        // We can use the Scanner's readLine to assign value to our strings
        // because its return type is string
        System.out.println("What is your name?? ");
        yourName = inputReader.nextLine();

        System.out.println("What is your quest?! ");
        yourQuest = inputReader.nextLine();

        // When we get to our double data type, we can use Scanner's nextDouble method
        // or we can use the Double.parseDouble to convert the nextLine's String

        System.out.println("What is the airspeed velocity of an unladen swallow?!?! ");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        System.out.println("How do you know " + velocityOfSwallow + " is correct, " + yourName + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds and instead go " + yourQuest + ".");
    }

    private void DontForgetToStoreIt() {
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, colour;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Give me pi to at least 5 decimals: ");
        pi = Double.parseDouble(inputReader.nextLine());

        // We've used Double.parseDouble but meaningOfLifeAndEverything is an INT
        // so we'll have to use Integer.parseInt

        System.out.println("What is the meaning of life, the universe & everything? ");
        meaningOfLifeAndEverything = Integer.parseInt(inputReader.nextLine());

        System.out.println("What is your favorite kind of cheese? ");
        cheese = inputReader.nextLine();

        System.out.println("Do you like the color red or blue more? ");
        colour = inputReader.nextLine();

        System.out.println("Ooh, " + colour + " " + cheese +" sounds delicious!");
        System.out.println("The circumference of life is " +( 2 * pi * meaningOfLifeAndEverything));
    }

    private void passingTheTuringTest() {
        String name, colour, fruit, number;


        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there!\nWhat's your name?");
        name = inputReader.nextLine();

        System.out.println("Hi " + name + "! I' Alice.\nWhat's your favorite color?");
        colour = inputReader.nextLine();


        System.out.println("Huh " + colour + "? Mine's Electric Lime.\n\nI really like limes. They're my favorite fruit, too.\nWhat's YOUR favorite fruit, "+ name + "?");
        fruit = inputReader.nextLine();

        System.out.println("Really? " + fruit + "? That's wild!\nSpeaking of favorites, what's your favorite number?");
        number = inputReader.nextLine();

        int answer = Integer.parseInt(number) * (-7);

        System.out.println("" + number + " s a cool number. Mine's -7.\nDid you know " + number + " * -7 is " + answer + "? That's a cool number too!\n");

        System.out.println("Well, thanks for talking to me, " + name + "!");
    }

    private void alltheTrivia() {
        String ans1, ans2, ans3, ans4;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("What unit is equivalent to 1,024 Gigabytes?");
        ans1 = inputReader.nextLine();

        System.out.println("Which planet is the only one that rotates clockwise in our Solar System? ");
        ans2 = inputReader.nextLine();

        System.out.println("The largest volcano ever discovered in our Solar System is located on which planet?");
        ans3 = inputReader.nextLine();

        System.out.println("What is the most abundant element in the earth's atmosphere?");
        ans4 = inputReader.nextLine();

        System.out.println("Wow, 1,024 Gigabytes is a " + ans4 + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + ans3 + "!");
        System.out.println("That's amazing that "+ ans2 + " is the most abundant element in the atmosphere...");
        System.out.println("" + ans1 + " is the only planet that rotates clockwise, neat!");
    }

    private void doItBetter() {
        String milesRunString, hotdogsEatString, languagesSpeakString;
        int milesRun, hotdogsEat, languagesSpeak;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("How many miles can you run?");
        milesRunString = inputReader.nextLine();

        System.out.println("How many hotdogs can you eat?");
        hotdogsEatString = inputReader.nextLine();

        System.out.println("How many languages can you speak?");
        languagesSpeakString = inputReader.nextLine();

        milesRun = (Integer.parseInt(milesRunString) * 2) + 1;
        hotdogsEat = (Integer.parseInt(hotdogsEatString) * 2) + 1;
        languagesSpeak = (Integer.parseInt(languagesSpeakString) * 2) + 1;

        System.out.println("Oh yeah well I can run " + milesRun + " miles!");
        System.out.println("And I can eat " + hotdogsEat + " hotdogs");
        System.out.println("And I can speak in "+ languagesSpeak + " different languages.");
    }

    private void biggerBetterAdder() {
        String num1, num2, num3;
        int result;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Enter number 1?");
        num1 = inputReader.nextLine();

        System.out.println("Enter number 2?");
        num2 = inputReader.nextLine();

        System.out.println("Enter number 13?");
        num3 = inputReader.nextLine();

        result = Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3);

        System.out.println("" + num1 + " + " + num2 + " + " + num3 + " = " + result);
    }

    private void HealthyHearts() {
        String ageString;
        int age, maxHR, zoneHigh, zoneLow;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Enter your age?");
        ageString = inputReader.nextLine();

        age = Integer.parseInt(ageString);

        maxHR = 220 - age;
        zoneHigh = (int) (maxHR * 0.85);
        zoneLow = (int) (maxHR * 0.5);

        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute.");
        System.out.println("Your maximum heart rate should be " + zoneLow + " - " + zoneHigh + " beats per minute.");
    }


    private void miniMadLibs() {
        String noun1, adjective1, noun2, number, adjective2, noun3, noun4, noun5, verb, verbPassed;
        int result;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Enter noun:");
        noun1 = inputReader.nextLine();
        System.out.println("Enter adjective:");
        adjective1 = inputReader.nextLine();
        System.out.println("Enter another noun:");
        noun2 = inputReader.nextLine();
        System.out.println("Enter number:");
        number = inputReader.nextLine();
        System.out.println("Enter another adjective:");
        adjective2 = inputReader.nextLine();
        System.out.println("Enter noun (plural):");
        noun3 = inputReader.nextLine();
        System.out.println("Enter another noun (plural):");
        noun4 = inputReader.nextLine();
        System.out.println("Enter last noun (plural):");
        noun5 = inputReader.nextLine();
        System.out.println("Enter verb:");
        verb = inputReader.nextLine();
        System.out.println("Enter same verb (passed tense):");
        verbPassed = inputReader.nextLine();

        System.out.println("" + noun1 + ": the " + adjective1 +
                " frontier. These are the voyages of the starship " +
                noun2 + ". Its " + number + "-year mission: to explore strange " +
                adjective2 + " " + noun3 + ", to seek out " + adjective2 + " " +
                noun4 + " and " + adjective2 + " " + noun5 + ", to bodly " + verb +
                " where no one has " + verbPassed + " before.");
    }


}
