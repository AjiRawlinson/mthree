package main.java.basics;

import java.util.Random;

public class Arrays {

    public static void main(String[] args) {
        Arrays arr = new Arrays();


//        arr.ARainbow();
        arr.hiddenNuts();

    }

    public void ARainbow() {
        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};

        System.out.println(colors[5]);
        System.out.println(colors[3]);
        System.out.println(colors[2]);
        System.out.println(colors[1]);
        System.out.println(colors[4]);
        System.out.println(colors[0]);
        System.out.println(colors[6]);
    }

    public void hiddenNuts() {
        String[] hidingSpots = new String[100];
        for(int i  = 0; i < hidingSpots.length; i++) {
            hidingSpots[i] = "";
        }
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        for(int i  = 0; i < hidingSpots.length; i++) {
            if(hidingSpots[i].equalsIgnoreCase("Nut")) {
                System.out.println("Found it at Position: " + i);
                break;
            } else System.out.println("No Nut found at postion: " + i + ". The quest continues.");
        }
    }
}
