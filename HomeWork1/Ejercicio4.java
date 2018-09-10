import java.util.Scanner;
public class Ejercicio4{
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   double B,H,C,AT,AC, area;
   System.out.println("Introduce la base del triangulo-rectangulo:");
   B=sc.nextDouble();
   System.out.println("Introduce la hipotenusa del triangulo-rectangulo:");
   H=sc.nextDouble();
   C = Math.SQRT ((B*B - H*H));
   System.out.println("el cateto faltante es igual a:"+ C);
 }
}
