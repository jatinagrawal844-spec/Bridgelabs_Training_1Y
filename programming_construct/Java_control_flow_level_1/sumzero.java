import java.util.Scanner;
class SumUntilZero
 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double value;
        System.out.print("Enter a number : ");
        value = sc.nextDouble();
        while (true) 
		{
			if(value <=0)
			{
				break;
			}
            total = total + value;
            System.out.print("Enter a number : ");
            value = sc.nextDouble();
        }
        System.out.println("Total value = " + total);
    }
}
