import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        //An application program where the user enters the price of an item and the program computes shipping costs
        //If the item price is $100 or more, then shipping is free otherwise it is 2% of the price
        //The program should output the shipping cost and the total price

        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingFee = 1.02;
        double finalPrice = 0;
        String trash = "";
        boolean validInput = false;

        do //checks valid input
        {
            System.out.print("Enter the item price: ");
            if(in.hasNextDouble())
            {
                itemPrice = in.nextDouble();
                in.nextLine(); //clear the newLine from the buffer after reading a number
                validInput = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered incorrectly, you typed: " + trash);
                validInput = false;
            }
        }
        while(!validInput);

        if (itemPrice >= 100)
        {
            finalPrice = itemPrice * shippingFee;
        }
        else
        {
            finalPrice = itemPrice;
        }

        System.out.println("Your final price is " + finalPrice);
    }
}
