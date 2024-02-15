package DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import entity.Flight;
import entity.Passengers;
import entity.Reservation;

public interface Airline_repo {
	 ArrayList<Passengers> passengers = new ArrayList<>();
     ArrayList<Flight> flights = new ArrayList<>();
     HashMap<String,Reservation> h1=new HashMap<String,Reservation>();
     LinkedHashMap<Integer,Passengers> economyClass=new LinkedHashMap<Integer,Passengers>();
 	LinkedHashMap<Integer,Passengers> businessClass=new LinkedHashMap<Integer,Passengers>();
 	LinkedHashMap<Integer,Passengers> firstClass=new LinkedHashMap<Integer,Passengers>();
 	
	
     

}
