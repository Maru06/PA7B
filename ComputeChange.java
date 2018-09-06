import java.util.Scanner;
public class ComputeChange{
  public static void main(String[] args) {
    //
    Scanner input = new Scanner(System.in);
    System.out.println("enter an amount in double");
    double amount = input.nextDouble();
    int cents = (int)(amount * 100);
    int numberOfDollars = cents / 100;
    cents = cents % 100;
    //find the quarters
    int numberOfQuarters = cents / 25;
    cents =  cents % 25;
    // number of dimes
    int numberOfDimes = cents /10;
    cents =cents % 10;

    int numberOfNickels = cents /5;
    cents = cents % 5;

    int numberOfPennies =cents;

    System.out.println("your amount"+ amount + "consist of \n" +
     "\t" + numberOfDollars + "dollars" +
     "\t" + numberOfQuarters + "Quarters" +
     "\t" + numberOfDimes + "dimes" +
     "\t" + numberOfNickels + "nickels" +
     "\t" + numberOfPennies + "pennies");

  }
}
