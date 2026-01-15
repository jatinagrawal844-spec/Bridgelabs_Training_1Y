import java.util.Scanner;
class Triangle
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter base of triangle:");
		int b = input.nextInt();
		System.out.println("Enter height of triangle:");
		int h = input.nextInt();
		double a = 1*b*h/2;
		System.out.println("Area of triangle is:" + a);
	}
}
		
		