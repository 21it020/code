package Box8;

public class Employee extends Person{
	int emp_id;
	String desg;
	double sal;
	
	public Employee(String name, int age, char gender, int emp_id, String desg, double sal) {
		super(name, age, gender);
		this.emp_id = emp_id;
		this.desg = desg;
		this.sal = sal;
	}
	
}
