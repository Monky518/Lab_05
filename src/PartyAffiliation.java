import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        //A program that prompts the user for their party affiliation (Democrat, Republican, or Independent)
        //Responds accordingly with a Donkey, Elephant, Person, or Other
        //Notes: create a menu so the user chooses D, R, or I and assume that any other choice will be *Other*
        //Tests: just the four options D, R, I, Other. Use as cascaded if structure not separate if statements!

        Scanner in = new Scanner(System.in);
        String partyAff;
        boolean validInput;

        do //checks for valid input
        {
            //get rid of ln in "println" to have the user write in the same line
            System.out.print("Enter your party affiliation [D R I]: ");
            partyAff = in.nextLine();

            if (partyAff.equals("D") || partyAff.equals("d"))
            {
                System.out.println("You are a Democratic Donkey!");
                validInput = true;
            }
            else if (partyAff.equals("R") || partyAff.equals("r"))
            {
                System.out.println("You are a Republican Elephant!");
                validInput = true;
            }
            else if (partyAff.equals("I") || partyAff.equals("i"))
            {
                System.out.println("You are an Independent Person!");
                validInput = true;
            }
            else
            {
                System.out.println("You incorrectly entered: " + partyAff);
                validInput = false;
            }
        }
        while(!validInput);
    }
}
