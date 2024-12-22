package Box6;
class Father {
	void house() {
		System.out.println("2 floor building...");
	}
	
}

class Saral extends Father{
	//@Override
	void house() {
		System.out.println("sola panel!!");
	}
	void house(int a) {
		System.out.println("4 floor building...");
	}
	
	
}


public class Ratnakar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saral s1 = new Saral();
		s1.house();

	}

}
