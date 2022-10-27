package p4;
import p3.Transaction;
public class Withdraw implements Transaction{

	@Override
	public void process(double amt) {
		// TODO Auto-generated method stub
		if(amt<=b1.bal) {
			System.out.println("Amt withdraw:"+amt);
			b1.bal=b1.bal-amt;
			b1.getBal();
			System.out.println("Transaction completed");
		}
		else{
			System.out.println("Insufficient Funds");
			}
		}

}
