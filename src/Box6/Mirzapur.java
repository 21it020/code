package Box6;

class Dada{
	int katta = 20;
	void paise() {
		System.out.println("2 crore");
	}
}

class KalinBhaiya extends Dada{
	int kaalin = 500;
	
	void politics() {
		System.out.println("Rajneethi......");
	}
	
}

class Munna extends KalinBhaiya{
	int num =50;
	void gundagardi() {
		System.out.println("Compoundar.. Ka Dost....");
	}
	
}

public class Mirzapur {
	public static void main(String[] args) {
		Munna m1 = new Munna();
		System.out.println(m1.katta);
		System.out.println(m1.kaalin);
		System.out.println(m1.num);
		
		m1.paise();
		m1.politics();
		m1.gundagardi();
		
	}

}
