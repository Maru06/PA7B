import java.util.Scanner;
public class Ejercicio8{
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   double  A, L, N, CM, PAG, V;
   System.out.println("Introduce la altura de la alberca:");
   A=sc.nextDouble();
   System.out.println("Introduce el largo de la alberca:");
   L=sc.nextDouble();
   System.out.println("Introduce el ancho de la alberca:");
   N=sc.nextDouble();
   System.out.println("Introduce el costo del metro cúbico:");
   CM=sc.nextDouble();
   V = (A * L * N);
   PAG = V * CM;
System.out.println("El pago a realizar por consumo es igual a  :"+ PAG);
}
}
