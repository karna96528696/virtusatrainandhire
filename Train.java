package InterfaceDemo;

class Train implements IVehicle,IPublicTransport{
	public void drive(){
	System.out.println("Train starts");
	}
	public void turnLeft(){
	System.out.println("Train turn left");
	}
	public void brake(){
	System.out.println("Train breake");
	}
	public void getNumberOfPeople(){
	System.out.println("Train have no of peoples.");
	}
}