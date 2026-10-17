package Lec14;

import java.util.*;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		System.out.println(ll);
		System.out.println(ll.size());
		// add
		ll.add(10);// O(1)
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.add(1, -9);// O(N)
//		 ll.add(40);
//		 ll.add(50);
//		 ll.add(60);
//		 ll.add(70);
//		 ll.add(80);
//		 ll.add(1);
//		 ll.add(11);
//		 ll.add(-2);
		System.out.println(ll);
		// get
		System.out.println(ll.get(1));// O(1)
		// remove
		System.out.println(ll.remove(2));// O(N)
		System.out.println(ll);
		// update
		ll.set(1, 90);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
	}

}
