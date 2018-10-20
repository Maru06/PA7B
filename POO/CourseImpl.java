import javax.swing.JOptionPane;

public class CourseImpl{

public static void main(String[] args) {

  int opc = 0;
     Course curso1 = new Course();
      do {
        opc= Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la opcion a realizar \n 1.-Crear Curso \n 2.-Agregar Estudiantes \n 3.-Eliminar Estudiantes \n 4.-Mostrar Estudiantes \n 5.-Mostrar Numero de Estudiantes \n 6.- Salir"));
        switch(opc){
          case 1:
          //crear curso
            curso1.SetCourseName(JOptionPane.showInputDialog(null,"Ingrese nombre del curso"));
          break;
          case 2:
          //agregar estudiante
            curso1.addStudent(JOptionPane.showInputDialog(null,"ingrese nombre del estudiante"));

          break;
          case 3:
          //eliminar
            curso1.dropStudent("");
          break;
          case 4:
          //mostrar estudiantes
          String [] studentsDeCurso1= curso1.getStudents();
          String students = "";
          for (int i = 0;i < curso1.getNumberOfStudents() ;i ++ ) {
            students += studentsDeCurso1[i]+ "\n";
          }
          JOptionPane.showMessageDialog(null, students);
          break;
          case 5:
          //mostrar numero de estudiantes
          JOptionPane.showMessageDialog(null,curso1.getNumberOfStudents());
          break;
          default:
          //mensaje de opcion
        }
      } while (opc!=6);



/*

Course curso1 = new Course();

 // curso1.courseName = "Inglés";

  curso1.setCourseName("Inglés");


 curso1.addStudent("Luis Alberto");

  curso1.addStudent("Maria");

 curso1.addStudent("Lucero");


   String [] studentsDeIngles = curso1.getStudents();

   String students = "";

 for (int i = 0; i < curso1.getNumberOfStudents() ; i ++) {

      students += studentsDeIngles[i]+ "\n";

 }


   JOptionPane.showMessageDialog(null, students);


  Course curso2 = new Course();

curso2.setCourseName("Mate");


curso2.addStudent("Brandon");

  curso2.addStudent("Angel");

   curso2.addStudent("Steven");


   JOptionPane.showMessageDialog(null, curso1.getCourseName());


   JOptionPane.showMessageDialog(null, curso2.getCourseName());*/



 }
}
