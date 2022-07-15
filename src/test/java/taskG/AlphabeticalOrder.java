package taskG;

import java.util.Arrays;

public class AlphabeticalOrder {
	public static void main(String[] args) {

		String s = "XANTHOPHYLLS";
		String str = "";
		String expected = "AHHLLNOPSTXY";

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					str = str + s.charAt(i);
				}
			}
		}
//		System.out.println(str);
		if (expected.equals(str)) {
			System.out.println("Alphabetical order is "+str);
			
		}

//		char[] st = s.toCharArray();
//		Arrays.sort(st);
//		System.out.println(st);
//		if (expected.equals(st)) {
//			System.out.println("Alphabetical order is " + st);
//		}
	}
}
