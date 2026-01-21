import java.util.Scanner;
class Countdown
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for countdown:");
		int c = input.nextInt();
		while(c >= 1)
		{
			System.out.println(c);
			c--;
		}
		System.out.println("Rocket launch");
	}
}