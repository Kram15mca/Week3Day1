package Week3.Day1;

public class AxisBank extends BankInfo{
	//overriding
	//creating methods
		public void deposit()
		{
			System.out.println("Amount deposited in your Account");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank bank = new AxisBank();
		bank.deposit();
	}

}
