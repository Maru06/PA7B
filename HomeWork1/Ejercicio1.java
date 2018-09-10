import java.util.Scanner;
public class Ejercicio1 {
   public static void main(String[] args) {
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la base del rectangulo:");
        double a=sc.nextDouble();
        System.out.println("ingrese la altura del rectangulo:");
        double b=sc.nextDouble();
        area=a*b;
        System.out.println("el area del rectangulo es:"+ area);
}
}
