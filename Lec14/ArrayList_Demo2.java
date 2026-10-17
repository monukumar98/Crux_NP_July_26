package Lec14;

import java.util.ArrayList;

public class ArrayList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		// add
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		int [] arr = new int [4];
		for(int x:arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		for(int x:ll) {
			System.out.print(x+" ");
		}
		System.out.println();
		
	}

}
