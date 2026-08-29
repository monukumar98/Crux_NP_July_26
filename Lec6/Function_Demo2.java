package Lec6;

public class Function_Demo2 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 8;
		int b = 9;
//		int ans=Addition(b, a);
//		System.out.println(ans);
		System.out.println(val);// 100
		System.out.println(Addition(b, a));// 25
		System.out.println(val);// ??
		System.out.println("Bye");

	}

	public static int Addition(int a, int b) {

		int c = a + b;
		int val = 70;
		Function_Demo2.val = Function_Demo2.val - 5;
		return c + sub(c, a);
	}

	public static int sub(int a, int b) {

		int c = a - b;
		return c;
	}

}
