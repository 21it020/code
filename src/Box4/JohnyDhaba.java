package Box4;

class Pasta{
	
	String name = "whiteCheese pasta";
	int price  = 499;
	
	void home() {
		String name = "Red sause pasta";
		int price = 30;
		System.out.println("Local name"+name);
		System.out.println("Local Price:"+price);
		System.out.println("-----------------------------------------------------");
		System.out.println("Gloabal name" + this.name);
		System.out.println("Gloabal price" + this.price);
		
		
	}
}

public class JohnyDhaba {
	public static void main(String[] args) {
		System.out.println("P sstart");
		Pasta p1 = new Pasta();
		p1.home();
		
		
		
		System.out.println("P end");
	}

}
