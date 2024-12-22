package Box8;
abstract class Swarg{
	abstract void apsara(); //abstract method
	abstract void raniPari();
	abstract void balPari();
	
	void Narad() { // concrete method
		System.out.println("Narayan Narayan ....");
	}
	
	
}
class Indra extends Swarg{//concrete class

	@Override
	void apsara() {
		// TODO Auto-generated method stub
		System.out.println("Apsara Method....");
		
	}

	@Override
	void raniPari() {
		// TODO Auto-generated method stub
		System.out.println("RaniPari Method....");
	}

	@Override
	void balPari() {
		// TODO Auto-generated method stub
		System.out.println("Bal-Pari Method....");
		
	} 
	
}


public class Biorythm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Swarg s1 = new Swarg();
		Swarg i1 = new Indra();  //Up-casting
		i1.apsara();
		i1.raniPari();
		i1.balPari();
		

	}

}
