import java.util.Scanner;
public class Ejercicio6{
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   double  HT,PH,SS;
    System.out.println("Introduce las horas trabajadas:");
    HT=sc.nextDouble();
    System.out.println("Introduce el pago por hora:");
    PH=sc.nextDouble();
    SS = HT * PH;
    System.out.println("EL SUELDO SEMANALA ES IGUAL A:"+ SS);
  }
}
