import java.util.Scanner;
public class PagoLapices{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int X;
    double PAG;
    System.out.println("Ingrese la cantidad de lapices: ");
    X = input.nextInt();
    if (X >= 1000)
      PAG = X * 0.85;
    else
      PAG = X * 0.90;
    
    System.out.println("El total de pago es: " + PAG);
  }
}
