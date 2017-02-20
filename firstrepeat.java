//import java.util.Scanner;

public class firstrepeat {
	public static void main(String[] args) {
	int arr[] = {13,1,12,2,6,3,4,5,6,7,8,9,9,10,11,2};
	
	//
	boolean flg =false;
	
	for(int i=0; i< arr.length;i++)
	
	{
		for(int j=i+1; j< arr.length;j++)
		{
			
			if(arr[i]==arr[j])
			{


				System.out.println("first repeating element " +arr[i]);
				flg =true;
			}
			
		}
		
		 
		if(flg) break;
	}
	
	}
	
	
}
