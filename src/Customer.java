
public class Customer {
	private int customerID;
	private String firstName;
	private double credit;
	
	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Customer(int customerID, String firstName) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
	}
	
	
	
	

}
