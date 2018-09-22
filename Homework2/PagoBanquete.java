import java.util.Scanner;
public class PagoBanquete{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int NP;
    double TOT;
    System.out.println("Ingrese el numero de personas:");
    NP = input.nextInt();
    if (NP > 300) {
      TOT = NP * 75;
    }else {
      if (NP > 200) {
      TOT = NP * 85;
    }else{
      TOT = NP * 95;
    }
  }
  System.out.println("El total es: " + TOT);
  }
}
