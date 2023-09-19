import java.util.Scanner;

public class NumCompare
{
    public static void main(String[] args)
    {
        //A program that takes two numbers as inputs from the user and compares them
        //It indicates if they are equal or if they are not indicates the one that is less
        //This program should be bullet-proofed
        //If either input is not a number, the program should indicate that the user should try again and terminate

        int numOne = 0;
        int numTwo = 0;
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean validInput = false;

        do //first num check
        {
            System.out.print("Enter your first number: ");
            if (in.hasNextInt())
            {
                numOne = in.nextInt();
                in.nextInt();
                validInput = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You incorrectly entered: " + trash);
                validInput = false;
            }
        }
        while(!validInput);

        do //second num check
        {
            System.out.print("Enter your second number: ");
            if (in.hasNextInt())
            {
                numTwo = in.nextInt();
                in.nextInt();
                validInput = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You incorrectly entered: " + trash);
                validInput = false;
            }
        }
        while(!validInput);

        if (numOne == numTwo)
        {
            System.out.println("Number One and Number Two are the same");
        }
        else if (numOne > numTwo)
        {
            System.out.println("Number One is greater than Number Two");
        }
        else
        {
            System.out.println("Number Two is greater than Number One");
        }
    }
}
