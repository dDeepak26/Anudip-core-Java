class Area
{
	public int aprint(int a, int b)
	{
		return a*b;
	}
	public int aprint(int a)
	{
		return a*a;
	}
}
public class Usearea
{
	public static void main(String args[])
	{
		Area z=new Area();
		System.out.print("Area of Rectangle ");
		System.out.println(z.aprint(10,20));
		System.out.print("Area of Square ");
		System.out.println(z.aprint(10));
	}
}