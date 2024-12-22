package Box2;

public class Shoes {
	public static void main(String[] args) {
		int rows =4,column = 4;
		
		for(int r =1; r<=rows ;r++) {
			for(int c =1;c<=column;c++) {
				if(r==1 || c == 1 || r == rows || c == column) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
}
