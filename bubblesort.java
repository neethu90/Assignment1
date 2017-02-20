
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		int n=5;
		int a[]={124,89,150,10,50};
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					
				}
				
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
			
		}

	}

}
