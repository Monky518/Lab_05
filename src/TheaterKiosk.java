import java.util.Scanner;

public class TheaterKiosk
{
    public static void main(String[] args)
    {
        //As people pass through an entry kiosk at the theater, they are prompted to enter their age
        //If they are 21 or older, they get a paper wristband
        //Code a logic program that asks the user to enter their age and then if they are 21 or over displays a  message that they get a wristband
        //(Note that the program does nothing if they are not 21 or over…)

        Scanner in = new Scanner(System.in);
        int age;
        String trash;
        boolean validInput;

        do //check user input
        {
            System.out.print("Enter your age: ");
            if(in.hasNextInt())
            {
                age = in.nextInt();
                in.nextLine(); //clear the newLine from the buffer after reading a number
                validInput = true;

                if (age >= 21)
                {
                    System.out.println("You get a wristband!");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered incorrectly, you typed: " + trash);
                validInput = false;
            }
        }
        while(!validInput);
    }
}
