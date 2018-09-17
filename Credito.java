import java.util.Scanner;
public class Credito{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int TT;
    double LA ,AC,NC;
    System.out.println("Ingrese el tipo de tarjeta:");
     TT=input.nextInt();
     System.out.println("Ingrese el estado actual de su tarjeta:");
      LA=input.nextDouble();
      if (TT==1)
       AC = LA * 0.25;
       else if (TT==2)
       AC = LA * 0.35;
       else if (TT==3)
       AC =LA *0.40;
       else
        AC = LA * 0.50;

       NC = LA + AC;
         System.out.println("el nuevo limite actual de su credito es:"+ NC);
  }
}
