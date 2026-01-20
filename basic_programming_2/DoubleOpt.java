import java.util.Scanner;
class IntOperation
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 number:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = a+b*c;
		double e = a*b+c;
		double f = c+a/b;
		double g = a%b+c;
		System.out.println("Answer of a+b*c: " +d + " a*b+c: " +e+ " c+a/b: " +f+ " a%b+c: " +g);
	}
}
