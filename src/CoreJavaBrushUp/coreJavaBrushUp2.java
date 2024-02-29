package CoreJavaBrushUp;

public class coreJavaBrushUp2 {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,8,9,10,122};
		
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i])%2==0)//This code will give you the multiple of 2 values
			{
				System.out.println(arr[i]);
				break;//This command will execute when one condition is true.
			}
			else
			{
				System.out.println(arr[i]+ "  is not multiple by 2");
			}
			
		}

	}

}
