import java.util.Scanner;

class BMI
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kg:");
        double weight = input.nextDouble();

        System.out.println("Enter height in cm:");
        double heightCm = input.nextDouble();
		
        double heightM = heightCm / 100;

        double bmi = weight / (heightM * heightM);
		
        String status;
        if (bmi <= 18.4)
        {
            status = "Underweight";
        }
        else if (bmi <= 24.9)
        {
            status = "Normal ";
        }
        else if (bmi <= 39.9)
        {
            status = "Overweight";
        }
        else
        {
            status = "Obese";
        }

        System.out.println("BMI = " + bmi);
        System.out.println("Weight Status = " + status);
    }
}
