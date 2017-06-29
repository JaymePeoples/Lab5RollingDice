import java.util.Scanner;

/**
 * Created by Jayme Peoples on 6/29/2017.
 */
public class Lab5RollingDice {
    public static void main(String[] args) {

        int sides;
        String userChoice = " ";
        Scanner scnr = new Scanner(System.in);


        do {
            System.out.println("How many sides should each die have?"); //Prompt user to enter number of sides for a pair of dice
            while (!scnr.hasNextInt()) {//input in scanner is not int
                System.out.println("Oops, please enter a number.");
                scnr.next(); //gives another chance to enter a number
            }
            sides = scnr.nextInt();
            System.out.println("Please roll dice: "); //Prompt user to roll dice
            System.out.println((int) (Math.random() * sides + 1)); //Must simulate rolling dice
            System.out.println((int) (Math.random() * sides + 1)); //"Roll" two n-sided dice
            //Display the results of each
            System.out.println("Would you like to roll again? (y/n)");
            userChoice = scnr.next();
        }
        while (userChoice.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing.");
        }

    }



