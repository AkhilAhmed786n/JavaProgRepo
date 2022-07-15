package stringProg;


import java.util.LinkedHashMap;
import java.util.Map;


public class OccuranceWordInString {

	public static void main(String[] args) {
		
		String s="long live with long life with long journey";
		String[] s1 = s.split(" ");
		
		Map<String, Integer> hm=new LinkedHashMap<String, Integer>();
		
		for (String s2 : s1) {
			Integer integ = hm.get(s2);
			
			if (integ==null) {
				hm.put(s2, 1);
			}
			else
			{
				hm.put(s2, integ+1);
			}
			
		}
		
		System.out.println(hm);
		
//		for (int i = 0; i < s1.length; i++) {
//			int count=0;
//			for (int j = 0; j < s1.length; j++) {
//				if (s1[i].equals(s1[j])) {
//					count++;
//				}
//			}
//			
////			if (count>0) {
//				System.out.println(s1[i]+"===>"+count);
////			}
//		}
		
		
	}
}
