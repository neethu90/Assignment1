
public class stringrotational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abc";
		String str2="bca";
		String temp=str1+str1;

		if(temp.contains(str2))
		{
			System.out.println("Rotationally equal");
		}
		else
		{
			System.out.println("Not Rotationally equal");
		}
	}

}
