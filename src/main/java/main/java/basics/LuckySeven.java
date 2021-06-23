package main.java.basics;

import java.util.Random;
import java.util.Scanner;

public class LuckySeven {

    public static void main(String[] args) {
        LuckySeven game = new LuckySeven();

        game.begin();
    }

    public void begin() {
        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();

        System.out.print("How much money do you want to enter? ");
        double amount = Double.parseDouble(input.nextLine());

        double highestAmount = amount;
        int rolls = 0, highestRoll = 0;

        while(amount > 0.0) {
            int d1 = randomizer.nextInt(6) + 1;
            int d2 = randomizer.nextInt(6) + 1;
            rolls++;

            if(d1+d2 == 7) {
                amount += 4;
                if(amount > highestAmount) {
                    highestAmount = amount;
                    highestRoll = rolls;
                }
            }
            else {
                amount -= 1;
            }
        }
        System.out.println("You are Broke after " + rolls + " rolls.");
        System.out.println("You should have stopped after " + highestRoll + " rolls when you had €" + highestAmount + ".");

    }
}
