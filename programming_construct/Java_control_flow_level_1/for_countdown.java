import java.util.Scanner;
class Countdown
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number for countdown");
		int c= input.nextInt();
		for(int i=c; i>=1; i--)
		{
			System.out.println(i);
		}
		System.out.println("Rocket launch");
	}
}
