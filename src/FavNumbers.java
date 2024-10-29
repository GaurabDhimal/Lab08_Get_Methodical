import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in, "Enter you favorite number");
        favDouble = SafeInput.getDouble(in, "Enter you favorite double");
        System.out.println("\n Your favorite number is " + favInt + " and your favorite double is " + favDouble);

    }

}
