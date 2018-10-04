package com.rakesh.Collection.MakeMyTripProject;

public class FlightDetailsPojo
{
	
	int flightNumber;
	String airlines;
	int arrivalTime;
	int departureTime;
	String cost;
	String originCity;
	String destinationCity;
	String routeType;
	
	public FlightDetailsPojo(int flightNumber, String airlines, int arrivalTime, int departureTime,
			String cost, String originCity, String destinationCity, String routeType) {
		super();
		this.flightNumber = flightNumber;
		this.airlines = airlines;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.cost = cost;
		this.originCity = originCity;
		this.destinationCity = destinationCity;
		this.routeType = routeType;
	}
	
	
	public FlightDetailsPojo(int flightNumber, String airlines) {
		
		super();
		this.flightNumber=flightNumber;
		this.airlines=airlines;
		// TODO Auto-generated constructor stub
	}


	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) 
	{
		this.flightNumber = flightNumber;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	public int getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getOriginCity() {
		return originCity;
	}
	public void setOriginCity(String originCity) {
		this.originCity = originCity;
	}
	public String getdestinationCity() {
		return destinationCity;
	}
	public void setdestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	public String getRouteType() {
		return routeType;
	}
	public void setRouteType(String routeType) {
		this.routeType = routeType;
	}


	@Override
	public String toString() {
		return "FlightDetailsPojo [flightNumber=" + flightNumber + ", airlines=" + airlines + ", arrivalTime="
				+ arrivalTime + ", departureTime=" + departureTime + ", cost=" + cost + ", originCity=" + originCity
				+ ", destinationCity=" + destinationCity + ", routeType=" + routeType + "]";
	}
	
	
	
	
	

}
