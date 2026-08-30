package Extra_Session;

import java.util.Scanner;

public class ArmStrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Is_ArmStrong_Number(n));

	}

	public static boolean Is_ArmStrong_Number(int n) {
		int cod = Count_of_Digit(n);
		int sum = 0;
		int num=n;
		while (n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, cod));
			n=n/10;
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}

	}

	public static int Count_of_Digit(int n) {
		int c = 0;
		while (n > 0) {
			c++;
			n = n / 10;
		}
		return c;
	}

}
