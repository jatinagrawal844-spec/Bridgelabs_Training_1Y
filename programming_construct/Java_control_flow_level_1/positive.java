import java.util.Scanner;
class Positive
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = input.nextInt();
		if(n<0)
		{
			System.out.println("Negative Number");
		}
		else if(n>0)
		{
			System.out.println("Positive Number");
		}
		else
		{
			System.out.println("its Zero");
		}
	}
}