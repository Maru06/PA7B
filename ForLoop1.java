
import javax.swing.JOptionPane;
public class ForLoop1{
  public static void main(String[] args) {
    int quest = 0;
    do{
    int tabla = Integer.parseInt(JOptionPane.showInputDialog("Ingresa que tabla quieres ver:"));
    String salida = "";

    for (int i = 0; i <= 10  ; i++ ) {

      //JOptionPane.showMessageDialog(null,"1 x" + i + "=" + m);

      salida += (tabla + " x " + (i + 1) + " = " + (i + 1)* tabla + "\n");
    }
    JOptionPane.showMessageDialog(null, salida);
    quest = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas buscar otra tabla? \n"+ "Presiona 0 Si quieres \n" + "Presiona 1 Si NO quieres"));
    }
    while (quest == 0);


  }
}
