package Lec7;

public class Arrays_Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 4, 5 };
//		int[] arr1 = new int []{ 10, 20, 30, 4, 5 };
		System.out.println(arr[0] + " " + arr[1]);// 10 20
		swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
