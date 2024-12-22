package Box2;

public class Cmat {
	public static void main(String[] args) {
		char gender = 'M';
		
		if (gender == 'M' || gender == 'm') {
			System.out.println("Person is Mardd...");
		}
		else if (gender == 'F' || gender == 'f') {
			System.out.println("Person is Kanya ...");
		}
		else if (gender == 'O' || gender == 'o') {
			System.out.println("Ory Vale log ...");
		}
		else {
			System.out.println("Invalid Gender...");
		}
		
	}
}
