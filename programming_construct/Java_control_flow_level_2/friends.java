import java.util.Scanner;
class Friends
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the age of 3 friend:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.println("Enter the heigth of 3 friend:");
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		if(a<b && a<c)
		{
			System.out.println("Friend One is youngest");
		}
		else if(b<a && b<c)
		{
			System.out.println("Friend Two is youngest");
		}
		else
		{
			System.out.println("Friend Three is youngest");
		}
		if(d>e && d>f)
		{
			System.out.println("Friend One is tallest");
		}
		else if(e>d && e>f)
		{
			System.out.println("Friend Two is tallest");
		}
		else
		{
			System.out.println("Friend Three is tallest");
		}
	}
}
			
