import java.util.Scanner;
class Smallest
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a + " is Largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b + " is Largest number");
		}
		else
		{
			System.out.println(c + " is Largest number");
		}
	}
}

		
		
		