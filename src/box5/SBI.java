package box5;

public class SBI {
	public static void main(String[] args) {
		User u1 = new User("Shrey",1234,"Shrey123");
		System.out.println(u1.getName());
		System.out.println(u1.getAccno());
		
		//u1.name = "Nisha";
		u1.setName("Nisha");
		u1.getName();
		System.out.println(u1.getName());
	}

}
