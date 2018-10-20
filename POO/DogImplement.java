import javax.swing.JOptionPane;
public class DogImplement{
   public static void main(String[] args) {
    Dog fido= new Dog();
    fido.color = "black";
    fido.eyeColor="blue";
    fido.height= 0.50d;
    fido.weight = 30.0d;
    Dog chilaquil = new Dog();
    chilaquil.color ="brown";
    chilaquil.eyeColor ="green";
    chilaquil.height =0.78d;
    chilaquil.weight =25.0d;

    JOptionPane.showMessageDialog(null, "FIDO ES DE COLOR:"+ fido.color);
    JOptionPane.showMessageDialog(null, "FIDO ES DE COLOR:"+ chilaquil.color);
    System.out.println ( fido.sit());
    fido.layDown("mi nombre es fido  ");
    fido.sleep();

  }
}
