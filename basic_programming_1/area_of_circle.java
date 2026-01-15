import java.util.Scanner;
class area
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int r=input.nextInt();
		double pi=3.14;
		double area = r*r*pi;
		System.out.println("Area of circle is:"+ area);
	}
}