
package CreatingDesignPattern;

public class FactoryDemo extends AnimalFactory{

	@Override
	public Animal GetAnimalType(String type) throws Exception {

		switch(type)
		{
		case "Duck":
			return new Duck();
		case "Tiger":
			return new Tiger();
		default:
			throw new Exception ("Animal type : "+type + " can't be instantiated");
		}
	}
	
}