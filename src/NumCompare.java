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
        String trash;
        boolean validInput;
        boolean goingBack;

        do
        {
            goingBack = false; //resetting goingBack before completing the loop

            do //first num check
            {
                System.out.print("Enter your first number: ");
                if (in.hasNextInt())
                {
                    numOne = in.nextInt();
                    in.nextLine();
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
                System.out.print("Enter your second number or reset first number [N or Back]: ");
                if (in.hasNextInt())
                {
                    numTwo = in.nextInt();
                    in.nextLine();
                    validInput = true;
                }
                else
                {
                    trash = in.nextLine();
                    if (trash.equals("Back") || trash.equals("back")) //testing if user is goingBack
                    {
                        System.out.println("Going back");
                        goingBack = true;
                        validInput = true;
                    }
                    else
                    {
                        System.out.println("You incorrectly entered: " + trash);
                        validInput = false;
                    }
                }
            }
            while(!validInput); //go past if validInput
        }
        while(goingBack); //go past if *not* goingBack

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
