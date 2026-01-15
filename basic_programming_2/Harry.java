import java.util.Scanner;
class Harry
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the birth Year:");
		int birthYear = input.nextInt();
		System.out.println("Enter the current Year:");
		int currentYear= input.nextInt();
		int age = currentYear - birthYear;
		System.out.println("Age of harry is:" + age);
	}
}

		