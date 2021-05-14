package AbstractDemo;

abstract class Shape {
		String color;
		public abstract double calculateArea();
		public void setColor( String color)
		{
			System.out.println(color);
		}
}
