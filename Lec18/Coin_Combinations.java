package Lec18;

public class Coin_Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 2, 3, 1, 5 };
		int amount = 5;
		Combination(coins, amount, "",0);

	}

	public static void Combination(int[] coins, int amount, String ans,int idx) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = idx; i < coins.length; i++) {
			if (amount >= coins[i]) {
				
				Combination(coins, amount - coins[i], ans + coins[i],i);
				
			}
		}

	}
}
