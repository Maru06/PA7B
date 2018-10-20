public class Course{
  private String courseName;
  private String[] students;
  private int numberOfStudents =0;
  public Course(){

  }
  public Course (String courseName){
    this.courseName= courseName;
  }
  public String getCourseName(){
    return this.courseName;
  }
  public void setCourseName(String courseName){
    this.courseName =courseName;
  }
  public void addStudent(String student){
    this.students[numberOfStudents]=student;
    this.numberOfStudents++;
  }
  public void dropStudents(String student){
    for (int i = 0; i < numberOfStudents; i++) {
	      if (students[i].equalsIgnoreCase(student)) {
	        // Move students[i + 1] to students[i], etc.
	        for (int k = i + 1; k < numberOfStudents; k++) {
	          students[k - 1] = students[k];
	        }

	        numberOfStudents--;
	        break;
	      }
	    }

  }
  public String[]getStudents(){
    return this.students;
  }
  public int getNumberOfstudents(){
    return this.numberOfStudents;
  }

  }
