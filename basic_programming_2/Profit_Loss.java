import java.util.Scanner;
class Profit
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the cost price:");
		int cp = input.nextInt();
	    System.out.println("Enter the selling price:");
		int sp= input.nextInt();
		int pro = sp - cp;
		double per = (pro/cp)*100;
		System.out.println("Total profit and loss:" + pro);
		System.out.println("Total profit and loss percentage:" + per);
	}
}