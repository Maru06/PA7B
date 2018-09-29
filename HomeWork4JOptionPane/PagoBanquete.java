import javax.swing.JOptionPane;
public class PagoBanquete{
  public static void main(String[] args) {

    int NP;
    double TOT;

    NP = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de personas:"));
    if (NP > 300) {
      TOT = NP * 75;
    }else {
      if (NP > 200) {
      TOT = NP * 85;
    }else{
      TOT = NP * 95;
    }
  }
  JOptionPane.showMessageDialog(null,"El total es: " + TOT);
  }
}
