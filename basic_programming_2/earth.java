import java.util.Scanner;
class Earth
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of Earth in Km:");
		double r = input.nextDouble();
		double rM = r * 1.6;
		double Vkm = 4 * 3.14 * r * r * r/3;
		double Vm = 4 * 3.14 *rM * rM * rM/3;
		System.out.println("Volume of Earth in cubic Km:" + Vkm);
        System.out.println("Volume of Earth in cubic Miles:" + Vm);
	}
}
	