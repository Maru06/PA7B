import javax.swing.JOptionPane;
public class SentinelValue{
  public static void main(String[] args) {
    int data =
    Integer.parseInt(JOptionPane.showInputDialog(null,
    "Enter an int(el progr4ama existe SIel valor es 0)"));
    int sum = 0;
    while(data != 0){
      sum ++ ;
      data =
       Integer.parseInt(JOptionPane.showInputDialog(null,
        "Enter an int(el prograama existe SI el valor es 0)"));
    }
    JOptionPane.showMessageDialog(null, "sum"+sum);
  }
}
