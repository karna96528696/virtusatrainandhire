
package CreatingDesignPattern;

public class FactoryMain {

	public static void main(String[] args) throws Exception {
		AnimalFactory nj=new FactoryDemo();
		Animal duck=nj.GetAnimalType("Duck");
		duck.speak();
		
		Animal tiger=nj.GetAnimalType("Tiger");
		tiger.speak();
	}

}