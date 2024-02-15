package app;

import java.util.Scanner;

import Service.Reservation_System;
import Serviceimpl.Reservation_Systemimpl;

public class Reservation_application extends Thread {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		Reservation_System r1=new Reservation_Systemimpl();
	
		while(true) {
			System.out.println("WELCOME TO AIRLINE RESERVATION SYSTEM");
			System.out.println("Menu");
			System.out.println("1)Reserve passengers \n 2)Cancel Reservation \n 3) View Reserverd seats \n 4) exit ");
			System.out.println("Enter your Choice");
			int option=in.nextInt();
			
			switch(option) {
			
			case 1:
				r1.reserveSeat();
                break;
                
			case 2:
				r1.cancelReservation();
				break;
			case 3:
				r1.viewReservedSeats();
				break;
			
			case 4:
				
                System.out.println("Thank you visit again");
				System.exit(0);
                in.close();
				break;
			default:
				System.out.println("INVALID OPTION");
			}
		}
	}
}


