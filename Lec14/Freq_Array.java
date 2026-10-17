package Lec14;

public class Freq_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "sasbbxmbnzvxnvnabmbscjhgfhgsfghjg";
		int [] freq = new int [26];
		for (int i = 0; i < s.length(); i++) {
			int idx=s.charAt(i)-97;
			freq[idx]++;
		}
		for (int i = 0; i < freq.length; i++) {
			System.out.print(freq[i]+" ");
		}

	}

}
