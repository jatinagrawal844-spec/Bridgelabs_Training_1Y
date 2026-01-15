import java.util.Scanner;
class cylinder
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius:");
		int r= input.nextInt();
		System.out.println("Enter the height:");
		int h= input.nextInt();
		double v = 3.14*r*r*h;
		System.out.println("Volume of cylinder:" +v);
	}
}
