import java.util.Scanner;
class addition
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a= input.nextInt();
		System.out.println("Enter 2nd number:");
		int b= input.nextInt();
		int sum = a+b;
		System.out.println("Addition of two number:"+sum);
	}
}