package com.src;

class Vehicle{
	int vehicleNumber;
	String model,companyName;
	int noOfWheels;
	double price;
	
	
	Vehicle(int vehicleNumber, String model, String companyName, int noOfWheels, double price) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.companyName = companyName;
		this.noOfWheels = noOfWheels;
		this.price = price;
	}


	int getVehicleNumber() {
		return this.vehicleNumber;
	}


	void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}


	String getModel() {
		return this.model;
	}


	void setModel(String model) {
		this.model = model;
	}


	String getCompanyName() {
		return this.companyName;
	}


	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	int getNoOfWheels() {
		return this.noOfWheels;
	}


	void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}


	double getPrice() {
		return this.price;
	}


	void setPrice(double price) {
		this.price = price;
	}
	
	void display() {
		System.out.println();
		System.out.println("Vehicle Nmber:"+this.vehicleNumber);
		System.out.println("Model:"+this.model);
		System.out.println("Company Name:"+this.companyName);
		System.out.println("Number of wheels:"+this.noOfWheels);
		System.out.println("Price:"+this.price);
	}
	
	void brake() {
		System.out.println("Vehicle slows down");
		System.out.println();
	}
}
	
class bike extends Vehicle{
		 
		int noOfStand,noOfHelmet;
		String bikeCategory;
		
		
		bike(int vehicleNumber, String model, String companyName, int noOfWheels, double price, int noOfStand,
				int noOfHelmet, String bikeCategory) {
			super(vehicleNumber, model, companyName, noOfWheels, price);
			this.noOfStand = noOfStand;
			this.noOfHelmet = noOfHelmet;
			this.bikeCategory = bikeCategory;
		}


		int getNoOfStand() {
			return this.noOfStand;
		}


		void setNoOfStand(int noOfStand) {
			this.noOfStand = noOfStand;
		}


		int getNoOfHelmet() {
			return this.noOfHelmet;
		}


		void setNoOfHelmet(int noOfHelmet) {
			this.noOfHelmet = noOfHelmet;
		}


		String getBikeCategory() {
			return this.bikeCategory;
		}


		void setBikeCategory(String bikeCategory) {
			this.bikeCategory = bikeCategory;
		}
		
		void display() {
			super.display();
			System.out.println("Nmber of stand:"+this.noOfStand);
			System.out.println("Number of Helmet:"+this.noOfHelmet);
			System.out.println("Bike Category:"+this.getBikeCategory());
			System.out.println();
		}
		
		void brake() {
			System.out.println("Bike Slows down using ABS");
			System.out.println();
		}
		
		
	}

class car extends Vehicle{
	
	String hasPowerSteering;
	int driveMode;
	String parkingAssistSensor;
	car(int vehicleNumber, String model, String companyName, int noOfWheels, double price, String hasPowerSteering,
			int driveMode, String parkingAssistSensor) {
		super(vehicleNumber, model, companyName, noOfWheels, price);
		this.hasPowerSteering = hasPowerSteering;
		this.driveMode = driveMode;
		this.parkingAssistSensor = parkingAssistSensor;
	}
	String getHasPowerSteering() {
		return this.hasPowerSteering;
	}
	void setHasPowerSteering(String hasPowerSteering) {
		this.hasPowerSteering = hasPowerSteering;
	}
	int getDriveMode() {
		return this.driveMode;
	}
	void setDriveMode(int driveMode) {
		this.driveMode = driveMode;
	}
	String getParkingAssistSensor() {
		return this.parkingAssistSensor;
	}
	void setParkingAssistSensor(String parkingAssistSensor) {
		this.parkingAssistSensor = parkingAssistSensor;
	}
	
	void display()
	{
		super.display();
		System.out.println("Power Steering:"+this.getHasPowerSteering());
		System.out.println("Drive Mode:"+this.getDriveMode());
		System.out.println("Parking Assist Sensor:"+this.getParkingAssistSensor());
		System.out.println();
	}
	
	void brake() {
		System.out.println("Car slows down using Hydraulic disc brake");
		System.out.println();
	}
	
}

class bus extends Vehicle{
	
	int passagerCapacity;
	int standingCapacity;
	
	
	bus(int vehicleNumber, String model, String companyName, int noOfWheels, double price, int passagerCapacity,
			int standingCapacity) {
		super(vehicleNumber, model, companyName, noOfWheels, price);
		this.passagerCapacity = passagerCapacity;
		this.standingCapacity = standingCapacity;
	}
	
	
	int getPassagerCapacity() {
		return this.passagerCapacity;
	}
	void setPassagerCapacity(int passagerCapacity) {
		this.passagerCapacity = passagerCapacity;
	}
	int getStandingCapacity() {
		return this.standingCapacity;
	}
	void setStandingCapacity(int standingCapacity) {
		this.standingCapacity = standingCapacity;
	}
	
	void display(){
		super.display();
		System.out.println("Passanger Capacity:"+this.getPassagerCapacity());
		System.out.println("Standing Passanger Capacity:"+this.getStandingCapacity());
		System.out.println();
	}
	
	void brake() {
		System.out.println("Bus slows down using Heavy duty break");
		System.out.println();
	}
	
}


class main {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle(111,"cb350","Honda",2,250000);
		System.out.println();
		bike v2=new bike(222,"hornet","bajaj",2,300000,1,1,"Nakedbike");
		car v3=new car(333,"verna","hyundai",4,4000000,"yes",3,"no");
		bus v4=new bus(555,"khurana","BMW",8,9000000,80,30);
		
		v1.display();
		v1.brake();
		v2.display();
		v2.brake();
		v3.display();
		v3.brake();
		v4.display();
		v4.brake();
	}

}
