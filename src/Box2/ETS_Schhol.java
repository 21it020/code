package Box2;

public class ETS_Schhol {
	public static void main(String[] args) {
		char  grade = 'D';
		switch(grade) {
			case 'A','a',68 :	System.out.println("Exceelent fantastic mindblowing result");
			  break;
			case 'B','b' : {
				System.out.println("GOod Result Thik hai...");
				break;
			}
			case 'C','c' : {
				System.out.println("Baal Baal bach gaya");
				break;
			}
			case 'F' ,'f' : {
				System.out.println("Agle saal padhke aana");
				break;
			}
			default : System.out.println("Invalid Grade");
		}
	}
}
