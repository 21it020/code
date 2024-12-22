package box5;

public class User {
	private String name;
	private long accno;
	private String pass;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getAccno() {
		return accno;
	}


	public void setAccno(long accno) {
		this.accno = accno;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public User(String name, int accno, String pass) {
		
		this.name = name;
		this.accno = accno;
		this.pass = pass;
	}
	
	

}
