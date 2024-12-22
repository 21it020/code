package Box3;

class Tesla{
	
	String colour = "Silver";
	double price = 52.3;
	
	
}
public class Mplant {
	
	public static void main(String[] args) {
		
		Tesla t1 = new Tesla();  //Refrence variable  : it's a non premitive type variable declared using java class type
		System.out.println(t1.colour);
		System.out.println(t1.price);
		
		Tesla t2 = new Tesla();
		System.out.println(t2.colour);
		System.out.println(t2.price);
		
		
	}

}
