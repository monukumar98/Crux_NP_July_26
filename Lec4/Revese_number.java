package Lec4;

public class Revese_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 567;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum * 10 + rem;
			n /= 10;// n = n / 10;
		}
		System.out.println(sum);
	}

}
