import java.util.Scanner;
public class Telefonica{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int TI;
    String DI, TU;
    double PAG, IMP, TOT;
    System.out.println("Ingrese el tiempo: ");
    TI = input.nextInt();
    System.out.println("Ingrese el dia: ");
    DI = input.next();
    System.out.println("Ingrese el turno: ");
    TU = input.next();
    if (TI < 5) {
      PAG = TI * 1;
    }else if (TI < 8) {
      PAG = (TI - 5) * 0.8 + 5;
    }else if (TI <= 10) {
      PAG = (TI - 8) * 0.7 + 7.4;
    }else{
      PAG = (TI - 10) * 0.5 + 8.8;
    }
    if (DI == "DOM") {
      IMP = PAG * 0.05;
    }else if (TU == "M") {
      IMP = PAG * 0.15;
    }else{
      IMP = PAG * 0.10;
    }
    TOT = PAG + IMP;
    System.out.println("El pago es: " + PAG);
    System.out.println("El impuesto es: " + IMP);
    System.out.println("El pago total es: " + TOT);
  }
}
