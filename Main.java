package InterfaceDemo;

public class Main {
		public static void main(String[] args)
		{
			Car n=new Car();
			n.drive();
			n.turnLeft();
			n.brake();
			IPublicTransport nj=new Car();
			nj.getNumberOfPeople();

			Train c=new Train();
			c.drive();
			c.turnLeft();
			c.brake();
			IPublicTransport i=new Train();
			i.getNumberOfPeople();

		}
}
