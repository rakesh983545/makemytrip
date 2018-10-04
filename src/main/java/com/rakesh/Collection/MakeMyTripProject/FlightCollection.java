package com.rakesh.Collection.MakeMyTripProject;

import java.util.ArrayList;
import java.util.LinkedList;




public class FlightCollection {
	
	 ArrayList<FlightDetailsPojo> FlightList;
	 
	 public FlightCollection() {
		 FlightList=new ArrayList<FlightDetailsPojo>();
		}
	
	
	 public  FlightDetailsPojo addFlightDetails(FlightDetailsPojo fd)
	 {
		 FlightList.add(fd);
		 return fd;
	 }
	 public ArrayList<FlightDetailsPojo> getAllFlightDetails()
	 {
		// TODO Auto-generated method stub
		 return FlightList;
			
	}
	 public ArrayList<FlightDetailsPojo> removeFlightDetails(int flightNumber)
	 {
		 FlightList.remove(flightNumber);
		 return FlightList;
		
	 }
	 
	 public FlightDetailsPojo getByFlightNo(int flightNumber)
	 {
         for(FlightDetailsPojo fly : FlightList)
         {
        	 
                if(fly.getFlightNumber()==flightNumber){
                      return fly;
                }
         }
         throw new RuntimeException("flight doesnt exist");
  }
	 //try
	 public ArrayList<FlightDetailsPojo> updateFlightDetails(int flightNumber,int arrivalTime,int departureTime )
	 {
		 
		 
		 
		 for(FlightDetailsPojo fly : FlightList){
             if(fly.getFlightNumber()==flightNumber){
                   fly.setArrivalTime(arrivalTime);
                   fly.setDepartureTime(departureTime);
                   return FlightList;
             }     
             
		 }throw new RuntimeException("flight doesnt exist");
	 }
	 
	 
	 //try
	 
	/* public  ArrayList<FlightDetailsPojo> sortFlightByDuration()
	 {
		 FlightList.sort(FlightList1,FlightList2)->FlightList1.getDuration()-FlightList2.getDuration();
		 return FlightList;
		 
	 }
	 
	 public  ArrayList<FlightDetailsPojo> sortFlightPrice()
	 {
		 FlightList.sort(FlightList1,FlightList2)->FlightList1.getCost()-FlightList2.getCost();
		 return FlightList;
	 }
	 public  ArrayList<FlightDetailsPojo> morningFlightDetails()
	 {
		return null; 
	 }
	 public  ArrayList<FlightDetailsPojo> noonFlightDetails()
	 {
		return null; 
	 }
	 */
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlightCollection fc=new FlightCollection();
		
		//public FlightDetailsPojo(String flightNumber, String airlines, String arrivalTime, String departureTime,
		//		String cost, String originCity, String destinationCity, String routeType)
		
		fc.addFlightDetails(new FlightDetailsPojo(1,"kingfisher",4,9,"3","6","8","hgfliu"));
		fc.addFlightDetails(new FlightDetailsPojo(2,"airline",1,4,"300","mumbai","bangalore","airway"));
		fc.addFlightDetails(new FlightDetailsPojo(3,"indigo",4,8,"600","kolkata","miumbai","airway"));
		
		
		/*for(FlightDetailsPojo flightdetailspojo:fc.getAllFlightDetails() )
		{
			System.out.println(flightdetailspojo);
		}*/
		
		System.out.println(fc.getByFlightNo(2));
		
	
		/*for(FlightDetailsPojo flightdetailspojo:fc.removeFlightDetails(0))
		{
			System.out.println(flightdetailspojo);
		}*/
		
		for(FlightDetailsPojo flightdetailspojo:fc.updateFlightDetails(1,6,8) )
		{
			System.out.println(flightdetailspojo);
		}
	}



}
