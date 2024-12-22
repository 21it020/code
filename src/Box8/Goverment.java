package Box8;

public class Goverment {

	void aadhar_card(Person P) {
		System.out.println(P.name + "  Will get aadhar Card");
	}
	
	void scholarship(Student s) {
		//System.out.println(s.name+" Will eligible for cholarship");
		if(s.per>=80) {
			System.out.println(s.name+" Will eligible for scholarship");
		}
		else {
			System.out.println(s.name+" Will not eligible for scholarship");
		}
	}

	void taxPayment(Employee e) {
		//System.out.println(e.name + " Will pay tax");
		if((e.sal)*12>=700000) {
			System.out.println(e.name + " Should pay tax");
			System.out.println("Tax Payable 18% is :"+ (e.sal*12*0.18) + " Rupees");
		}
		else {
			System.out.println(e.name+ " no need to pay Tax");

		}
	}
}
