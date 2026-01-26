import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number:");
		int a = input.nextInt();
		for(int i=1; i<=10; i++)
		{
			//m = i *a;
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}
}