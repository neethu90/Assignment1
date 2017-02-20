
public class unsortedmissingno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int[] a = { 4, 1, 5, 7, 5, 3, 10, 23 };
		int small = a[0];
		int large =a[0];
		int n = 8;
		boolean flg=false;
		
		for (int i = 0; i < n; i++) {
			if (small > a[i]) {
				small = a[i];
				
				
			}
			if (large < a[i]) {
				large = a[i];
				
				
			}
			
		}
		
		for (int k = small; k <=large; k++) {
			
			for (int i = 0; i < n; i++) {
				if(k == a[i]){
					flg =true;
				}
			}
			
			if (!flg) System.out.println(k);
			
			flg =false;
		}
		
		
		
	}
}
