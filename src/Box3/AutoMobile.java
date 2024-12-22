package Box3;

class Nano{
	
	String colour;
	double price;
	int speed;
	
	Nano(String c,double p,int s){
		colour = c;
		price = p;
		speed =s;
		
	}
	
	
}

public class AutoMobile {
	public static void main(String[] args) {
		System.out.println("p start");
		
		Nano n1 = new Nano("green",300.12,123);
		System.out.println();
		
		System.out.println("p end");
		
	}

}
