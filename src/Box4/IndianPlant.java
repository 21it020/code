package Box4;

class Kawasaki{
	
	int speed,mileage;
	String colour;
	
	
	
	
	public Kawasaki(int speed, int mileage, String colour) {
		this.speed = speed;
		this.mileage = mileage;
		this.colour = colour;
	}




	void details() {
		System.out.println("Speed is : " + speed  +" Mileage is : "+ mileage + " Colour is : "+colour);
	}
}

public class IndianPlant {
	public static void main(String[] args) {
		System.out.println("P Start");
		Kawasaki k1 = new Kawasaki(200,4,"Green");
		k1.details();
		System.out.println("-----------------------------------------------------");
		
		Kawasaki k2 = new Kawasaki(150,6,"black");
		k2.details();
		System.out.println("-----------------------------------------------------");
		
		Kawasaki k3 = new Kawasaki(250,3,"white");
		k3.details();
		System.out.println("-----------------------------------------------------");
		
		System.out.println("P end");
	}
}
