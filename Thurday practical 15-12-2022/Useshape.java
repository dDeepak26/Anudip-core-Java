class Shape 
{
	public void sprint()
	{
		System.out.println("This is shape");
	}
}
class Rectangle extends Shape
{
	public void sprint()
	{
		System.out.println("This is Rectangle Shape");
	}
}
class Circle extends Shape
{
	public void sprint()
	{
		System.out.println("This is Circle Shape");
	}
}

public class Useshape
{
	public static void main(String args[])
	{
		Shape s=new Shape();
		s.sprint();
		Rectangle r=new Rectangle();
		r.sprint();
		Circle c=new Circle();
		c.sprint();
	}
}