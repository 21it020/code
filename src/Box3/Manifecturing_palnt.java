package Box3;

class Fanti{
	String colour = "white";
	double price = 2.9;
	void detail() {
		System.out.println("Car ka details....");
	}
}

public class Manifecturing_palnt {
	public static void main(String[] args) {
		System.out.println(new Fanti().colour);
		System.out.println(new Fanti().price);
		//System.out.println(Fanti.colour); only for static
		new Fanti().detail();
	}

}
