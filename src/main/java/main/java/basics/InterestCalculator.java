package main.java.basics;

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        InterestCalculator ic = new InterestCalculator();

        ic.userInput();

    }

    public void userInput() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter interest rate: ");
        double interestRate = Double.parseDouble(input.nextLine());

        System.out.print("Enter initial Amount: ");
        double initialAmount = Double.parseDouble(input.nextLine());

        System.out.print("Enter number of years: ");
        int years = Integer.parseInt(input.nextLine());


        System.out.println("Calculating....");
        calc(interestRate, initialAmount, years);
    }


    public void calc(double interest, double amount, int years) {
        double quarterlyInterest = interest / 400;
        double startAmount = amount;
        double endAmount = amount;

        for(int i = 1; i <= years; i++) {
            System.out.println("\nYear " + i);
            System.out.println("Began with: €" + String.format("%.2f", startAmount));
            for(int j = 0; j < 4; j++) {
                endAmount = endAmount * (1 + quarterlyInterest);
            }
            System.out.println("Earned: €" + String.format("%.2f",(endAmount - startAmount)));
            System.out.println("Ended with: €" + String.format("%.2f",endAmount));
            startAmount = endAmount;
        }
    }



}
