import java.util.Scanner;
public class Ejercicio4{
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   double B,H,C,AT,AC, area;
   System.out.println("Introduce la base del triangulo-rectangulo:");
   B=sc.nextDouble();
   System.out.println("Introduce la hipotenusa del triangulo-rectangulo:");
   H=sc.nextDouble();
   C = Math.sqrt (B*B - H*H);
    AC = (3.1416*(H*H)/2);

   AT = (C*H/2)*2;

  area = AC+AT;

   System.out.println("El area de la figura es: "+ area);
 }
}
