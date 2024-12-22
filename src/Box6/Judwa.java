package Box6;
class Ziddi{
	
	void fight() { // no parameter method
		System.out.println("Akela Fight.....");
	}
	
	void fight(int a) { //one parameter method
		System.out.println("int a Fight.....");
	}
	
	void fight(int a ,int b) {
		System.out.println("int ,int Fight.....");
	}
	void fight(double a,int b) { //2 parameter method with datatype changes
		System.out.println("double ,int  Fight.....");
	}
	
	void fight(int a,double b) { //2 parameter method with datatype changes
		System.out.println("int,double  Fight.....");
	}
	
	
}

public class Judwa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("P tart");
		Ziddi z1 = new Ziddi();
		z1.fight();
		z1.fight(10);
		z1.fight(10,20);
		z1.fight(10.2,20);
		z1.fight(10,20.2);
		
		
		
		System.out.println("P end");

	}

}
