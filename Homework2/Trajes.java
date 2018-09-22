import java.util.Scanner;
public class Trajes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double CT, DE, PF;
    System.out.println("El costo del traje es: ");
    CT = input.nextDouble();
    if (CT > 2500)
      DE = CT * 0.15;
    else
      DE = CT * 0.08;
    
    PF = CT - DE;
    System.out.println("El precio final es: " + PF);
    System.out.println("El descuento es: " + DE);
  }
}
