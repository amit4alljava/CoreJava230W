class Loan
{
	void applyForLoan(){
		System.out.println("Apply For Loan");
	}
	void approvalForLoan(){
		System.out.println("Approval For Loan");
	}
	void roi(){
		System.out.println("Loan ROI 7%");
	}
}

class ICICILoan extends Loan{
	@Override
	void approvalForLoan(){
		System.out.println("ICICI Quick Approval For Loan");
	}
}


class HDFCLoan extends Loan
{
	void doorToDoorService(){
		System.out.println("HDFC Door to Door");
	}
	@Override
	void roi(){
		System.out.println("HDFC ROI 14%");
	}
}


public class BankingProduct {
	void printBankingOperation(Loan loan){
		
		loan.applyForLoan();
		loan.approvalForLoan();
		loan.roi();
		if(loan instanceof HDFCLoan){
		HDFCLoan hdfc = (HDFCLoan) loan; // downcasting
		hdfc.doorToDoorService();
		}
		
	}
	

	public static void main(String[] args) {
		Loan icici = new ICICILoan(); //Upcasting
		//HDFCLoan hdfc = new HDFCLoan();
		BankingProduct bp = new BankingProduct();
		bp.printBankingOperation(icici);
		
		
		
		/*hdfc.applyForLoan();
		hdfc.approvalForLoan();
		hdfc.roi();
		//hdfc.hdfcroi();
		hdfc.doorToDoorService();
		
		ICICILoan icici = new ICICILoan();
		icici.applyForLoan();
		icici.approvalForLoan();
		icici.roi();*/

	}

}






