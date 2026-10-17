package Lec14;

public class Wrapper_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1 = 10;
		int a = 5;
		System.out.println(a1);
		System.out.println(a);
		Long l = 91l;
		long ll = 99;
		Integer a2 = a;// Auto-Boxing
		int b = a1;// Un-Boxing

		Integer c1 = 19;
		Integer c2 = 19;
		Integer c3 = 191;
		Integer c4 = 191;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
		Character ch1='t';
		Character ch2='t';
		System.out.println(ch1==ch2);

	}

}
