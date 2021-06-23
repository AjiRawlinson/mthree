package main.java.basics;

import java.util.Scanner;

public class Factorizer {

    public static void main(String[] args) {
        Factorizer xFactor = new Factorizer();

        xFactor.begin();

    }

    public void begin() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = Integer.parseInt(input.nextLine());

        System.out.println("Number you have selected is: " + number);

        factorize(number);

    }

    public void factorize(int num) {
        int factorSum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Factor: " + i);
                factorSum += i;
            }
        }

        if (factorSum == num) System.out.println("" + num + " is a Perfect Number");
        if (factorSum == 1) System.out.println("" + num + " is a Prime Number");
    }
}
