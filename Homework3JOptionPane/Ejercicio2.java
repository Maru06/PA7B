import javax.swing.JOptionPane;
public class Ejercicio2{
 public static void main(String[] args) {

    double radio, longitud, area;

    radio = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce radio de la circunferencia:"));
    longitud = 2 * Math.PI * radio;
    area = Math.PI * Math.pow(radio, radio);
    JOptionPane.showMessageDialog(null,"el area de la circunferencia es:"+ area);
  }
}
