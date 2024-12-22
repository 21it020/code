package box5;

class Employee{
		  String name;
	final String empid;
		  double salary;
	private static int randomnum = 500;
	
	
	public Employee(String name, double salary) {
		this.name = name;
		this.empid = "2024TCS"+ randomnum++;
		this.salary = salary;
	}
	
	
	void details(){
		System.out.println("Emaployye Name: " + name + "  Employee-id:" + empid + "  Salary: " + salary);
	}
}



public class PMCCompany {
	public static void main(String[] args) {
		Employee e1 = new Employee("Dharmesh",85000.0);
		Employee e2 = new Employee("Rushant",87000.0);
		Employee e3 = new Employee("Saral",90000.0);
		Employee e4 = new Employee("Yash",95000.0);
		Employee e5 = new Employee("Pooja",97000.0);
		Employee e6 = new Employee("Nandini",98000.0);
		
		
		
	//	e4.empid = 102;
	//	e3.empid = 103;
		
		
		e1.details();
		e2.details();
		e3.details();
		e4.details();
		e5.details();
		e6.details();
		
		
	}

}
