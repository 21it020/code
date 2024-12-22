package Box6;

class Person{
	
	String name;
	int age;
	char gender;
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	 
   
}

class Student extends Person{
	double marks;
	long enrollemo;
	String collegename;
	public Student(String name, int age, char gender, double marks, long enrollemo, String collegename) {
		super(name, age, gender);
		this.marks = marks;
		this.enrollemo = enrollemo;
		this.collegename = collegename;
	}
	
	
	
	
	
}


public class TMKOC {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Saral",21,'M',94.33,5944055L,"CHarusatColloge");
		System.out.println(s1.name);
		

	}

}
