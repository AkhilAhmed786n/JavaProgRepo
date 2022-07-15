package stringProg;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class OccOfChar {
	public static void main(String[] args) {
		
		String s1="Automation Tester";
		String ss=s1.replace(" ","");
		String s2 = ss.toLowerCase();
		char[] s3 = s2.toCharArray();
		Map<Character, Integer> lhm= new LinkedHashMap();
		
		for (char s : s3) {
			Integer count = lhm.get(s);
			
			if (count==null) {
				lhm.put(s, 1);
			}
			else
			{
				lhm.put(s, count+1);
			}
		}
		System.out.println(lhm);
		System.out.println(lhm.keySet());
		Set<Character> a = lhm.keySet();
		
		
		
	}

}
