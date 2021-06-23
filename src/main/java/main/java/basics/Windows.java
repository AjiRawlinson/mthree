package main.java.basics;

import java.util.Scanner;

public class Windows {

    public static void main(String[] args) {
        // declare variables for height and width
        float height;
        float width;

        // declare String variables to hold the user's height and
        // width input
        String stringHeight;
        String stringWidth;
        String stringTrimCost;
        String StringAreaCost;
        String stringQuantity;

        // declare other variables
        float areaOfWindow;
        float costArea;
        float costTrim;
        float costTotal;
        float perimeterOfWindow;
        int quantity;

        // declare validinput boolean;
        boolean validInputs = true;

        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);
        do {
            validInputs = true;
            try {

                // get input from the user
                System.out.println("Please enter Trim Cost:");
                stringTrimCost = myScanner.nextLine();
                System.out.println("Please enter Area Cost:");
                StringAreaCost = myScanner.nextLine();
                System.out.println("Please enter window height:");
                stringHeight = myScanner.nextLine();
                System.out.println("Please enter window width:");
                stringWidth = myScanner.nextLine();
                System.out.println("Please enter number of Windows:");
                stringQuantity = myScanner.nextLine();

                // convert String values of height and width to float values
                height = Float.parseFloat(stringHeight);
                width = Float.parseFloat(stringWidth);
                costArea = Float.parseFloat(StringAreaCost);
                costTrim = Float.parseFloat(stringTrimCost);
                quantity = Integer.parseInt(stringQuantity);

                // calculate the area of the window
                areaOfWindow = height * width;

                // calculate the perimeter of the window
                perimeterOfWindow = 2 * (height + width);

                // calculate the total cost - use a hard-coded value
                // for material cost
                costTotal = ((costArea * areaOfWindow) + (costTrim * perimeterOfWindow)) * quantity;

                // display the results to the user
                System.out.println("Window height = " + stringHeight);
                System.out.println("Window width = " + stringWidth);
                System.out.println("Window area = " + areaOfWindow);
                System.out.println("Window perimeter = " + perimeterOfWindow);
                System.out.println("Total Cost =  " + costTotal);

            } catch (NumberFormatException E) {
                validInputs = false;
                System.out.println("Number Format Excetion: " + E);
            }
        } while (!validInputs);
    }

}
