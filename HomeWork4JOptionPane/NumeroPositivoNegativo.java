import javax.swing.JOptionPane;
public class NumeroPositivoNegativo{
  public static void main(String[] args) {

    int NUM;
    String R;

    NUM =Integer.parseInt(JOptionPane.showInputDialog(null,"enter a number: "));
    if (NUM >= 0) {
      R = "POSITIV0";
    }else{
      R = "NEGATIV0";
    }
      JOptionPane.showMessageDialog(null,"El numero es: " + R);
  }
}
