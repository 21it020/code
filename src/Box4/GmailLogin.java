package Box4;

class User{
	String email_id;
	long phno;
	String Pass;
	
	//constructor  overloading
	public User(String email_id, String pass) {
		this.email_id = email_id;
		Pass = pass;
	}
	
	public User(long phno, String pass) {
		super();
		this.phno = phno;
		Pass = pass;
	}
	
	
	
}

public class GmailLogin {
	public static void main(String[] args) {
		System.out.println("Prg start");
		
		User u1 = new User("Maakamagarmach@gmail.com","magarmach@123");
		System.out.println(u1.email_id + " :" + u1.Pass);
		
		User u2 = new User(1234567890,"magarmach@123");
		System.out.println(u2.phno + " :" + u1.Pass);
		
		
		System.out.println("Prg end");
		
		
	}

}
