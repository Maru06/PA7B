import javax.swing.JOptionPane;
public class CantidadesMayor{
  public static void main(String[] args) {

    int A, B, C, Mayor;

    A =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));

    B = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));

    C = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tercer numero"));
    if (A > B) {
      if (A > C) {
        Mayor = A;
      }else{
        Mayor = C;
      }
    }else{
      if (B > C) {
        Mayor = B;
      }else{
        Mayor = C;
      }
    }
    JOptionPane.showMessageDialog(null,"El numero mayor es: " + Mayor);
  }
}
