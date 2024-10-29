import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        boolean yesNo;
        boolean done = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item", .50, 10);
            totalPrice += itemPrice;
            yesNo = SafeInput.getYNConfirm(in, "Do you have another item?");

            if (yesNo)
            {
                done = false;
            }
            else
            {
                done = true;
            }
        }while(!done);

        System.out.printf("Your total is: $%.2f\n", totalPrice);
    }
}
