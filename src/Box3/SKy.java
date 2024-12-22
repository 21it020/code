package Box3;

class pen{
	static String colour = "red";
	static int price = 10;
	static void dance() {
		System.out.println("Garba Dance ....");
		
	}
	
}

public class SKy {
	public static void main(String[] args) {
		//System.out.println(colour);   can't access directly
		//System.out.println(price);
		System.out.println(pen.colour); //you can access via classname.variable (only static variable)
		System.out.println(pen.price);
		pen.dance();   //you access method via ClassName.methodename
	}

}
