import java.util.Scanner;
public class Ejercicio3{
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   double AT,AR, area,B,A,C;
   System.out.println("Introduce la base de la forma A:");
   B = sc.nextDouble();
   System.out.println("Introduce la altura de la forma A:");
   A = sc.nextDouble();
   System.out.println("Introduce la altura del rectangulo:");
   C = sc.nextDouble();
   AT = (B * (A - C) )/2;
   System.out.println("el area del triangulo es:"+ AT);
   AR = B * C;
   System.out.println("el area del rectangulo es:"+ AR);
   area = AT + AR;
   System.out.println("el area total de la figura es:"+ area);


 }

 }
