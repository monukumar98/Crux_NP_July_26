package Lec1;

public class Lottery_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 500;
		if (n >= 789 && n <= 989) {
			System.out.println("Kurkue");
		}

		else if (n >= 282 && n <= 473) {
			System.out.println("Macbook");
		} else if (n >= 100 && n <= 200) {
			System.out.println("Bike");
		} else if (n >= 50 && n <= 93) {
			System.out.println("Cycle");
		}

		else {
			System.out.println("Kuch nhi ");

		}

	}

}
