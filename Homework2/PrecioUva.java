import java.util.Scanner;
public class PrecioUva{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String TI;
    int TA, K;
    double P, GA;
    System.out.println("Ingrese el tipo de tamaño de la uva: ");
    TI = input.next();
    if (TI =="A") {
      if (TA = 1) {
        P = P + 0.20;
      }else{
        P = P + 0.30;
      }
    }else if (TA = 1) {
      P = P - 0.30;
    }else{
      P = P - 0.50;
    }
    GA = P * K;
    System.out.println("La ganancia es: " + GA);
  }
}
