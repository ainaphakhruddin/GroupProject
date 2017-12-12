
public class CheckedOut {
	
	private double accountNumber;
	private String[] titles = new String[5];
	
	
	public CheckedOut(double accountNumber, String[] titles) {
		super();
		this.accountNumber = accountNumber;
		this.titles = titles;
	}
	
	
	public CheckedOut() {}


	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String[] getTitles() {
		return titles;
	}
	public void setTitles(String[] title) {
		this.titles = title;
	}


	@Override
	public String toString() {
		return "CheckedOut [accountNumber=" + accountNumber + ", title=" + titles + "]";
	}
	


	
	
}
