package Lec14;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "81615";
		SubString(s);

	}

	public static void SubString(String s) {
		int c = 0;
		boolean[] visited = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String str = s.substring(i, j);// i to j-1
				long n = Long.parseLong(str);
				if (IsCbnumber(n) && isivisited(visited, i, j - 1)) {
					c++;
				}
			}
		}
		System.out.println(c);
	}

	public static boolean isivisited(boolean[] visited, int si, int ei) {
		// TODO Auto-generated method stub
		for (int i = si; i <= ei; i++) {
			if (visited[i] == true) {
				return false;
			}
		}
		for (int i = si; i <= ei; i++) {
			visited[i] = true;
		}
		return true;
	}

	public static boolean IsCbnumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
