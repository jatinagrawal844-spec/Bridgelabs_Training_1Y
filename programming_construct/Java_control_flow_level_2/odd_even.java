import java.util.Scanner;
class OddEven
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any natural number:");
		int a = input.nextInt();
		if(a <=0)
		{
			System.out.println("Not a Natural number");
		}
		else
		{
			System.out.println("Odd number between 1 and" + a + ": ");
			for(int i=1; i<=a; i++)
			{
				if(i%2!=0)
				{
				System.out.println(i);
			    }
			}
			System.out.println("Even number between 1 and" + a + ": ");
			for(int j=1; j<=a; j++)
			{
				if(j%2==0)
				{
				System.out.println(j);
			    }
			}
		}
	}
}