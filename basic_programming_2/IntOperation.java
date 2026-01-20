import java.util.Scanner;
class IntOperation
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 number:");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = a+b*c;
		int e = a*b+c;
		int f = c+a/b;
		int g = a%b+c;
		System.out.println("Answer of a+b*c: " +d + " a*b+c: " +e+ " c+a/b: " +f+ " a%b+c: " +g);
	}
}
