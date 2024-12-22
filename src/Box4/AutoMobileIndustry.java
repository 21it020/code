package Box4;
class Harrier{
	String colour; //GLobal non static variable
	int speed;
	double price;
	
	Harrier(String c,int s, double p){
		colour = c;
		speed = s;
		price = p;
		
		
	}
	void details() {
		System.out.println("Car colour is " + colour + " Speed is " + speed + " PRice is " + price);
	}

public class AutoMobileIndustry {
	public static void main(String[] args) {
		System.out.println("P statrt");
		Harrier h1 = new Harrier("white",100,200.7);
		h1.details();
		
		System.out.println("---------------------");
		
		Harrier h2 =new Harrier("black",200,37900.4);
		h2.details();
		
		System.out.println("P end");
	}
}

}
