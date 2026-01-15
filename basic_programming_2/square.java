import java.util.Scanner;
class Square
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the perimeter of square:");
		double p = input.nextDouble();
		double s = p/4;
		System.out.println("side of square is:" + s);
	}
}