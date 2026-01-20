import java.util.Scanner;
class Yards
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter distance in feets:");
		double f = input.nextDouble();
		double y = f/3;
		double m = f/(3*1760);
		System.out.println("Distance in yards:" + y);
		System.out.println("Distance in miles:" + m);
	}
}
		
		