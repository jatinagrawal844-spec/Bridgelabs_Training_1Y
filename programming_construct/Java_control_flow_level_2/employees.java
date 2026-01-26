import java.util.Scanner;
class Employees
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Salary of employees ansd year:");
		int s = input.nextInt();
		int y = input.nextInt();
		int b = 0;
		if(y<=5)
		{
			System.out.println("No bonus for you");
		}
		else
		{
			b = s * 5 /100;
			System.out.println("You got 5% bonus:" +b);
		}
		int t = s+b;
		System.out.println("Total Salary you get:" + t);
	}
}	
			