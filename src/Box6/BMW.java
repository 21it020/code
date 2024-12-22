package Box6;


class Audi{
	
	void series(int... num) {
		
		int sum =0;
		for (int i: num) {
			sum+=i;
		}
		System.out.println("Sum is " + sum);
	}
	
}
public class BMW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a1= new Audi();
		a1.series(20,10,30,2000,40,22,534,45);
		a1.series(500,10,30,50);
		a1.series(-50,-10,-30);

	}

}
