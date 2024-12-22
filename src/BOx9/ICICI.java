package BOx9;

public class ICICI implements atm{
	int bal;

	@Override
	public void deposit(int atm1) {
		// TODO Auto-generated method stub
		bal+=atm1;
		System.out.println(atm1 +"  Deposit Sucessfully ...");
	}

	@Override
	public void withdraw(int atm2) {
		// TODO Auto-generated method stub
		if(atm2 <=bal ) {
			bal-=atm2;
			System.out.println(atm2 +" withdraw sucess fully");
		}
		else {
			System.out.println("Tera Baap Chod ke gaya tha ke teri ma");
		}
		
	}

	@Override
	public void checkbalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance is: " + bal);
		
	}

}
