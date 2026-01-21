import java.util.Scanner;
class Vote
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = input.nextInt();
		if(age >= 18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("you can not vote");
		}
	}
}