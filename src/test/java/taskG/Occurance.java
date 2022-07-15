package taskG;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurance {
	public static void main(String[] args) {
		String s="aPPleoRange";
		String str=s.toUpperCase();
		System.out.println(str);
		
		char[] st = str.toCharArray();
		
		Map<Character, Integer> m=new LinkedHashMap<Character, Integer>();
		for (char c : st) {
			Integer count = m.get(c);
			
			if (count==null) {
				m.put(c, 1);
			}
			else {
				m.put(c, count+1);
			}
				
		}
		System.out.println(m);
		System.out.println(m.keySet());
	}

}
