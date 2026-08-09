package Lec1;

public class Increment_Decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
//		System.out.println(x++);// 8
//		System.out.println(x);// 9
//		System.out.println(--x);// 7
//		System.out.println(x);// 7
//		int c = ++x - --x + x++ - x--;// 0
		int c = ++x + x-- + x++ + --x;

	}

}
