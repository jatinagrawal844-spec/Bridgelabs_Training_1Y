import java.util.Scanner;
class Item
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the unit price:");
		double u = input.nextDouble();
		System.out.println("Enter the quantity:");
		double q = input.nextDouble();
		double t = u * q;
		System.out.println("Total bill:" + t);
	}
}