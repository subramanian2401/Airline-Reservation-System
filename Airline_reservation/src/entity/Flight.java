package entity;

public class Flight {

	String filghtno;
	String depaturecity;
	String arrival;
	String departure_time;
	String arrival_time;

	Double ticket_price;
	
	
	public Flight(String filghtno, String depaturecity, String arrival, String departure_time, String arrival_time,
			 Double ticket_price) {
		this.filghtno = filghtno;
		this.depaturecity = depaturecity;
		this.arrival = arrival;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.ticket_price = ticket_price;
	}
	public String getFilghtno() {
		return filghtno;
	}
	public void setFilghtno(String filghtno) {
		this.filghtno = filghtno;
	}
	public String getDepaturecity() {
		return depaturecity;
	}
	public void setDepaturecity(String depaturecity) {
		this.depaturecity = depaturecity;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public Double getTicket_price() {
		return ticket_price;
	}
	public void setTicket_price(Double ticket_price) {
		this.ticket_price = ticket_price;
	}
	@Override
	public String toString() {
		return "Flight [filghtno=" + filghtno + ", depaturecity=" + depaturecity + ", arrival=" + arrival
				+ ", departure_time=" + departure_time + ", arrival_time=" + arrival_time + ", ticket_price="
				+ ticket_price + "]";
	}
	
	

	
	
	
}
