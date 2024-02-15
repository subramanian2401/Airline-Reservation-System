package entity;

public class Reservation {
	String reservation_id;
	Flight flight;
	Passengers passenger;
	int Seatno;
	String date;
	public Reservation(String reservation_id, Flight flight, Passengers passenger, int seatno, String date) {
		super();
		this.reservation_id = reservation_id;
		this.flight = flight;
		this.passenger = passenger;
		Seatno = seatno;
		this.date = date;
	}
	public String getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(String reservation_id) {
		this.reservation_id = reservation_id;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Passengers getPassenger() {
		return passenger;
	}
	public void setPassenger(Passengers passenger) {
		this.passenger = passenger;
	}
	public int getSeatno() {
		return Seatno;
	}
	public void setSeatno(int seatno) {
		Seatno = seatno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
