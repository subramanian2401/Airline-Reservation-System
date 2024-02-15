package entity;

public class Passengers {
	int passengers_id;
	String pname;
	int page;
	Contact_info c_info;
	double amount;

	public Passengers(int passengers_id, String pname, int page, Contact_info c_info) {
		super();
		this.passengers_id = passengers_id;
		this.pname = pname;
		this.page = page;
		this.c_info = c_info;
		

	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getPassengers_id() {
		return passengers_id;
	}
	public void setPassengers_id(int passengers_id) {
		this.passengers_id = passengers_id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Contact_info getC_info() {
		return c_info;
	}
	public void setC_info(Contact_info c_info) {
		this.c_info = c_info;
	}
	@Override
	  public String toString() {
	        return "Passenger ID: " + passengers_id +
	               ", Name: " + pname +
	               ", Age: " + page +
	               ", Contact Info: " + c_info.toString();
	    }
	
	
	

}
