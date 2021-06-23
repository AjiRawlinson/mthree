package main.java.basics;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        IfElse ie = new IfElse();

//        ie.LlamasWhalesAndDodosOhMy();
//        ie.guessMe();
//        ie.YourLifeInMovies();
//        ie.spaceRustlers();
//        ie.birthStones();
//        ie.triviaNight();
//        ie.knockKnock();
//        ie.pickyEater();
//        ie.fieldDay();
    ie.miniZork();
    }



    private void LlamasWhalesAndDodosOhMy() {
        int llamas = 2000;
        int whales = 15;
        int dodos = 0;

        if (dodos > 0) {
            System.out.println("Egads, I thought dodos were extinct!");
        }

        if(dodos < 0){
            System.out.println("Hold on, how can we have NEGATIVE dodos??!");
        }

        if(llamas > whales){
            System.out.println("Whales may be bigger, but llamas are better, ha!");
        }

        if(llamas <= whales){
            System.out.println("Aw man, brawn over brains I guess. Whales beat llamas.");
        }

        System.out.println("There's been a huge increase in the dodo population via cloning!");
        dodos += 100;

        if( (whales + llamas) < dodos){
            System.out.println("I never thought I'd see the day when dodos ruled the earth.");
        }

        if(llamas > whales && llamas > dodos){
            System.out.println("I don't know how, but the llamas have come out ahead! Sneaky!");
        }
    }

    public void guessMe() {
        int hiddenNumber = 8, userGuess;
        String userGuessString;

        Scanner input = new Scanner(System.in);

        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.print("Your guess: ");
        userGuessString = input.nextLine();

        userGuess = Integer.parseInt(userGuessString);

        if(userGuess == hiddenNumber) System.out.println("Wow, nice guess! That was it!");
        else if(userGuess < hiddenNumber) System.out.println("Ha, nice try - too low! I chose " + hiddenNumber + ".");
        else System.out.println("Too bad, way too high. I chose " + hiddenNumber + ".");

    }

    public void YourLifeInMovies() {
        String name, birthYearString;
        int birthYear;

        Scanner input = new Scanner(System.in);

        System.out.print("Hey, let's play a game! What's your name? ");
        name = input.nextLine();

        System.out.print("Okay, "+ name + ", when were you born? ");
        birthYearString = input.nextLine();

        birthYear = Integer.parseInt(birthYearString);

        System.out.println("Well " + name + "...");

        if(birthYear < 2005) System.out.println("Did you realise that Pixar's Up came out over a decade ago?");
        if(birthYear < 1995) System.out.println("Did you realise that the first Harry Potter came out over 15 years ago.");
        if(birthYear < 1985) System.out.println("Did you realise that Space Jam came out not last decade, but the one before THAT.");
        if(birthYear < 1975) System.out.println("Did you realise that the original Jurassic Park release is closer to the first lunar landing than it is to today.");
        if(birthYear < 1965) System.out.println("Did you realise that the MASH TV series has been around for almost half a century!");
    }

    public void spaceRustlers() {
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }

        if(aliens > cows) System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        else System.out.println("Oh no! The herds got restless and took over! Looks like we're hamburger now!!");
    }

    public void birthStones() {
        String name, numberString;
        int number;

        Scanner input = new Scanner(System.in);

        System.out.print("What month's birthstone do you want to know?");
        numberString = input.nextLine();

        number = Integer.parseInt(numberString);

        switch(number) {
            case 1:
                System.out.println("January's birthstone is Garnet");
                break;
            case 2:
                System.out.println("February's birthstone is Amethyst");
                break;
            case 3:
                System.out.println("March's birthstone is Aquamarine");
                break;
            case 4:
                System.out.println("April's birthstone is Diamond");
                break;
            case 5:
                System.out.println("May's birthstone is Emerald");
                break;
            case 6:
                System.out.println("June's birthstone is Pearl");
                break;
            case 7:
                System.out.println("July's birthstone is Ruby");
                break;
            case 8:
                System.out.println("August's birthstone is Peridot");
                break;
            case 9:
                System.out.println("September's birthstone is Sapphire");
                break;
            case 10:
                System.out.println("October's birthstone is Opal");
                break;
            case 11:
                System.out.println("November's birthstone is Topaz");
                break;
            case 12:
                System.out.println("December's birthstone is Turquoise");
                break;
            default:
                System.out.println("I think you must be confused, " + number + " doesn't match a month.");
        }
    }

    public void triviaNight() {
        int userAns1, userAns2, userAns3, correctAns1 = 4, correctAns2 = 2, correctAns3 = 3, tally = 0;
        String userAns1String, userAns2String, userAns3String;

        Scanner input = new Scanner(System.in);

        System.out.print("It's TRIVIA NIGHT! Are you ready?!\n");

        System.out.println("FIRST QUESTION!");
        System.out.println("What is the Lowest Level Programming Language?");
        System.out.println("1) Source Code\n2) Assembly Language\n3) C#\n4) Machine Code");
        System.out.print("YOUR ANSWER: ");
        userAns1String = input.nextLine();
        userAns1 = Integer.parseInt(userAns1String);

        if(userAns1 == correctAns1) {
            tally++;
            System.out.println("Correct Answer! Score: " + tally + "/1");
        } else
            System.out.println("Inorrect Answer! Score: " + tally + "/1");


        System.out.println("SECOND QUESTION!");
        System.out.println("Website Security CAPTCHA Forms Are Descended From the Work of?");
        System.out.println("1) Grace Hopper\n2) Alan Turing\n3) Charles Babbage\n4) Larry Page");
        System.out.print("YOUR ANSWER: ");
        userAns2String = input.nextLine();
        userAns2 = Integer.parseInt(userAns2String);

        if(userAns2 == correctAns2) {
            tally++;
            System.out.println("Correct Answer! Score: " + tally + "/2");
        } else
            System.out.println("Inorrect Answer! Score: " + tally + "/2");

        System.out.println("LAST QUESTION!");
        System.out.println("Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?");
        System.out.println("1) Serenity\n2) The Battlestar Galactica\n3) The USS Enterprise\n4) The Millennium Falcon");
        System.out.print("YOUR ANSWER: ");
        userAns3String = input.nextLine();
        userAns3 = Integer.parseInt(userAns3String);

        if(userAns3 == correctAns3) {
            tally++;
            System.out.println("Correct Answer! Score: " + tally + "/3");
        } else
            System.out.println("Inorrect Answer! Score: " + tally + "/3");

        if(tally == 3) System.out.println("Awesome, all questions correct!");
        else if(tally > 0) System.out.printf("You did ok, but didn't get them all.");
        else System.out.println("No Questions Correct");
    }

    public void knockKnock() {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

        if(nameGuess.equals("Marty McFly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future.");
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }

    public void pickyEater() {
        Scanner userInput = new Scanner(System.in);

        System.out.print("How many times has it been fried? (#) ");
        int timesFried = Integer.parseInt(userInput.nextLine());

        System.out.print("Does it have any spinach in it? (y/n) ");
        String hasSpinach = userInput.nextLine();

        System.out.print("Is it covered in cheese? (y/n) ");
        String cheeseCovered = userInput.nextLine();

        System.out.print("How many pats of butter are on top? (#) ");
        int butterPats = Integer.parseInt(userInput.nextLine());

        System.out.print("Is it covered in chocolate? (y/n) ");
        String chocolatedCovered = userInput.nextLine();

        System.out.print("Does it have a funny name? (y/n) ");
        String funnyName = userInput.nextLine();

        System.out.print("Is it broccoli? (y/n) ");
        String isBroccoli = userInput.nextLine();

        // Conditionals should go here! Here's the first one for FREE!

        if (hasSpinach.equals("y") || funnyName.equals("y")) {
            System.out.println("There's no way he'll eat that!");
        }
        if(timesFried == 3 && chocolatedCovered.equalsIgnoreCase("Y")) System.out.println("Oh, it's like a deep-fried Snickers. That'll be a hit!");
        if(timesFried == 2 && cheeseCovered.equalsIgnoreCase("Y")) System.out.println("Mmm. Yeah, he'll each fried cheesy doodles.");
        if(isBroccoli.equalsIgnoreCase("Y") && butterPats == 6 && cheeseCovered.equalsIgnoreCase("Y")) System.out.println("As long as the green is hidden by cheddar, it'll happen!");
        else if(isBroccoli.equalsIgnoreCase("Y")) System.out.println("Oh, green stuff like that might as well go in the bin.");

    }

    public void fieldDay() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What's your last name? ");
        String surname = userInput.nextLine();

        if(surname.compareToIgnoreCase("Baggins") < 0 ) System.out.println("Aha! You're on the team \"Red Dragons\"!");
        if(surname.compareToIgnoreCase("Baggins") > 0 && surname.compareToIgnoreCase("Dresden") < 0 ) System.out.println("Aha! You're on the team \"Dark Wizards\"!");
        if(surname.compareToIgnoreCase("Dresden") > 0 && surname.compareToIgnoreCase("Howl") < 0 ) System.out.println("Aha! You're on the team \"Moving Castles\"!");
        if(surname.compareToIgnoreCase("Howl") > 0 && surname.compareToIgnoreCase("Potter") < 0 ) System.out.println("Aha! You're on the team \"Golden Snitches\"!");
        if(surname.compareToIgnoreCase("Potter") > 0 && surname.compareToIgnoreCase("Vimes") < 0 ) System.out.println("Aha! You're on the team \"Night Guards\"!");
        if(surname.compareToIgnoreCase("Vimes") > 0 ) System.out.println("Aha! You're on the team \"Black Holes\"!");

        System.out.println("Goodluck in the Games!");
    }

    public void miniZork() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) { }
        } else if (action.equals("go to the house")) { }
    }

}
