package practice;

import java.util.HashMap;
import java.util.Iterator;

public class RevUniqCharprac {

	public static void main(String[] args) {

		String s2 = "Automation project";
		String s1 = s2.toLowerCase();
		char[] s = s1.toCharArray();
		

		for (int i = 0; i < s.length; i++) {

			int count = 1;
//			String newS="";
			for (int j = i + 1; j < s.length; j++) {

				if (s[i] == s[j]) {
					count++;
//					newS=newS+s[i];
				}

			}
			if (count > 0 && count<2) {
				System.out.println(s[i] + " count is " + count);
			}
//			System.out.println(newS);
			
			
			
			
			
			
		}
		

	}

}
