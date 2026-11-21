package Lec18;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

	public static void main(String[] args) {
		int[] coins = { 2, 3, 6, 7 };
		int amount = 7;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans= new ArrayList<>();
		Combination(coins, amount, ll, 0);

	}

	public static void Combination(int[] coins, int amount, List<Integer> ll, int idx) {
		if (amount == 0) {
			System.out.println(ll);
			return;
		}

		for (int i = idx; i < coins.length; i++) {
			if (amount >= coins[i]) {
				ll.add(coins[i]);
				Combination(coins, amount - coins[i], ll, i);
				ll.remove(ll.size()-1);

			}
		}

	}

}
