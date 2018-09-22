import java.util.Scanner;
public class CantidadesMayor{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int A, B, C, Mayor;
    System.out.println("Ingrese el primer numero");
    A = input.nextInt();
    System.out.println("Ingrese el segundo numero");
    B = input.nextInt();
    System.out.println("Ingrese el tercer numero");
    C = input.nextInt();
    if (A > B) {
      if (A > C) {
        Mayor = A;
      }else{
        Mayor = C;
      }
    }else{
      if (B > C) {
        Mayor = B;
      }else{
        Mayor = C;
      }
    }
    System.out.println("El numero mayor es: " + Mayor);
  }
}
