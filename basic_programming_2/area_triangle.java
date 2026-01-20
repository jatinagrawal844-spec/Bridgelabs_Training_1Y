import java.util.Scanner;
class Triangle
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base of triangle in Cm:");
		double b = input.nextDouble();
        System.out.println("Enter the height of triangle in Cm:");
		double h = input.nextDouble();
		double A = 1*b*h/2;
		double bi = b / 2.54;
		double hi = h / 2.54;
		double Ai = 1*bi*hi/2;
		System.out.println("Area of triangle in sq Cm:" + A);
		System.out.println("Area of triangle in sq In:" + Ai);
	}
}