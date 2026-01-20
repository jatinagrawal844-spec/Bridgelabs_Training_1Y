import java.util.Scanner;
class perimeter
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lenght of rect.:");
		int a=input.nextInt();
		System.out.println("Enter the breadth of rect.:");
		int b=input.nextInt();
		int p= 2*(a+b);
		System.out.println("perimeter of rectangel is:" +p);
	}
}