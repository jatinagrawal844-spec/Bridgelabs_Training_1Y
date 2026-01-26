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
			int i =1;
			System.out.println("Factor of " + a + " is : ");
			while(i <= a)
			{
				if(a%i==0)
				{
					System.out.println(i);
				}
				i++;
			}
		}
	}
}