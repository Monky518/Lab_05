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
        String partyAff = "";
        boolean validInput = false;

        do
        {
            //get rid of ln in "println" to have the user write in the same line
            System.out.print("Enter your party affiliation [D R I]: ");
            partyAff = in.nextLine();

            if (partyAff == "D" || partyAff == "R" || partyAff == "I")
            {
                validInput = true;
            }
            else
            {
                validInput = false;
            }
        }
        while(validInput);
    }
}
