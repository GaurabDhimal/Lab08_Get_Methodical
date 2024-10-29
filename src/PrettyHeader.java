public class PrettyHeader
{

    public static void prettyHeader(String msg)
    {
        int headerWidth = 60;
        int sideBorderWidth = 3;

        for (int i = 0; i < headerWidth; i++) // Print the top border
        {
            System.out.print("*");
        }
        System.out.println();

        int messageLength = msg.length(); // Calculate spaces needed to center the message
        int padding = (headerWidth - messageLength - (sideBorderWidth * 2)) / 2;

        // Print the middle row with centered message
        System.out.print("***"); // Left side border
        for (int i = 0; i < padding; i++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < padding; i++)
        {
            System.out.print(" ");
        }
        System.out.println("***"); // Right side border

        for (int i = 0; i < headerWidth; i++) // Print the bottom border
        {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        prettyHeader("Message Centered Here");
    }
}
