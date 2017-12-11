//Customer Type is a subclass of Person Class
public class CustomerType extends Person{

	private String fullName;
	private double accountNumber;
	private String email;
	private String[] rentedDVDs = new String[5];	//Customers can only rent 5 DVD's at a time

	public CustomerType(String fullName, double accountNumber, String email, String[] rentedDVDs) {
		super(fullName);	//inherited from superclass
		this.fullName = fullName;
		this.accountNumber = accountNumber;
		this.email = email;
		//how do we want to keep track of rented DVDs?
		this.rentedDVDs = rentedDVDs;
	}
	
	
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String[] getRentedDVDs() {
		return rentedDVDs;
	}
	public void setRentedDVDs(String[] rentedDVDs) {
		this.rentedDVDs = rentedDVDs;
	}


	//Print a list of their rented DVDs
	public String printRentedDVDs()
	{
		
		String[] DVDs = this.getRentedDVDs();
		String borrowList = "";
		for (int i = 0; i < DVDs.length; i++)
		{
			borrowList = borrowList + DVDs[i] + " \n";
		}
		return ("\n" + this.fullName + ": Rented DVDs \n") + borrowList;
	}
	
	
	//methods to rent and return (similar to DVDType methods)

	@Override
	public String toString() {
		 
		String rentedDVDList = printRentedDVDs();
		return "CustomerType [fullName=" + fullName + ", accountNumber=" + accountNumber + ", email=" + email + rentedDVDList + "]";
	}
		

}
