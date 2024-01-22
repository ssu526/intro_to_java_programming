/*
(The Person, Student, Employee, Faculty, and Staff classes) Design a class named Person and its two subclasses named Student and Employee. 
Make Faculty and Staff subclasses of Employee. 
A person has a name, address, phone number, and email address. 
A student has a class status (freshman, sophomore, junior, or senior). Define the status as a constant. 
An employee has an office, salary, and date hired. 
Use the MyDate class defined in Programming Exercise 10.14 to create an object for date hired. 
A faculty member has office hours and a rank. 
A staff member has a title. Override the toString method in each class to display the class name and the person’s name.
Write a test pro- gram that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods.
*/

//javac *.java


package Chapter11;
//import Chapter11.MyDate;
import Class.MyDate;


class Person{
	private String name;
	private String address;
	private String phone;
	private String email;

	public Person(String name){
		this(name, "Unavailable", "Unavailable", "Unavailable");
	}

	public Person(String name, String address, String phone, String email){
		this.name=name;
		this.address=address;
		this.phone=phone;
		this.email=email;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public String getPhone(){
		return phone;
	}

	public String getEmail(){
		return email;
	}

	public void setName(String name){
		this.name=name;
	}

	public void setAddress(String address){
		this.address=address;
	}

	public void setPhone(String phone){
		this.phone=phone;
	}

	public void setEmail(String email){
		this.email=email;
	}

	@Override
	public String toString(){
		return "Name: "+name+"    Address: "+address+"    Phone Number: "+phone+"    Email: "+email;
	}
}


class Student extends Person{
	private String status;
	public final String FRESHMAN = "Freshman";
	public final String SOPHOMORE = "Sophomore";
	public final String JUNIOR = "Junior";
	public final String SENIOR = "Senior";

	public Student(String name, String status){
		super(name);
		this.status=status;
	}

	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
			return status;
	}

	@Override
	public String toString(){
		return super.toString()+"\n"+this.getClass().getSimpleName()+getStatus();
	}
}

class Employee extends Person{
	private String office;
	private double salary;
	private MyDate dateHired=new MyDate(System.currentTimeMillis());

	public Employee(String name){
		super(name);
	}

	public Employee(String name, String office, double salary){
		super(name);
		this.office=office;
		this.salary=salary;
	}

	public String getOffice(){
		return office;
	}

	public double getSalary(){
		return salary;
	}

	public String getDateHired(){
		return dateHired.getYear()+" "+dateHired.getMonth()+" "+dateHired.getDay();
	}

	@Override
	public String toString(){
		return super.toString()+"\n"+this.getClass().getSimpleName()+"\nOffice: "+getOffice()+"\nSalary: "+getSalary()+"\nDate Hired: "+getDateHired();
	}
}

class Faculty extends Employee{
	private String rank;
	private String officeHour;
	public static String LECTURER = "Lecturer";
    public static String ASSISTANT_PROFESSOR = "Assistant Professor";
    public static String ASSOCIATE_PROFESSOR = "Associate Professor";
    public static String PROFESSOR = "Professor";


	public Faculty(String name, String rank, String officeHour){
		super(name);
		this.rank=rank;
		this.officeHour=officeHour;
	}

	public String getRank(){
		return rank;
	}

	public String getOfficeHour(){
		return officeHour;
	}

	public void setRank(String rank){
		this.rank=rank;
	}

	public void setOfficeHour(String officeHour){
		this.officeHour=officeHour;
	}

	@Override
	public String toString(){
		return super.toString()+"\n"+this.getClass().getSimpleName()+"\nRank: "+getRank()+"\nOffice Hour"+getOfficeHour();
	}

}

class Staff extends Employee{
	private String title;

	public Staff(String name, String title){
		super(name);
		this.title=title;
	}

	public String getTitle(){
		return title;
	}

	@Override
	public String toString(){
		return super.toString()+"\n"+this.getClass().getSimpleName()+"\nTitle: "+getTitle();
	}
}

public class School{
	public static void main(String[] args){
		Person p1 = new Person("Joe", "123 Main Street", "416-333-3333", "joe@gmail.com");
		Student s1 = new Student("Erica","Junior");
		Faculty f1 = new Faculty("Megan","Professor","MWF 1-3pm");
		Staff sf1 = new Staff("Leanne","Coop Coordinator");

		System.out.println(p1.toString());
		System.out.println(s1.toString());
		System.out.println(f1.toString());
		System.out.println(sf1.toString());
	}
}