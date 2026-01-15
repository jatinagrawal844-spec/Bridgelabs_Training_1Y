import java.util.Scanner;
class Height
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your height in Cm:");
		double h = input.nextDouble();
		double i = h / 2.54;
		double f = h / 12 / 2.54;
		System.out.println("height in inch is:" + i);
		System.out.println("height in feet is:" + f);
	}
}