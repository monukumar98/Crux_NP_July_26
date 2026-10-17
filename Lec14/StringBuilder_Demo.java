package Lec14;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("hey");
		sb.append(10);
		sb.append(true);
		sb.append('a');
		System.out.println(sb);
		System.out.println(sb.substring(1, 4));
		System.out.println(sb.charAt(2));
		System.out.println(sb.length());
		String s=sb.toString();
	}

}