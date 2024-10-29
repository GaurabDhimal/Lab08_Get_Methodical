import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String MNumber = "";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN is: " + SSN);

        MNumber = SafeInput.getRegExString(in, "Enter your MNumber", "^(M|m)\\d{5}$");
        System.out.println("Your MNumber is: " + MNumber);

        menuChoice = SafeInput.getRegExString(in, "Choose an option", "^[OoSsVvQq]$");
        System.out.println("You chose: " + menuChoice);

    }
}
