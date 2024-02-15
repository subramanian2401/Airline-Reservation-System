package Serviceimpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import DAO.Airline_repo;
import Service.Reservation_System;
import entity.Contact_info;
import entity.Passengers;

public class Reservation_Systemimpl implements Reservation_System, Airline_repo {
    Scanner in = new Scanner(System.in);

    private Map<Integer, Passengers> economyClass = new HashMap<>();
    private Map<Integer, Passengers> businessClass = new HashMap<>();
    private Map<Integer, Passengers> firstClass = new HashMap<>();

    private void mapSeat(Map<Integer, Passengers> bookseat, int seatNumber) {
        if (bookseat.get(seatNumber) == null) {
            Passengers passenger = createPasserger();
            bookseat.put(seatNumber, passenger);
            System.out.println("Seat reserved successfully!");
        } else {
            System.out.println("Sorry, the seat is already reserved.");
        }
    }
    @Override
    public void reserveSeat() {
        System.out.println("Seat Reservation");
        System.out.println("Enter the class of seats");
        System.out.println("1) Economy \t 2) Business \t 3) First Class");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Select seats from 1 to 10 ");
                System.out.println("Enter the Seat number:");
                int seat1 = in.nextInt();
                if (seat1 >= 1 && seat1 <= 10) {
                    mapSeat(economyClass, seat1);
                } else {
                    System.out.println("Enter Correct Seat Number......");
                }
                break;
            case 2:
                System.out.println("Select seats from 1 to 8 ");
                System.out.println("Enter the Seat number:");
                int seat2 = in.nextInt();
           
                if (seat2 >= 1 && seat2 <= 8) {
                    mapSeat(businessClass, seat2);
                } else {
                    System.out.println("Enter Correct Seat Number......");
                }
                break;
            case 3:
                System.out.println("Select seats from 1 to 5 ");
                System.out.println("Enter the Seat number:");
                int seat3 = in.nextInt();
                if (seat3 >= 1 && seat3 <= 5) {
                    mapSeat(firstClass, seat3);
                } else {
                    System.out.println("Enter Correct Seat Number......");
                }
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
    
    public void viewReservedSeats() {
        System.out.println("========== View Reserved Seats ==========");
        System.out.println("========== Economy Class ==========");
        viewSeats(economyClass);
        System.out.println("========== Business Class ==========");
        viewSeats(businessClass);
        System.out.println("========== First Class ===========");
        viewSeats(firstClass);
    }

    private void viewSeats(Map<Integer, Passengers> seatMap) {
        for (Map.Entry<Integer, Passengers> entry : seatMap.entrySet()) {
            Integer seatNumber = entry.getKey();
            Passengers passenger = entry.getValue();

            if (passenger != null) {
                System.out.println("Seat " + seatNumber + ": " + passenger);
            }
        }
    }
    
    public Passengers  createPasserger() {
        System.out.println("Enter passenger id");
        int id = in.nextInt();
        System.out.println("Enter passenger name:");
        String name = in.next();
        System.out.println("Enter passenger age ");
        int age = in.nextInt();
        System.out.println("Enter the Email id");
        String email = in.next();
        System.out.println("Enter passenger phone no");
        long phone_no = in.nextLong();

        System.out.println("Enter Door no:");
        String drno = in.next();
        System.out.println("Enter the Street");
        String street = in.next();
        System.out.println("Enter the City");
        String city = in.next();
        Contact_info address = new Contact_info(phone_no, email, drno, street, city);

        return new Passengers(id, name, age, address);
    }

 

    @Override
    public void cancelReservation() {
        System.out.println("========== MENU =========");
        System.out.println("1) Economy Class \t 2) Business Class \t 3) First Class");
        int option = in.nextInt();

        switch (option) {
            case 1:
                if (option >= 1 && option <= 10) {
                    unmapSeat(economyClass, option);
                } else {
                    System.out.println("INVALID");
                }
                break;
            case 2:
                if (option >= 1 && option <= 8) {
                    unmapSeat(businessClass, option);
                } else {
                    System.out.println("INVALID");
                }
                break;
            case 3:
                if (option >= 1 && option <= 5) {
                    unmapSeat(firstClass, option);
                } else {
                    System.out.println("INVALID");
                }
                break;
            default:
                System.out.println("INVALID option");
                break;
        }
    }

    private void unmapSeat(Map<Integer, Passengers> cancelseat, int seatNumber) {
        if (cancelseat.get(seatNumber) != null) {
            Passengers passenger = cancelseat.get(seatNumber);
            System.out.println(passenger);
            System.out.println(passenger.getPname() + " needs to pay " + passenger.getAmount());
            cancelseat.put(seatNumber, null);
        } else {
            System.out.println("INVALID SEAT NUMBER ..............!!!");
        }
    }
    
   


}
