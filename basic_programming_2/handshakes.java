import java.util.Scanner;
class Handshakes
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of student:");
		int s = input.nextInt();
		int c = s * (s-1) /2;
		System.out.println("Total number of handshakes:" + c);
	}
}