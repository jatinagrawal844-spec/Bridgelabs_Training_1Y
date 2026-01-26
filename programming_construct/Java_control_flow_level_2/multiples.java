import java.util.Scanner;

class Multiples
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        if (number <= 0 || number >= 100)
        {
            System.out.println("Please enter a positive number less than 100");
        }
        else
        {
            System.out.println("Multiples of " + number + " below 100:");

            for (int i = 100; i >= 1; i--)
            {
                if (i % number == 0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
