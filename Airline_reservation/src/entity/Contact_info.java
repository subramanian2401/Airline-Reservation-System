package entity;

public class Contact_info {
	Long Phone_no;
	String email;
	String dr_no;
	String Street;
	String city;
	
	public Contact_info(Long phone_no, String email, String dr_no, String street, String city) {
		
		Phone_no = phone_no;
		this.email = email;
		this.dr_no = dr_no;
		this.Street = street;
		this.city = city;
	}
	
	public Long getPhone_no() {
		return Phone_no;
	}
	public void setPhone_no(Long phone_no) {
		Phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Contact_info [Phone_no=" + Phone_no + ", email=" + email + ", dr_no=" + dr_no + ", Street=" + Street
				+ ", city=" + city + "]";
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getDr_no() {
		return dr_no;
	}
	public void setDr_no(String dr_no) {
		this.dr_no = dr_no;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
