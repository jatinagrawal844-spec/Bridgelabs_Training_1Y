import java.util.Scanner;
class Student
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter number of student:");
		int student = input.nextInt();
		System.out.println("Enter number of pens:");
		int pen = input.nextInt();
		int que = pen/student;
		int rem = pen%student;
		System.out.println("Equal number of pen given to each student:" + que);
		System.out.println("Number of pen left:" + rem);
	}
}
		