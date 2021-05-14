package AbstractDemo;

public class Circle extends Shape{
	double r;
	public Circle(double r)
	{
		this.r=r;
	}
	public double calculateArea()
	{
		return 3.14*r*r;
	}
}
