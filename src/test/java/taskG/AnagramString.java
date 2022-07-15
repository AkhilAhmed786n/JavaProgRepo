package taskG;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String si = "silent";
		String li = "listen";

		char[] s = si.toCharArray();
		char[] l = li.toCharArray();

		Arrays.sort(s);
		Arrays.sort(l);
		System.out.println(s);
		System.out.println(l);
		
		
		if(Arrays.equals(s, l))
		{
			System.out.println(si+" and "+li+" are anagram Strings");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}

		
	}

}
