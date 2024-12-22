package Box4;


public class Cricket {
	
	{
		System.out.println("Npn Static block 1");
	}
	
	{
		System.out.println("Npn Static block 2");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		Cricket c1 = new Cricket();
		System.out.println("----------------");
		Cricket c2 = new Cricket();
		
		System.err.println("main end");
		
		
		
	}
	
	
	{
		System.out.println("Npn Static block 3");
	}
	
	{
		System.out.println("Npn Static block 4");
	}

}
