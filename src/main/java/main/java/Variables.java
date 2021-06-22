package main.java;

import java.text.DecimalFormat;

public class Variables {

    public static void main(String[] args) {
        Variables var = new Variables();
        var.InABucket();
        var.MoreBucketsOfFun();
        var.OrderOfThings();
        var.AllAboutMe();
        var.MenuOFChampions();
        var.BestAddrEver();
    }

    private void InABucket() {
        // You can declare all KINDS of variables.
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;

        // But declaring them just sets up the space for data
        // to use the variable, you have to put data IN it first!
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;

        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies : ");
        System.out.println(piesEaten);
    }

    private void MoreBucketsOfFun() {
        // Declare ALL THE THINGS
        // (Usually it's a good idea to declare them at the beginning of the program)
        int butterflies, beetles, bugs;

        // Now give a couple of them some values
        butterflies = 5;
        beetles = 9;

        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");

        System.out.println("Uh oh, my dog ate one.");
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But there are still " + bugs + " bugs left...");
        System.out.println("Wait a minute!");
        System.out.println("... maybe my computer can't do math, after all!");
    }

    private void OrderOfThings() {
        double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape
                + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
    }

    private void AllAboutMe() {
        String name, favFood, accomodation;
        int noOfPets;
        Boolean canWhistle;

        name = "Aji";
        favFood = "Salad";
        noOfPets = 0;
        accomodation = "Castle";
        canWhistle = true;

        System.out.println("My name is " + name + ".");
        System.out.println("My favourite food is " + favFood + ".");
        System.out.println("My have " + noOfPets + " pets.");
        System.out.println("My live in a " + accomodation + ", and I love it here.");
        if(canWhistle) System.out.println("It is true, I know how to whistle");
        else System.out.println("It is false, I don't know how to whistle");
    }

    private void MenuOFChampions() {
        String food1, food2, food3;
        double price1, price2, price3;

        food1 = "Slice of Big Rico Pizza";
        food2 = "Invisible Strawberry Pie";
        food3 = "Denver Omelet";

        price1 = 500.00;
        price2 = 2.00;
        price3 = 1.50;

        DecimalFormat dp2 = new DecimalFormat("###.##");

        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.\n");
        System.out.println("\t\tWELCOME TO RESTAURANT NIGHT VALE!\n\t\tToday's Menu Is...\n");
        System.out.println(".oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.oOo.\n");
        System.out.println("\t\t" + food1 + "\t\t\t€" + String.format("%.2f", price1));
        System.out.println("\t\t" + food2 + "\t\t€" +String.format("%.2f", price2));
        System.out.println("\t\t" + food3 + "\t\t\t\t\t€" + String.format("%.2f", price3));

    }

    private void BestAddrEver() {
        int num1 = 1, num2 = 2, num3 = 3, result;
        result = num1 + num2 + num3;

        System.out.println("" + num1 + " + " + num2 + " + " + num3 + " = " + result);
    }
}
