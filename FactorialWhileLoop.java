import javax.swing.JOptionPane;
public class FactorialWhileLoop{
  public static void main(String[] args) {
    //número para el limite dl factorial
    int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an int value"));
    //numero del factorial
    int fact =1 ;
    //Sentinela
    int i = 1;
    while(i<=value){
      fact =fact *1;
      i++;
    }
    JOptionPane.showMessageDialog(null, "el factorial de"+ value + "es"+ fact,"cacular factorial",JOptionPane.WARNING_MESSAGE);

  }
}
