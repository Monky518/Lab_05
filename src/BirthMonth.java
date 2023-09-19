import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        //A program that asks the user to enter their birth month (integer 1 – 12 inclusive)
        //If the user enters a value in range, the program echoes the input (“Your birth month is: N”)
        //If the value is not in the range it outputs an error msg (“You entered an incorrect month value: N”)
        //Here N should be the value they entered

        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        boolean validInput = false;
        String trash = "";

        do //checks valid int input
        {
            System.out.print("Input your birth month initial [1 - 12]: ");
            if(in.hasNextInt())
            {
                //checks for valid int input, and then throws away empty last line
                birthMonth = in.nextInt();
                in.nextLine();

                validInput = true;
                if (!(birthMonth >= 1 && birthMonth <= 10))
                {
                    System.out.println("You entered out of range, you typed: " + birthMonth);
                    validInput = false;
                }
            }
            else
            {
                //invalid int input, why trash is a string and not an int
                trash = in.nextLine();
                System.out.println("You entered incorrectly, you typed: " + trash);

                validInput = false;
            }
        }
        while(!validInput);

        //successfully went past both checks
        System.out.println("Your birth month is: " + birthMonth);
    }
}
