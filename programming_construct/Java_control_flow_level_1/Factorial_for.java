import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any positive number:");
		int a = input.nextInt();
		int fac = 1;
		if(a>0)
		{
		for(int i =a; i>0; i--)
		{
			fac = fac * i;
		}
		System.out.println("Factorial of a number is:" + fac);
		}
		else
		{
			System.out.println("Number is not positive");
		}
	}
}
			