import java.util.Scanner;
class Natural
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = input.nextInt();
		if(n <= 0)
		{
			System.out.println("Not a Natural Number");
		}
		else
		{
			System.out.println("its a Natural Number");
			int sum = n * (n+1) /2;
		    System.out.println("Sum of n Natural number with formula is:" +sum);
		}
		int SUM =0;
		for(int i = n; i>0; i--)
		{
			SUM = SUM + i;
		}
		System.out.println("Sum of n Natural number with for loop is:" + SUM);
	}
}