import javax.swing.JOptionPane;
public class Ejercicio1 {
   public static void main(String[] args) {
        double area;


        double a=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la base del rectangulo:"));

        double b=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la altura del rectangulo:"));
        area=a*b;
        JOptionPane.showMessageDialog(null,"el area del rectangulo es:"+ area);
}
}
