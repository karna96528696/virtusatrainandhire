package InterfaceDemo;

class Car extends MotorisedVehicle implements IPublicTransport
{
	public void drive(){
	System.out.println("car drive");
	}
	public void turnLeft(){
	System.out.println("car turn left");
	}
	public void brake(){
	System.out.println("car breake");
	}
	public void getNumberOfPeople()
	{
	System.out.println("car have no of peoples.");
	}
}
