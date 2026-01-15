import java.util.Scanner;
class Kliometer
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter distance in KM:");
		double k = input.nextInt();
		double m = k * 1.6;
		System.out.println("Distance in miles:" +m);
	}
}