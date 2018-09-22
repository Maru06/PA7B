import java.util.Scanner;
public class ViajeAlumnos{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int NA;
    double PA, TOT;
    System.out.println("El numero de alumnos que realizan el viaje: ");
    NA = input.nextInt();
    if (NA >= 100) {
      PA = 65.0;
    }else if (NA >= 50) {
        PA = 70.0;
      }else if (NA >= 30) {
        PA = 95.0;
      }else{
        PA = 4000 / NA;
      }
    TOT = PA * NA;
    System.out.println("El pago individual es: " + PA);
    System.out.println("El pago total es: " + TOT);
  }
}
