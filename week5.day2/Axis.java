package week5.day2;

public class Axis extends BankInfo {
	 public void deposit() {
		 System.out.println("Deposit amount limit:50000");
	 }
	 public static void main(String[] args) {
		 Axis axis=new Axis();
		 axis.saving();
		 axis.fixed();
		 axis.deposit();
		 
	}
}
