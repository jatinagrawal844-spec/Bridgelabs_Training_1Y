import java.util.Scanner;
class Square
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the perimeter of square:");
		double p = input.nextDouble();
		double s = p/4;
		System.out.println("The length of the side is: " +s);
		System.out.println("whose perimeter is: "+p);
	}
}