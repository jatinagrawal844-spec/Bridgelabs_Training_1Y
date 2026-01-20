import java.util.Scanner;
class celsius
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter temp. in degree celsius"); 
		double c=input.nextInt();
		double f= c*9/5 + 32;
		System.out.println("degree in fahrenheit:" +f);
	}
}