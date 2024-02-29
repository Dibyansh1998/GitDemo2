package CoreJavaBrushUp;

public class coreJavaBrushUp {
	
	public static void  main(String[] args)
	{
		
		//Whenever you create a variable then you need to assign DataType
			int num= 5; //Permeative Data Type INTEGAR Data Type
			String website= "pplifeatwork"; //Non Permeative Data Type INTEGAR Data Type
			char letter ='a';
			double  dec  = 5.99;
			boolean myCart =true;
		
			
			System.out.println(num +" is the variable as INTEGAR");
			System.out.println(website);
			System.out.println(letter);
			System.out.println(dec);
			System.err.println(myCart);
			System.out.println("I have updated the code to check in git hub repository");
			
			//Array
			int[] arr = new int[5]; 
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			arr[3]=4;
			arr[4]=5;
			
			int[] arr2 = {10,20,30,40,50};
			
//			System.out.println(arr2[2]);
			
			//For Loop
			
//		for(int i=0;i<arr2.length;i++)
//		{
//			System.out.println(arr2[i]);
//		}
		//String Array
		String[] names= {"Dibyansh","Ishu","Shubhansh","Bhumika"};
//		for(int i=0;i<names.length;i++)
//		{
//			System.out.println(names[i]);
//		}
		
		//Enhanced For Loop
		for( String s: names)
		{
			System.out.println(s);
		}
	}

}
