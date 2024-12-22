package Box3;

public class Omni {
	
	static int  i = 100;
	static int j = 300; // static global variable
	
	static void sallubhai() {
		int a = 50; //local variable
		int b =200; 
		//static int c =20; local variable does not have static and non static type
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println("prog start");
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("prog end..");
		
	}

}
