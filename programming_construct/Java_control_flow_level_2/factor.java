import java.util.Scanner;
class Factor
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a natural number:");
		int a = input.nextInt();
		if(a<=0)
		{
			System.out.println("Not a natural number");
		}
		else 
		{
			System.out.println("Factor of " + a + " is : ");
			for(int i=1; i<=a; i++)
			{
				if(a%i==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}