import javax.swing.JOptionPane;
public class ForLoop1{
  public static void main(String[] args) {

//inicializacion variable, condicion, incremento
    for(int i = 0; i <= 9; i++ ){
    int tabla = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero"));
    String salida += (tabla + " x " + (i + 1) + " = " + (i + 1)* tabla + "\n");
  }while (salida !=0 );
    JOptionPane.showMessageDialog(null, salida);
  }
}
