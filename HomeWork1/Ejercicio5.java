import java.util.Scanner;
public class Ejercicio5{
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int L;
   double  PG,TG,GA;
   System.out.println("Introduce la cantidad de litros:");
    L=sc.nextInt();
    System.out.println("Ingrese el precio del galon:");
    PG=sc.nextDouble();
    TG=(L / 3.785);
     GA = PG * TG;
    System.out.println("Cantidad de galones que produce es igual a:"+ TG);
    System.out.println("Ganancia por la entrega de leche es igual a :"+ GA);
 }
}
