package box5;

public class Mango {
	
	public int a =10;
	protected int b =20;
			int c =30;
	private int d =40;
	
	public void test1(){
		System.out.println("Public acces method");
	}
	
	protected void test2(){
		System.out.println("Private acces method");
	}
	 void test3(){
		System.out.println("Pkg-leve acces method");
	}
	private void test4(){
		System.out.println("Private acces method");
	}
	
	public static void main(String[] args) {
		Mango m1 = new Mango();
		
		System.out.println(m1.a);
		System.out.println(m1.b);
		System.out.println(m1.c);
		System.out.println(m1.d);
		
		m1.test1();
		m1.test2();
		m1.test3();
		m1.test4();
		
	}

}
