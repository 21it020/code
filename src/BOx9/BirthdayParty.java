package BOx9;
interface Saral{
	void party();
	void pyaar();
	
}
interface Yash{
	void party();
	void pyaar();
	
}
interface Shrey{
	void party();
	void pyaar();
}
class  Vani extends Rushant implements Saral,Yash,Shrey{

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("Vani Controlling both party");
		
	}

	@Override
	public void pyaar() {
		// TODO Auto-generated method stub
		System.out.println("vani controlling both pyaar");
		
	}
	
}

class Rushant{
	
}

public class BirthdayParty {
	public static void main(String[] args) {
		Vani v1  = new Vani();
		v1.party();
		v1.pyaar();
		
		
	}

}
