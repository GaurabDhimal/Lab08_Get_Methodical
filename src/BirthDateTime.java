import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(in,"Enter your birth year", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in,"Enter your birth month", 1, 12);


        switch (birthMonth)
        {
            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = SafeInput.getRangedInt(in,"Enter your birth day", 1, 30);
                break;
            case 2:
                birthDay = SafeInput.getRangedInt(in,"Enter your birth day", 1, 29);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                birthDay = SafeInput.getRangedInt(in,"Enter your birth day", 1, 31);
        }

        birthHour = SafeInput.getRangedInt(in,"Enter your birth hour", 0, 23);
        birthMinute = SafeInput.getRangedInt(in,"Enter your birth minute", 1, 59);
        System.out.println("You were born on the " + birthDay + " day of the " + birthMonth + " month in the year " + birthYear + " on the " + birthHour + " hour and " + birthMinute + " minute.");
    }
}
