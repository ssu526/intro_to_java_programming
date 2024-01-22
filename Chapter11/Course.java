/*
11.5 (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList
to replace an array to store students. Draw the new UML diagram for the class.
You should not change the original contract of the Course class (i.e., the definition
of the constructors and methods should not be changed, but the private
members may be changed.)
*/

public class Course{
	private String courseName;
	private ArrayList<String> students = new ArrayList<>();
	
	public Course(String courseName){
		this.courseName = courseName;
	}

	public void addStudent(String student){
		if(students.size()<100){
			students.add(student);
		}else{
			System.out.println("Couse is full");
		}
	}

	public int getNumberOfStudents(){
		return students.size();
	}

	public String getCourseName(){
		return courseName;
	}

	public void dropStudent(String student){
		if(students.size()=0){
			System.out.println("No students in the course");
		}else{
			boolean removed = students.remove(student);
			if(removed==true){
				System.out.println(student+" is removed from the course.");
			}else{
				System.out.println(student+" is not found.");
			}
		}
	}

}
