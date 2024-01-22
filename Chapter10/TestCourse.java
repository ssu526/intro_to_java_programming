//Chapter10 - Question 9


class Course{

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName){
		this.courseName=courseName;
	}

	public void addStudent(String student){

		if(numberOfStudents>=students.length){
			String[] temp = new String[students.length*2];
			System.arraycopy(students,0,temp,0,students.length);
			students=temp;
			
		}

		students[numberOfStudents]=student;
		numberOfStudents++;
	}

	public String[] getStudents(){
		return students;		
	}

	public int getNumberOfStudents(){
		return numberOfStudents;
	}

	public String getCourseName(){
		return courseName;
	}

	public void dropStudent(String student){
		int position=-1;

		for(int i=0;i<numberOfStudents;i++){
			if(students[i].equalsIgnoreCase(student)){
				position=i;
			}
		}

	
		if(position==-1){
			System.out.println("Student "+student+" not found\n");

		}else{
			for(int i=position+1;i<numberOfStudents-1;i++){
				students[i-1]=students[i];
			}
          
			students[numberOfStudents-1]=null;
			numberOfStudents--;
		}
      
	}


	public void clear(){
		String[] temp = new String[100];
      		students=temp;
		numberOfStudents=0;

	}

}


public class TestCourse{

	public static void main(String[] args){
	
		Course CS50 = new Course("CS50");
		CS50.addStudent("Erica");
		CS50.addStudent("Megan");
		CS50.addStudent("Leanne");
		CS50.dropStudent("leanne");
		
		String students[]=CS50.getStudents();
		System.out.println(CS50.getCourseName()+" has "+CS50.getNumberOfStudents()+" students: ");
		for(int i=0;i<CS50.getNumberOfStudents();i++){
			System.out.println(students[i]);
		

		}
		

	}


}


