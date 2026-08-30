package Extra_Session;

public class Char_Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = 2 * n - 3;
		while (row <= n) {
			char val='A';
			// star
			int i = 1;
			while (i <= star) {
				System.out.print(val+" ");
				val++;
				i++;
			}
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			// star
			int k = 1;
			val--;
			if (row == n) {
				val--;
				k = 2;
			}
			while (k <= star) {
				System.out.print(val+" ");
				val--;
				k++;
			}
			// next row ki prep
			row++;
			star++;
			space -= 2;
			System.out.println();
		}

	}

}
