package Lec13;

public class String_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		System.out.println(s1 == s3);// address compare krega
		System.out.println(s1);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s3));// content compare krega
		int [] arr= new int [3];
		System.out.println(arr.length);
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		char ch=s1.charAt(1);
	}

}

