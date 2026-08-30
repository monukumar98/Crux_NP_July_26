package Extra_Session;

import java.util.Scanner;

public class Char_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		char val='A';
		while (row <= 2 * n - 1) {
			// space
			int i = 1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			// star
			int j = 1;
			char p=val;
			while(j<=star) {
				System.out.print(p+"\t");
				if(j<star/2+1) {
				p++;
				}
				else {
					p--;
				}
				j++;
			}
			// mirror
			if(row<n) {
				star+=2;
				space--;
				val++;
			}
			else {
				star-=2;
				space++;
				val--;
			}
			// next line prep
			System.out.println();
			row++;
		}
	}

}
