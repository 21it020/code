package Box2;

public class Maggi {
	public static void main(String[] args) {
		char  grade = 'D';
		switch(grade) {
			case 'A','a',68 ->	System.out.println("Exceelent fantastic mindblowing result");
			case 'B','b' -> {
				System.out.println("GOod Result Thik hai...");
			}
			case 'C','c' -> {
				System.out.println("Baal Baal bach gaya");
			
			}
			case 'F' ,'f' -> {
				System.out.println("Agle saal padhke aana");
			}
			default -> System.out.println("Invalid Grade");
		}
	}
}
