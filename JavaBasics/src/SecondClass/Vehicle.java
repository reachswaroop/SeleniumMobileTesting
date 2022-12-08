package SecondClass;

public class Vehicle {
	double speed;

	void go(){
	
	System.out.println("This is Vehicle is moving");
	
	}
	void stop(){
		System.out.println("This is Vehicle has stopped");
	}
	
	
	public class Car extends Vehicle{
	int wheels = 4;
	int door = 4;
	}
	
	public class Bicycle extends Vehicle{
	int wheels = 2;
	int pedals = 2;
	}}


