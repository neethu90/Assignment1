import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e,s,temp;
		int arr[]=new int[20];
	    temp=0;
	    Scanner scan=new Scanner(System.in);
		System.out.println("enter size");
		
		
		int num=scan.nextInt();
		System.out.println("enter element");
		for( s=0;s<num;s++)
			{ 
			arr[s]=scan.nextInt();
			}
		e=s-1;
		  s=0;
	    
	  
			while(s<e)
			{
			temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			e--;
			s++;
			
			}
			
			System.out.print("reverse is");
			for( s=0;s<num;s++)
			{
				System.out.println(" " + arr[s]);
		       }
		
		
	}
	
	
}
