import javax.swing.JOptionPane;
public class CourseImpl{
public static void main(String[] args) {
/*  int opc = 0;
    do{


     switch(opc){

 case 1:
        //crear curso

 break;

       case 2:
    //agregar estudiantes

  break;


      case 3:
        //eliminar estudiantes

      break;

 case 4:
        // mostrar estudiantes

     break;

     case 5:

    //mostrar numero de estudiantes

 break;


     default:
        //Mensaje de eliga opcion correcta

  }

 }
while(true);*/



   Course course3=new Course("programacion");
   course3.addStudent("agustin");


 Course curso1=new Course();
 //curso1.courseName="ingles";
 curso1.setCourseName("ingles");
 curso1.addStudent("luis alberto");
 curso1.addStudent("maria");
 curso1.addStudent("lucero");
 String []studentsDeIngles =curso1.getStudents();
 String students="";
 for (int i=0; i<curso1.getNumberOfstudents();i++){
   students+= studentsDeIngles[i]+"\n";
 }



 JOptionPane.showMessageDialog(null,students);
 Course curso2=new Course();
 curso2.setCourseName("mate");
  curso2.addStudent("brandon");
   curso2.addStudent("angel");
   curso2.addStudent("steven");
 JOptionPane.showMessageDialog(null,curso1.getCourseName());
 JOptionPane.showMessageDialog(null,curso2.getCourseName());



}

}
