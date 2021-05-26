package singletoneClass;

public class BillPughMethod {
	private static BillPughMethod captain;
		private BillPughMethod()
		{
			
		}
		
		private static class BillPughSingleton{
			private static final BillPughMethod captain=new BillPughMethod();
		}
		
		public static BillPughMethod getInstance()
		{
			return BillPughSingleton.captain;
		}

		public static BillPughMethod getCaptain() {
			// TODO Auto-generated method stub
			if (captain == null)
			 { captain = new BillPughMethod();
			 System.out.println("New captain selected for our team");
			 }
			 else
			 {
			 System.out.print("you already have a Captain for our team");
			 System.out.println(" send him for the toss.");
			 }
			 return captain;
		}
}
