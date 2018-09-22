import java.util.Scanner;
public class ValorMayor{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int A, B, M;
    System.out.println("Ingrese el primer . valor:");
    A = input.nextInt();
    System.out.println("Ingrese el segundo valor:");
    B = input.nextInt();
    if (A > B)
      M = A;
    else{
      M = B;
    }
    System.out.println("El valor mayor es: " + M);
  }
}
