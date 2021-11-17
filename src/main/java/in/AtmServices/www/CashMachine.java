package in.AtmServices.www;

public class CashMachine {
	private IPrinter printer;
	public CashMachine(IPrinter printer) {
		this.printer=printer;
	}	
	public void WithdrawAmount() {
		String printdata=this.printer.print();
		System.out.println(printdata);
		System.out.println("Your Withdrawal was successfull ....");
	}	
}
