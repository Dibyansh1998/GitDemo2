package CoreJavaBrushUp;

public class defineString {

	public static void main(String[] args) {
		
		//String is an object that re-present sequence of characters.
		//How many way of write the Strings: i)String Literal //ii) New Memory using operator
		String name="Dibyansh";
		String name1="Dibyansh";
		
		String s= new String("Dibyansh");
		String s1= new String("Dibyansh");
		
		String s3="Dibyansh Verma Sarraf";
		String[] splittedString =s3.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
//		System.out.println(splittedString[1].trim());//Removing spacing to use trim
		
		//This will print String Character by Character (Left to Right)
//		for(int i=0;i<s3.length();i++)
//		{
//			System.out.println(s3.charAt(i));
//		}
		//This will print String Character by Character (Right to left)
		for(int i=s3.length()-1;i>=0;i--)
		{
			System.out.println(s3.charAt(i));
		}

	}

}
