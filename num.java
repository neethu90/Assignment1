
public class num {
	public static void main(String[] args) {
		int a[]=new int[5];
		boolean flg =false;
	
		int notempty=0;
	
		for(int j=0;j<a.length;j++)
		{
			if(a[j]==notempty)
			{
				
				flg = true;
				break;
			}
		
	    }
		
		if(flg==true)
		{
	
			System.out.println("array contain a number " +notempty);
		}
		else
			System.out.println("array contain no number" );
			
}
}
