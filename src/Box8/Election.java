package Box8;

public class Election {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("CHampaklal",75,'M');
		Student s1 = new Student("Saral",20,'M',"21IT020",81.23,"Charusat");
		Employee e1 = new Employee("Yash",21,'M',500,"Software-ENgineer",20000);
		
		Goverment g1 = new Goverment();
		g1.aadhar_card(p1);
		//g1.aadhar_card(new Student("Saral",20,'M',"21IT020",71.23,"Charusat"));
		g1.aadhar_card(s1);
		//or g1.aadharcard(s1); error
		g1.aadhar_card(e1);
		
		System.out.println("-----------------");
		//g1.scholarship(p1); error
		g1.scholarship(s1);
		
		System.out.println("--------==-------");
		//g1.taxPayment(p1); error
		g1.taxPayment(e1);
		
		
	}

}
