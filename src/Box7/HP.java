package Box7;

class Father1 {
	int a =100;
	void work() {
		System.out.println("Hardworking.........");
	}
}

class yash extends Father1{
	int b =200;
	void masti() {
		System.out.println("Badooo Badiii.....");
	}
}
public class HP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//yash y1 = new yash();
		//System.out.println(y1.a);
		//y1.work();
		//System.out.println(y1.b);
		//y1.masti();
		
		Father1 f1 = new yash();
		System.out.println(f1.a);
		f1.work();
//		System.out.println(f1.b);
//		f1.masti();
		
		yash s1 = (yash)f1;
		System.out.println(s1.a);
		s1.work();
		System.out.println(s1.b);
		s1.masti();
		

	}

}
