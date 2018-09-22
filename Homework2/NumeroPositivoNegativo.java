import java.util.Scanner;
public class NumeroPositivoNegativo{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int NUM;
    String R;
    System.out.println("enter a number: ");
    NUM = input.nextInt();
    if (NUM >= 0) {
      R = "POSITIVE";
    }else{
      R = "NEGATIVE";
    }
    System.out.println("El numero es: " + R);
  }
}
