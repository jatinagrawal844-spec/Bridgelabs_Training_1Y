import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter two number: ");
	    int a = input.nextInt();
		int b = input.nextInt();
		int que = a/b;
		int rem = a%b;
		System.out.println("The quotient is " + que +
								"and Reminder is " + rem +
									"of two number " + a + 
										"and " +b);
	}
}
		