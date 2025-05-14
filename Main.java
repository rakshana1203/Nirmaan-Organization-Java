package Day_16;

class Vehicle{
	void startEngine() {
		System.out.println("Vehicle engine started");
	}
	
	
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Car is Driving");
	}
}

class ElectricCar extends Car{
	void chargeBattery() {
		System.out.println("Electric Car is charging");
	}
}

class Bike extends Vehicle{
	void kickStart() {
		System.out.println("Vehicle engine started");
		System.out.println("Bike is kick-started");
	}
}

public class Main {
	public static void main(String[] args) {
		
	
    Bike main =new Bike();
	main.startEngine();
	ElectricCar ele = new ElectricCar();
	ele.drive();
	ele.chargeBattery();
	
	main.kickStart();
	
	
	
}}
