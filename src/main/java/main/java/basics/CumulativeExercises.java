package main.java.basics;

import java.util.Random;
import java.util.Scanner;

public class CumulativeExercises {

    public static void main(String[] args) {
        CumulativeExercises ce = new CumulativeExercises();

        ce.rockPaperScissors();
//        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
//        int[] array2 = { 999, -60, -77, 14, 160, 301  };
//        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
//
//        System.out.println("#1 Array sum: " + ce.SummativeSums(array1));
//        System.out.println("#2 Array sum: " + ce.SummativeSums(array2));
//        System.out.println("#3 Array sum: " + ce.SummativeSums(array3));
    }

    public void rockPaperScissors() {
        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();

        int userScore=0, computerScore=0, tieScore=0;
        int userChoice = 0;
        boolean validChoice = true;
        String userChoiceS = "";
        String computorChoiceS = "";

        try {
            System.out.print("How many rounds do you ant to play? ");
            int rounds = Integer.parseInt(input.nextLine());

            if(rounds > 0 && rounds <= 10) {
                for(int i =1; i <= rounds; i++) {
                    do {
                        validChoice = true;
                        System.out.println("Round " + (i) + ":\n1=Rock\n2=Paper\n3=Scissors\nEnter your Choice:");
                        userChoice = Integer.parseInt(input.nextLine());
                        if(userChoice < 1 || userChoice > 3) {
                            System.out.println("Enter Valid Choice");
                            validChoice = false;
                        }
                        userChoiceS = getRockPaperScissorsString(userChoice);
                    }while(!validChoice);

                    int computerChoice = randomizer.nextInt(3)+1;
                    computorChoiceS = getRockPaperScissorsString(computerChoice);

                    if(userChoice == computerChoice) {
                        System.out.println("You both chose " + userChoiceS);
                        System.out.println("Its a tie.");
                        tieScore++;
                    }
                    else if((userChoice == 1 && computerChoice == 2) ||
                            (userChoice == 2 && computerChoice == 3) ||
                            (userChoice == 3 && computerChoice == 1))    {
                        System.out.println("" + computorChoiceS + " beats " + userChoiceS);
                        System.out.println("Computer Wins.");
                        computerScore++;
                    }
                    else if((computerChoice == 1 && userChoice == 2) ||
                            (computerChoice == 2 && userChoice == 3) ||
                            (computerChoice == 3 && userChoice == 1)){
                        System.out.println("" + userChoiceS + " beats " + computorChoiceS);
                        System.out.println("User Wins.");
                        userScore++;
                    }

                }

                System.out.println("Game over - Final Result:\nComputer: " + computerScore + "\nUser: "+ userScore + "\nTies: " + tieScore);
                System.out.println("Do you wish to play again? (Y/N)");
                String playAgain = input.nextLine();

                if(playAgain.equalsIgnoreCase("Y")) {
                    rockPaperScissors();
                }
                else {
                    System.out.println("Goodbye...");
                }
            } else {
                System.out.println("Error: Too many rounds");
                System.out.println("Game over... ");
            }


        }catch (NumberFormatException e) {
            System.out.println("Error: " + e);
            System.out.println("Game over... ");
        }

    }

    public String getRockPaperScissorsString(int choice) {
        switch(choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return null;
        }
    }


    public int SummativeSums(int[] arr) {
        int sum = 0;
        for(int i= 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
