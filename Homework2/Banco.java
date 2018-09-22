import java.util.Scanner;
public class Banco{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int TT;
    double LA;
    double NC;
    double AC;
    System.out.println("Ingrese el tipo de tarjeta: ");
    TT = input.nextInt();
    System.out.println("Ingrese limite actual del credito: ");
    LA = input.nextDouble();
    if (TT == 1){
      AC = LA * 0.25;
    }else if (TT == 2){
      AC = LA * 0.35;
    }else if (TT ==3){
      AC = LA * 0.40;
    }else{
    AC = LA * 0.50;
    }
    NC = AC + LA;
    System.out.println("El nuevo limite de credito es:" + NC);
  }
}
