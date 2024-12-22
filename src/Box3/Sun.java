package Box3;

public class Sun {
	static double area(double radius) {
		double ans = 3.142 * radius * radius;
		return ans;
		//System.out.println("Area of circcle is ..:"+ans);  : for void return type
		
		
	}
	public static void main(String[] args) {
		System.out.println("Pstart");
		//area(2);
		//area(4); for void return type
		//area(4.3);
		System.out.println("Area of circcle is ..:"+area(2));
		System.out.println("Area of circcle is ..:"+area(4.5));
		System.out.println("P end");
	}
}
