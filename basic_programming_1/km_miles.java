import java.util.Scanner;
class miles
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter distance in KM:");
		double k = input.nextInt();
		double m = k * 0.621371;
		System.out.println("Distance in miles:" +m);
	}
}