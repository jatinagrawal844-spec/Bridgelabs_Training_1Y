import java.util.Scanner;
class Average
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a = input.nextInt();
		System.out.println("Enter 2nd number:");
		int b= input.nextInt();
		System.out.println("Enter 3th number:");
		int c=input.nextInt();
		double ave = (a+b+c)/3;
		System.out.println("Average of 3 number is:" + ave);
	}
}