import java.util.Scanner;
class Season
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter month number:");
		int month = input.nextInt();
		System.out.println("Enter day number:");
		int day = input.nextInt();
		if(month==3)
		{
			if(day>=20 && day<=31)
			{
				System.out.println("Spring Season");
			}
		}
		else if(month==6)
		{
			if(day>=1 && day<=20)
			{
				System.out.println("Spring Season");
			}
		}
		else if (month>3 && month<6)
		{
			if(day>=1 && day<=31)
			{
			System.out.println("Spring Season");
			}
		}
		else 
		{
			System.out.println("Not a Spring Season");
		}
	}
}