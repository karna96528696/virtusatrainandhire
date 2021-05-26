package singletoneClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Singletone Pattern Demo***\n");
		System.out.println("Trying to make a captain for our team");
		BillPughMethod c1 = BillPughMethod.getCaptain();
		 System.out.println("Trying to make another captain for our team");
		 BillPughMethod c2 = BillPughMethod.getCaptain();
		 if (c1 == c2)
		 {
		 System.out.println("c1 and c2 are same instance");
		 }
	}

}
