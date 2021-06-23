package main.java.basics;

import java.util.Scanner;

public class Fors {

    public static void main(String[] args) {
        Fors fourfourfour = new Fors();

//        fourfourfour.forAndTwentyBlackbirds();
        fourfourfour.traditionalFizzBuzz();

    }

    public void forAndTwentyBlackbirds() {
        int birdsInPie = 0;
        for (int i = 1; i <= 24; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }

    public void traditionalFizzBuzz() {
        Scanner input = new Scanner(System.in);

        System.out.println("Hw much fun do you want?");
        int fun = Integer.parseInt(input.nextLine());
        int funStop = 0, count = 0;

        for(int i =1; i>funStop; i++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("Fizz Buzz");
                count++;
            }
            else  if(i%3 == 0 ) {
                System.out.println("Fizz");
                count++;
            }
            else  if(i%5 == 0) {
                System.out.println("Buzz");
                count++;
            }else {
                System.out.println(i);
            }

            if(count >= fun) {
                funStop = fun*1000;
            }
        }
        System.out.println("Tradition!!!1");
    }
}
