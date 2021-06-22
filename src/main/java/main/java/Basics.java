package main.java;

public class Basics {

    public static void main(String[] args) {
        Basics QueenB = new Basics();
//        QueenB.ABeginning();
//        QueenB.ProjectGutenberg();
//        QueenB.CommentingCode();
        QueenB.AllTheMaths();

    }


    public void ABeginning() {
        System.out.println("Hello World!");
        System.out.println("Hello from the Guild!");
        System.out.println("Typing code is easier than I thought ...");
        System.out.println("Typity Typity Type!");
        System.out.println("After I finish typing,");
        System.out.println("I'll compile my code.");
        System.out.println("And then when I run it,");
        System.out.println("The console will print out all my brilliant words!");
        System.out.println("And it all starts with 'Hello World!' ..");
    }

    private void ProjectGutenberg() {
        System.out.print("Did you know that in 1440 (or thereabouts), ");
        System.out.println("Johannes Gutenberg invented the printing press?");
        System.out.println("He started out as a goldsmith!");
        System.out.print("His invention made it easy to print and ");
        System.out.println("distribute books to anyone who wanted one.");
        System.out.print("We are like a modern Gutenberg, ");
        System.out.println("printing vast amounts to the waiting console with ease.");
    }

    private void CommentingCode() {
        // Comments are written to explain code in an easily
        // understandable way
        // Basically for single lines
        // anything after // is considered a comment
        System.out.println("Normal code is compiled and runs ...");
        System.out.println("Comments however ... ");// do not execute!

        // Comments can be on their own line
        System.out.println("..."); // or they can share like this

        // However if you put the // BEFORE a line of code
        // System.out.println("Then it is considered a comment");
        // System.out.println("and it won't execute!");

        /*
               This is an example of a multi-line comment, which is useful if
               you want to comment out multiple lines of code quickly.
               Console.WriteLine("Java ignores everything inside the comment markers.");
        */
    }

    private void AllTheMaths() {
        System.out.print("1 + 2 is: ");
        System.out.println(1 + 2);

        System.out.print("42001 modulus 5 is: ");
        System.out.println(42001 % 5);

        System.out.print("5565.0 divided by 22.0 is : ");
        System.out.println(5565.0 / 22.0);

        System.out.print("223 times 31 - 42: ");
        System.out.println(223 * 31 - 42);

        System.out.print("Is 4 greater than -1? ");
        System.out.println(4 > -1);

        System.out.println("\n****** Now make the computer do some harder math!");

        System.out.print("8043.52 minus 4.2 plus 23.0 divided by 56.0 times -76.13 is: ");
        System.out.println(8043.52 - 4.2 + 23.0 / 56.0 * -76.13);

        System.out.print("11111 modulus 3 minus 67 minus 1 plus 9 is: ");
        System.out.println(11111%3 - 67 - 1 + 9);

        System.out.print("44 minus 22 plus 11 minus 66 minus 88 plus 76 minus 11 minus 33 is : ");
        System.out.println(44 - 22 + 11 - 66 - 88 + 76 - 11 - 33);

        System.out.print("22 times 3 minus 1 plus 4 times 6 minus -9 is : ");
        System.out.println(22 * 3 - 1 + 4 * 6 - (-9));

        System.out.print("Is 67 greater than 4 * 5? ");
        System.out.println(67 > (4*5));

        System.out.print("Is 78 less than 4 * 5? ");
        System.out.print(78 < (4*5));
    }

}
