package Box8;

public class Student extends Person {
	
	String enroll_no;
	double per;
	String Collage_name;
	
	public Student(String name, int age, char gender, String enroll_no, double per, String collage_name) {
		super(name, age, gender);
		this.enroll_no = enroll_no;
		this.per = per;
		Collage_name = collage_name;
	}
	
	
	

}
