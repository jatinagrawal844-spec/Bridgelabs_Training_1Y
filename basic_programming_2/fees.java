import java.util.Scanner;
class fees
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Total fee to pay:");
		int f = input.nextInt();
		System.out.println("Enter the discount percentage:"); 
		int d = input.nextInt();
	    int dis = d * f/100;
	    int pay = f - dis;
		System.out.println("Total fees to pay:" + pay);
		System.out.println("Total discount get:" + dis);
	}
}