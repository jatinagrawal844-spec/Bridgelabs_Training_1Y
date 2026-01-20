import java.util.Scanner;
class Calculator
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int Add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		System.out.println("Addition: " + Add + " Subtraction: " + sub + " Multiplication: " + mul + " Division: " + div);
	}
}