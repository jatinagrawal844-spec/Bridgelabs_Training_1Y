import java.util.Scanner;
class FizzBuzz
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter positive number:");
		int a = input.nextInt();
		if(a<=0)
		{
			System.out.println("Not positive number");
		}
		else 
		{
			int i = 1;
			while(i <= a)
			{
				if(i%3==0 && i%5==0)
				{
					System.out.println("FizzBuzz");
				}
				else if(i%3==0)
				{
					System.out.println("Fizz");
				}
				else if(i%5==0)
				{
					System.out.println("Buzz");
				}
				else
				{
					System.out.println(i);
				}
				i++;
			}
		}
	}
}