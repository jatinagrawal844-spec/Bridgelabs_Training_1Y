import java.util.Scanner;

class GreatestFactor
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        int n = input.nextInt();

        if (n <= 1)
        {
            System.out.println("No factor exists");
        }
        else
        {
            int i = n / 2;

            while (i >= 1)
            {
                if (n % i == 0)
                {
                    System.out.println("Greatest factor besides itself is: " + i);
                    break;
                }
                i--;
            }
        }
    }
}
