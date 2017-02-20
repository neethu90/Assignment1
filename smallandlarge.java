
public class smallandlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,6,7,1};
		int small=a[0];
		int large=a[0];
		for(int i=0;i<4;i++)
			
		{
			if(small>a[i])
			{
				small=a[i];
		}
			else if(large<a[i])
			{
				large=a[i];
			}
			
			
	}
	System.out.println(small);
	System.out.println(large);
	

	}

}
