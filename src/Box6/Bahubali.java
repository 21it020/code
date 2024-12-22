package Box6;

class Shivgami{
	Shivgami(String s){
		System.out.println(s + "   Shivgami class...");
		
	}
	
	
}

class Amarendra extends Shivgami{
	Amarendra(int a){
		super("Mate");
		System.out.println(a + "    amarendra class");
		
	}
	
}

class Mahendra extends Amarendra{
	Mahendra(double d){
		super(10);
		System.out.println(d+ "  mahendra class");
		
	}
	
}
public class Bahubali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mahendra m1 = new Mahendra(89.28);
		

	}

}
