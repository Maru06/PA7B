import java.util.Scanner;
public class ComputeBMI{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      final double KILOGRAMS_PER_POUND = 0.45359200004704;
      final double METERS_PER_INCH = 0.0254;
    System.out.println("enter weight in pounds");
    double weight=input.nextDouble();
    System.out.println("enter height in inches");
    double height=input.nextDouble();

double weightInKilograms = weight * KILOGRAMS_PER_POUND;
double heightInMeters = height * METERS_PER_INCH;
//double bmi = weightInKilograms/  (heightInMeters * heightInMeters);//
double bmi = weightInKilograms/Math.pow (heightInMeters,2);
System.out.println("Your BMI is "+ bmi);
if (bmi <16)
System.out.println("your are seriously underweight");
else if( bmi<18)
System.out.println("your are underweight");
else if (bmi< 24)
System.out.println("your are normal weight");
else if (bmi <29)
System.out.println("your are  overweight");
else if (bmi<35)
System.out.println("your are seriously overweight");
else
System.out.println("your are  gravely overweight");
}

}
