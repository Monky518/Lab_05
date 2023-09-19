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

        do
        {
            do //checks valid int input
            {
                System.out.print("Input your birth month initial [1 - 12]: ");
                if(in.hasNextInt())
                {
                    //checks for valid int input, and then throws away empty last line
                    birthMonth = in.nextInt();
                    in.nextLine();

                    validInput = true;
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

            //reset validInput before running again
            validInput = false;

            //checks valid int in range
            if (birthMonth >= 1 && birthMonth <= 10)
            {
                //valid birth month input
                validInput = true;
                System.out.println("Your birth month is: " + birthMonth);
            }
            else
            {
                //invalid birth month input
                validInput = false;
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        }
        while (!validInput);
    }
}
