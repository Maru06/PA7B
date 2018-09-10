import java.util.Scanner;
public class Ejercicio7{
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   double CM, PG;
   System.out.println("Introduce los metros requeridos:");
   CM=sc.nextDouble();
   PG = CM/2.54;
   System.out.println("las pulgadas equivalentes son igual a:"+ PG);
 }
}
