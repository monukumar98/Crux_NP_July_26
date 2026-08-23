package Lec4;

import java.util.Scanner;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 0;
		while (row < n) {
			// star
			int i = 0;
			int ncr=1;
			while (i < star) {
				System.out.print(ncr+" ");
				ncr=(ncr*(row-i))/(i+1);
				i++;
			}
			// Next Row ki prep
			row++;
			System.out.println();
			star++;
		}

	}

}
