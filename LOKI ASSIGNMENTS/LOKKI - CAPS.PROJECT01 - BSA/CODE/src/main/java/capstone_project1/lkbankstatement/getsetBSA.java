package capstone_project1.lkbankstatement;

public class getsetBSA {
	
	private String date;
	//private String time;

	private String transactiondetails;
	private String credit;
	private String debit;
	private String balanceamount;
	private String month;
	
public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}

	
//	public String getTime() {
//		return time;
//	}
//	public void setTime(String time) {
//		this.time = time;
//	}
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public String gettransactiondetails() {
		return transactiondetails;
	}
	public void settransactiondetails(String transactiondetails) {
		this.transactiondetails = transactiondetails;
	}
	
	
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	
	
	public String getDebit() {
		return debit;
	}
	public void setDebit(String debit) {
		this.debit = debit;
	}
	
	
	public String getBalancesmount() {
		return balanceamount;
	}
	public void setBalanceamount(String balanceamount) {
		this.balanceamount = balanceamount;
	}

}
