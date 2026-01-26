import java.util.Scanner;

class Powers
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = input.nextInt();

        System.out.println("Enter the power:");
        int power = input.nextInt();

        if (number <= 0 || power < 0)
        {
            System.out.println("Please enter valid positive integers");
        }
        else
        {
            int result = 1;
            int counter = 0;

            while (counter < power)
            {
                result = result * number;
                counter++;
            }

            System.out.println("Result = " + result);
        }
    }
}
