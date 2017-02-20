
public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 15, 5, 12, 1, 5, 9, 12, 19 };
		int n = 8;
		int aa[] = new int[a.length];
		// boolean flg =false;
		boolean flg = false;

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (a[i] == a[j]) {
					flg = true;

				}

			}

			if (!flg) {
				System.out.println(a[i]);
			}
			flg = false;
		}

	}

}
 