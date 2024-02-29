package CoreJavaBrushUp;

public class ChildClassDemo extends ParentClassDemo {

	//Inheritance Concept to use the Extends KeyWords
	public void engine()
	{
		System.out.println("Engine is implemented");
	}
	
	public void Colour()
	{
		System.out.println(color + " is my Bicyle Color");
	}
	public static void main(String[] args) {
		ChildClassDemo c= new ChildClassDemo();
		c.Colour();
		c.AudioSystem();
		c.Break();
		c.engine();
		c.Gear();
	}
	
			

}
