import java.util.Scanner;
public class Ejercicio1 {
   public static void main(String[] args) {
        double area;
        Scanner input=new Scanner(System.in);
        System.out.println("ingrese la base del rectangulo:");
        double a=input.nextDouble();
        System.out.println("ingrese la altura del rectangulo:");
        double b=input.nextDouble();
        area=a*b;
        System.out.println("el area del rectangulo es:"+ area);
}
}
