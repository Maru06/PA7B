import java.util.Scanner;
public class Ejercicio2{
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double radio, longitud, area;
    System.out.println("Introduce radio de la circunferencia:");
    radio = sc.nextDouble();
    longitud = 2 * Math.PI * radio;
    area = Math.PI * Math.pow(radio, radio);
    System.out.println("el area de la circunferencia es:"+ area);
  }
}
