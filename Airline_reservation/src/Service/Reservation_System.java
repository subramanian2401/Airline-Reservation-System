package Service;

import entity.Passengers;

public interface Reservation_System {
  Passengers createPasserger();
  void viewReservedSeats();
   
	void cancelReservation();
	void reserveSeat();
}

