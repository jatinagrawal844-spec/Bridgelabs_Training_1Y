import java.util.Scanner;
class Sam 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter marks in maths:");
		int maths = input.nextInt();
		System.out.println("Enter marks in physics:");
		int physics = input.nextInt();
		System.out.println("Enter marks in chemistry:");
		int chemistry = input.nextInt();
		int avreage = (maths + physics + chemistry) / 3;
		System.out.println("avreage marks of sam is:" + avreage);
	}
}
		
		