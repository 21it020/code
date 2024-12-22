package Box7;
class Animal{
	void sound() {
		System.out.println("Animal Making sound...");
	}
	
}
class dog extends Animal{
	@Override
	void sound() {
		System.out.println("Bhoww... Bhoww...");
		
	}
	
}
class cat extends Animal{
	@Override
	void sound() {
		System.out.println("Meow... Meow...");
		
	}
	
}
class snake extends Animal{
	@Override
	void sound() {
		System.out.println("Hiss... Hiss...");
		
	}
	
}

public class PraniSangrahalay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new snake();  //upcasting
		a1.sound();
		

	}

}
