import java.util.Scanner;
class simple
{
	public static void main(String args[])
	{
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter principal ammount:");
      int p=input.nextInt();
	  System.out.println("Enter rate of interest:");
      int r=input.nextInt();
	  System.out.println("Enter time of interest:");
      int t=input.nextInt();
	  double s=p*r*t/100;
	  System.out.println("simple intrest is:" +s);
	}
}
	  