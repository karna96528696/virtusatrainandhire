package AbstractDemo;

class Square extends Shape{
	double l,b;
	public Square(double l,double b)
	{
		this.l=l;
		this.b=b;
	}
	public double calculateArea()
	{
		return l*b;
	}
}