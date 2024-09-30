package first;
abstract class Shape
{
	abstract void draw();//abstract method
	public void info()//normal or concrete method
	{
		
	}
}
class Rectangle extends Shape
{
	void draw() //method overriding
	{
	System.out.println("drawing rectangle");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}

public void info()
{
	System.out.println("info details");
}
}

public class Abstraction {

	public static void main(String[] args) {
		Shape s=new Rectangle();
		s.draw();
		s.info();

	}

}
