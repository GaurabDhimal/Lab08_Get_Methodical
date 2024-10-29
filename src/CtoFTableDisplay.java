public class CtoFTableDisplay
{
    public static void main(String Args[])
    {
            System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit"); // Table header
            System.out.println("------------------------");

            for (int celsius = -100; celsius <= 100; celsius++)
            {
                double fahrenheit = celsius * 9.0 / 5.0 + 32;
                System.out.printf("%-10d %-10.2f%n", celsius, fahrenheit);
            }
    }
}
