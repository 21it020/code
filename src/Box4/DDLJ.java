package Box4;

//static block runs before main method
//if there are many static blocks they run sequantialy
public class DDLJ {
	
	static {
		System.out.println("A....Sharaddha join Qspide");
		
	}
	
	static {
		System.out.println("B...Dharmesh is happy");
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("C...main start");
		
		System.out.println("D...main end");
	}
	
	static {
		System.out.println("E...Sharaddha got placed");
		
	}
	static {
		System.out.println("F...Dharmesh is depressed");
		
	}

}
