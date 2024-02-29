package CoreJavaBrushUp;

public class MethodsDemo {

	public static void main(String[] args) {
		

		MethodsDemo d= new MethodsDemo();
		d.getData();
		String name=d.getData1();
		System.out.println(name);
		MethodDemo2 d1= new MethodDemo2();
		d1.getUserData();
		d.getNumber();
		
		
	}
	public void getData()//Here Public means, we can use this method in different class
	{
		System.out.println("Hello World");
	}
	public String getData1()//Here Public means, we can use this method in different class
	{
//		System.out.println("Hello World");
		return "DibyanshVerma";
	}
	
	//If you're using Static Keyword on Method, then we don't need create the object of that class.
	
			public static String getNumber()
			{
				System.out.println("6394127923");
				return "6394127923";
				
			}

}
